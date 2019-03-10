/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ali Abo Alkhear
 */
public class Align extends JFrame {

    JCheckBox CheckBoxSnap = new JCheckBox("snap to grid");
    JCheckBox CheckBoxShow = new JCheckBox("show to grid");
    JPanel panelCheckBox = new JPanel();
    
    JLabel labelX = new JLabel("X :");
    JLabel labelY = new JLabel("Y :");
    JTextField textFieldX = new JTextField(2);
    JTextField textFieldY = new JTextField(2);
    JPanel panelText = new JPanel();
    
    JButton buttonOk = new JButton("Ok");
    JButton buttonCancel = new JButton("Cancel");
    JButton buttonHelp = new JButton("Help");
    JPanel panelButton = new JPanel();
    
    public Align() {
        
        panelCheckBox.setLayout(new GridLayout(2 , 1 , 0 , 2));
        panelCheckBox.add(CheckBoxSnap);
        panelCheckBox.add(CheckBoxShow);
        add(panelCheckBox);
        
        panelText.setLayout(new GridLayout(2 , 2 , 0 , 8));
        panelText.add(labelX);
        panelText.add(textFieldX);
        panelText.add(labelY);
        panelText.add(textFieldY);
        add(panelText);
        
        panelButton.setLayout(new GridLayout(3 , 1 , 0 , 8));
        panelButton.add(buttonOk);
        panelButton.add(buttonCancel);
        panelButton.add(buttonHelp);
        add(panelButton);
        
        setTitle("Align");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Align();

    }
}
