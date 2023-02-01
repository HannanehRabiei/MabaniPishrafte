package calculator;
import javax.swing.*;
import static calculator.CalculatorUI.HEIGHT;
import static calculator.CalculatorUI.WIDTH;

public class Operator {

     public JButton getMinus(String minus, JTextField textField) {
        JButton minusButton = new JButton(minus);
        minusButton.setBounds(150, 100, WIDTH, HEIGHT);
        minusButton.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                 String.valueOf((textField.getText()));
            textField.setText("");
        });
        return minusButton;
    }
    public   JButton getPlus(String plus, JTextField textField) {
        JButton plusButton = new JButton(plus);
        plusButton.setBounds(150, 50, WIDTH, HEIGHT);
        plusButton.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                String.valueOf((textField.getText()));
            textField.setText("");
        });
        return plusButton;
    }
    public  JButton getMultiply(String multiply, JTextField textField) {
        JButton multiplyButton = new JButton(multiply);
        multiplyButton.setBounds(150, 150, WIDTH, HEIGHT);
        multiplyButton.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                String.valueOf((textField.getText()));
            textField.setText("");
        });
        return multiplyButton;
    }
    public  JButton getDivision(String division, JTextField textField) {
        JButton divisionButton = new JButton(division);
        divisionButton.setBounds(150, 200, WIDTH, HEIGHT);
        divisionButton.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                 textField.getText();
            textField.setText("");
        });
        return divisionButton;
    }
    public JButton getCancel(String cancle , JTextField textField) {
        JButton cancelButton = new JButton(cancle);
        cancelButton.setBounds(150, 0, WIDTH, HEIGHT);
        cancelButton.addActionListener(event -> textField.setText(""));
        return cancelButton;
    }
}