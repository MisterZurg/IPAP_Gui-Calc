package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Δενθρ on 27.05.2016.
 */
public class CalcBody implements ActionListener {
    Calculator parent;
    char selectedAction = ' ';
    double currentRes = 0;

    CalcBody(Calculator parent) {
        this.parent = parent;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String displayFieldText = parent.display.getText();
        double displayValue = 0;
        if (!"".equals(displayFieldText)) {
            displayValue = Double.parseDouble(displayFieldText);
        }
        Object src = e.getSource();
        if (src == parent.buttonSum) {
            selectedAction = '+';
            currentRes = displayValue;
            parent.display.setText("");
        } else if (src == parent.buttonSub) {
            selectedAction = '-';
            currentRes = displayValue;
            parent.display.setText("");
        } else if (src == parent.buttonDiv) {
            selectedAction = '/';
            currentRes = displayValue;
            parent.display.setText("");
        } else if (src == parent.buttonMul) {
            selectedAction = '*';
            currentRes = displayValue;
            parent.display.setText("");
        } else if (src == parent.buttonClear) {
            selectedAction = 'C';
            currentRes = displayValue;
            parent.display.setText("");
        } else if (src == parent.buttonRes) {
            if (selectedAction == '+') {
                currentRes += displayValue;
                parent.display.setText("" + currentRes);
            } else if (selectedAction == '-') {
                currentRes -= displayValue;
                parent.display.setText("" + currentRes);
            } else if (selectedAction == '/') {
                currentRes /= displayValue;
                parent.display.setText("" + currentRes);
            } else if (selectedAction == '*') {
                currentRes *= displayValue;
                parent.display.setText("" + currentRes);
            }
        } else {
            String clickedButtonLabel = clickedButton.getText();
            parent.display.setText(displayFieldText + clickedButtonLabel);
        }


    }
}
