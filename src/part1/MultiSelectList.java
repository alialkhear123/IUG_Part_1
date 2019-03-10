/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Ali Abo Alkhear
 */
public class MultiSelectList extends JFrame {

    JPanel panelList = new JPanel(new FlowLayout());
    DefaultListModel list = new DefaultListModel();
    JButton buttonCopy = new JButton("Copy >>>");
    JPanel panelButton = new JPanel(new FlowLayout());

    JTextArea textArea = new JTextArea(8, 8);
    JList listM = new JList(list);
    JScrollPane listScrollPane = new JScrollPane(listM);
    JPanel panelText = new JPanel(new FlowLayout());

    public MultiSelectList() {
        
        add(panelList);
        add(panelButton);
        add(panelText);
        list.addElement(" Black ");
        list.addElement(" Blue ");
        list.addElement(" Gyan ");
        list.addElement(" Dark Gray ");
        list.addElement(" Gray ");
        list.addElement(" white ");
        list.addElement(" yellow ");
        list.addElement(" orange ");
        list.addElement(" brown ");
        list.addElement(" pink ");
        list.addElement(" purple ");
        list.addElement(" green ");

        listM.setLayoutOrientation(JList.VERTICAL);
        panelList.add(listScrollPane);

        panelButton.add(buttonCopy);

        panelText.add(textArea);
        buttonCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(listM.getSelectedValuesList().toString());

            }
        });
        setTitle("Multible Selection List");
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MultiSelectList();

    }

}
