/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *
 * @author Ali Abo Alkhear
 */
public class Calculater extends JFrame{
    
    JPanel panel = new JPanel(new FlowLayout());
    JTextArea text = new JTextArea(2, 20);

    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonZero = new JButton("0");
    JButton buttonDot = new JButton(".");
    JButton buttonAdd = new JButton("+");
    JButton buttonSub = new JButton("-");
    JButton buttonMulti = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonEq = new JButton("=");

    public Calculater() {
        setTitle("Calculater");
        Dimension d = new Dimension(200, 200);
        setSize(d);
        setResizable(false);
        setLocationRelativeTo(null);
        add(panel);
        panel.add(text);
        panel.add(buttonSeven);
        panel.add(buttonEight);
        panel.add(buttonNine);
        panel.add(buttonDiv);
        panel.add(buttonFour);
        panel.add(buttonFive);
        panel.add(buttonSix);
        panel.add(buttonMulti);
        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonSub);
        panel.add(buttonZero);
        panel.add(buttonDot);
        panel.add(buttonEq);
        panel.add(buttonAdd);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     public static void main(String[] args) {
        new Calculater();
    }

}
