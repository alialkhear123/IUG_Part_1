/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Ali Abo Alkhear
 */
public class Printer extends JFrame {
    static JFrame frame = new JFrame("Printer");
    static JLabel label = new JLabel("Printer: MyPrinter");
    static JTextArea textArea = new JTextArea();
    static JTextArea textArea1 = new JTextArea();
    static JTextArea textArea2 = new JTextArea();
    static JCheckBox CheckBox = new JCheckBox("Image");
    static JCheckBox CheckBox1 = new JCheckBox("Text");
    static JCheckBox CheckBox2 = new JCheckBox("Code");
    static JRadioButton RadioButton = new JRadioButton("selection");
    static JRadioButton RadioButton1 = new JRadioButton("All");
    static JRadioButton RadioButton2 = new JRadioButton("Applet");
    static JButton button1 = new JButton("Ok");
    static JButton button2 = new JButton("Cancel");
    static JButton button3 = new JButton("Setup");
    static JButton button4 = new JButton("Help");
    static JLabel label2 = new JLabel("Print Quality:");
    static JCheckBox CheckBox4 = new JCheckBox("Print to File");

    public Printer() {
        
        String[] items = {"High", "..", "..", "..", ".."};
        JComboBox comboBox = new JComboBox(items);

        ButtonGroup group = new ButtonGroup();
        group.add(RadioButton);
        group.add(RadioButton1);
        group.add(RadioButton2);

        frame.add(label);
        frame.add(textArea);
        frame.add(CheckBox);
        frame.add(CheckBox1);
        frame.add(CheckBox2);
        frame.add(textArea1);
        frame.add(RadioButton);
        frame.add(RadioButton1);
        frame.add(RadioButton2);
        frame.add(textArea2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(label2);
        frame.add(comboBox);
        frame.add(CheckBox4);

        label.setBounds(30, 20, 100, 20);
        textArea.setBounds(30, 45, 50, 70);
        CheckBox.setBounds(80, 45, 60, 20);
        CheckBox1.setBounds(80, 70, 60, 20);
        CheckBox2.setBounds(80, 95, 60, 20);
        textArea1.setBounds(140, 45, 50, 70);
        RadioButton.setBounds(190, 45, 80, 20);
        RadioButton1.setBounds(190, 70, 80, 20);
        RadioButton2.setBounds(190, 95, 80, 20);
        textArea2.setBounds(270, 45, 50, 70);
        button1.setBounds(330, 10, 80, 30);
        button2.setBounds(330, 50, 80, 30);
        button3.setBounds(330, 90, 80, 30);
        button4.setBounds(330, 130, 80, 30);
        label2.setBounds(40, 110, 90, 40);
        comboBox.setBounds(140, 120, 80, 20);
        CheckBox4.setBounds(230, 120, 100, 20);

        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }
    
    
    
    
//    JPanel panel = new JPanel(new FlowLayout());

//    JLabel labelMy = new JLabel("Printer : MyPrinter");
//    JTextArea textArea = new JTextArea();
//    JTextArea textArea2 = new JTextArea();
//    JTextArea textArea3 = new JTextArea();
//    JCheckBox CheckBoxImage = new JCheckBox("Image");
//    JCheckBox CheckBoxText = new JCheckBox("Text");
//    JCheckBox CheckBoxCode = new JCheckBox("Code");
//    JRadioButton RadioButtonSelect = new JRadioButton("selection");
//    JRadioButton RadioButtonAll = new JRadioButton("All");
//    JRadioButton RadioButtonApplet = new JRadioButton("Applet");
//    JButton buttonOK = new JButton("OK");
//    JButton buttonCancel = new JButton("Cancel");
//    JButton buttonSetUp = new JButton("SetUp...");
//    JButton buttonHelp = new JButton("Help");
//    JCheckBox CheckBoxPrint = new JCheckBox("Print To File");
//    JComboBox<String> box = new JComboBox<>();
//    JLabel labelQ = new JLabel("Print Quality");
//
//    
//    JPanel panellabelMy = new JPanel(new GridLayout(3, 1, 0, 0));
//    JPanel paneltextArea = new JPanel(new GridLayout(3, 1, 0, 0));
//    JPanel panelCheckBox = new JPanel(new GridLayout(3, 1, 0, 0));
//    JPanel paneltextArea2 = new JPanel(new GridLayout(3, 1, 0, 0));
//    JPanel paneltextArea3= new JPanel(new GridLayout(3, 1, 0, 0));
//
//    public Printer() {
//        setTitle("Printer");
//        add(panellabelMy);
//        panellabelMy.add(labelMy);
//
//        add(panelCheckBox);
//        panelCheckBox.add(CheckBoxImage);
//        panelCheckBox.add(CheckBoxText);
//        panelCheckBox.add(CheckBoxCode);
//        
//        
//        
//        add(paneltextArea);
//        paneltextArea.add(textArea);
//        
//        
//        box.addItem("High");
//        box.addItem("Medium");
//        box.addItem("Low");

//        add(labelMy);
//        add(textArea);
//        add(CheckBoxImage);
//        add(CheckBoxText);
//        add(CheckBoxCode);
//        add(textArea2);
//        add(textArea3);
//        add(RadioButtonSelect);
//        add(RadioButtonAll);
//        add(RadioButtonApplet);
//        add(buttonOK);
//        add(buttonCancel);
//        add(buttonSetUp);
//        add(buttonHelp);
//        add(labelQ);
//        add(CheckBoxPrint);
//        add(box);
//        labelMy.setBounds(30, 20, 100, 20);
//        labelQ.setBounds(40, 115, 90, 20);
//        RadioButtonSelect.setBounds(175, 48, 80, 20);
//        RadioButtonAll.setBounds(175, 66, 80, 30);
//        RadioButtonApplet.setBounds(175, 87, 80, 30);
//        CheckBoxImage.setBounds(75, 48, 60, 20);
//        CheckBoxText.setBounds(75, 69, 60, 20);
//        CheckBoxCode.setBounds(75, 90, 60, 20);
//        CheckBoxPrint.setBounds(200,115, 100,20);
//        buttonOK.setBounds(305, 10, 80, 25);
//        buttonCancel.setBounds(305, 50, 80, 25);
//        buttonSetUp.setBounds(305, 85, 80, 25);
//        buttonHelp.setBounds(305, 120, 80, 25);
//        textArea.setBounds(28, 50, 43, 60);
//        textArea2.setBounds(135, 50, 43, 60);
//        textArea3.setBounds(255, 50, 43, 60);
//        box.setBounds(10, 10, 10, 20);
//        setSize(510, 250);
//        setResizable(false);
//        setLocationRelativeTo(null);
//        setLayout(new FlowLayout());
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);

    

    public static void main(String[] args) {
        new Printer();
    }

}
