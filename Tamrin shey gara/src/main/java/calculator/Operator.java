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
    public   JButton getPlus(String plus1, JTextField textField) {
        JButton plus = new JButton("+");
        plus.setBounds(150, 50, WIDTH, HEIGHT);
        plus.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                String.valueOf((textField.getText()));
            textField.setText("");
        });
        return plus;
    }
    public  JButton getMultiply(String multiply1, JTextField textField) {
        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, WIDTH, HEIGHT);
        multiply.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                String.valueOf((textField.getText()));
            textField.setText("");
        });
        return multiply;
    }
    public  JButton getDivision(String division1, JTextField textField) {
        JButton division = new JButton("/");
        division.setBounds(150, 200, WIDTH, HEIGHT);
        division.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                 textField.getText();
            textField.setText("");
        });
        return division;
    }
    public JButton getCancel(JTextField textField) {
        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, WIDTH, HEIGHT);
        cancel.addActionListener(event -> textField.setText(""));
        return cancel;
    }
}