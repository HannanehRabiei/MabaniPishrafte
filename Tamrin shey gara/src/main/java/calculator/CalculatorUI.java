package calculator;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class CalculatorUI {

    public static final int WIDTH = 45;
    public static final int HEIGHT = 45;
    private static JTextField textField;
    private static String plus1;
    private static String minus1;
    private static String multiply1;
    private static String division1;


    public static void main(String... args) {

        JFrame calculatorFrame = new JFrame("Calculator");
        textField = new JTextField();
        textField.setBounds(0, 0, 150, HEIGHT);
        textField.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, WIDTH, HEIGHT);
        cancel.addActionListener(event -> textField.setText(""));
        calculatorFrame.add(cancel);

        getButton("1", 0, 50, calculatorFrame);

        getButton("2", 50, 50, calculatorFrame);

        getButton("3", 100, 50, calculatorFrame);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, WIDTH, HEIGHT);
        plus.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                plus1 = String.valueOf(parseDouble(textField.getText()));
            textField.setText("");
        });
        calculatorFrame.add(plus);

        getButton("4", 0, 100, calculatorFrame);

        getButton("5", 50, 100, calculatorFrame);

        getButton("6", 100, 100, calculatorFrame);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, WIDTH, HEIGHT);
        minus.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                minus1 = String.valueOf(parseDouble(textField.getText()));
            textField.setText("");
        });
        calculatorFrame.add(minus);

        getButton("7", 0, 150, calculatorFrame);

        getButton("8", 50, 150, calculatorFrame);

        getButton("9", 100, 150, calculatorFrame);

        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, WIDTH, HEIGHT);
        multiply.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                multiply1 = textField.getText();
            textField.setText("");
        });
        calculatorFrame.add(multiply);

        getButton(".", 0, 200, calculatorFrame);

        getButton("0", 50, 200, calculatorFrame);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, WIDTH, HEIGHT);

        equal.addActionListener(e -> {
            Calculator calculateSum = new Calculator();
            String addResult = calculateSum.add(String.valueOf(plus1), String.valueOf(parseDouble(textField.getText())));
            textField.setText(addResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator2 = new Calculator();
            String minusResult = calculator2.minus(minus1, String.valueOf(parseDouble(textField.getText())));
            textField.setText(minusResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator3 = new Calculator();
            String multiplyResult = calculator3.multiply(multiply1, textField.getText());
            textField.setText(multiplyResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator4 = new Calculator();
            String divisionResult = calculator4.division(division1, textField.getText());
            textField.setText(divisionResult);
        });
        calculatorFrame.add(equal);
        JButton division = new JButton("/");
        division.setBounds(150, 200, WIDTH, HEIGHT);
        division.addActionListener(e -> {
            if (!textField.getText().isEmpty())
                division1 = textField.getText();
            textField.setText("");
        });
        calculatorFrame.add(division);

        calculatorFrame.add(textField);
        calculatorFrame.setSize(600, 600);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);
    }

    private static void getButton(String buttonn, int xPosition, int yPosition, JFrame calculator) {
        JButton button = new JButton(buttonn);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> textField.setText(textField.getText() + button.getText()));
        calculator.add(button);
    }
}