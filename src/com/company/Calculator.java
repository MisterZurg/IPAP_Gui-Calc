package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Δενθρ on 26.05.2016.
 */
public class Calculator {
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonSum = new JButton("+");
    JButton buttonClear = new JButton("C");//C

    JButton buttonDiv = new JButton("/"); //"/"
    JButton buttonSub = new JButton("-"); //"-"
    JButton buttonMul = new JButton("*");//"*"
    JButton buttonRes = new JButton("="); //"="

    JPanel wincon = new JPanel();
    JTextField display = new JTextField(30);

    Calculator() {

        BorderLayout bl = new BorderLayout();
        wincon.setLayout(bl);

        wincon.add("North", display);

        JPanel panel = new JPanel();
        GridLayout g1 = new GridLayout(4, 4);
        panel.setLayout(g1);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonRes);
        panel.add(buttonClear);

        wincon.add("Center", panel);

        JPanel panel2 = new JPanel();
        GridLayout g2 = new GridLayout(4, 1);

        panel2.setLayout(g2);
        panel2.add(buttonSub);
        panel2.add(buttonMul);
        panel2.add(buttonSum);
        panel2.add(buttonDiv);
        wincon.add("East", panel2);

        JFrame frame = new JFrame("LOLXD it's alive!!!");
        frame.setContentPane(wincon);

        frame.pack();
        frame.setVisible(true);

        CalcBody calcBody = new CalcBody(this);
        button0.addActionListener(calcBody);
        button1.addActionListener(calcBody);
        button2.addActionListener(calcBody);
        button3.addActionListener(calcBody);
        button4.addActionListener(calcBody);
        button5.addActionListener(calcBody);
        button6.addActionListener(calcBody);
        button7.addActionListener(calcBody);
        button8.addActionListener(calcBody);
        button9.addActionListener(calcBody);
        buttonClear.addActionListener(calcBody);

        buttonRes.addActionListener(calcBody);
        buttonMul.addActionListener(calcBody);
        buttonSub.addActionListener(calcBody);
        buttonSum.addActionListener(calcBody);
        buttonDiv.addActionListener(calcBody);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
