package calculator;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class CalculatorUI {

    public static final int WIDTH = 45;
    public static final int HEIGHT = 45;
    private static JTextField jTextField;
    private static String add1;
    private static String minus1;
    private static String multiply1;
    private static String division1;


    public static void main(String... args) {

        JFrame uiCalculate = new JFrame("Calculator");
        jTextField = new JTextField();
        jTextField.setBounds(0, 0, 150, HEIGHT);
        jTextField.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, WIDTH, HEIGHT);
        cancel.addActionListener(event -> jTextField.setText(""));
        uiCalculate.add(cancel);

        getButton("1", 0, 50, uiCalculate);

        getButton("2", 50, 50, uiCalculate);

        getButton("3", 100, 50, uiCalculate);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, WIDTH, HEIGHT);
        plus.addActionListener(e -> {
            if (!jTextField.getText().isEmpty())
                add1 = String.valueOf(parseDouble(jTextField.getText()));
            jTextField.setText("");
        });
        uiCalculate.add(plus);

        getButton("4", 0, 100, uiCalculate);

        getButton("5", 50, 100, uiCalculate);

        getButton("6", 100, 100, uiCalculate);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, WIDTH, HEIGHT);
        minus.addActionListener(e -> {
            minus1 = String.valueOf(parseDouble(jTextField.getText()));
            jTextField.setText("");
        });
        uiCalculate.add(minus);

        getButton("7", 0, 150, uiCalculate);

        getButton("8", 50, 150, uiCalculate);

        getButton("9", 100, 150, uiCalculate);

        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, WIDTH, HEIGHT);
        multiply.addActionListener(e -> {
            multiply1 = jTextField.getText();
            jTextField.setText("");
        });
        uiCalculate.add(multiply);

        getButton(".", 0, 200, uiCalculate);

        getButton("0", 50, 200, uiCalculate);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, WIDTH, HEIGHT);

        equal.addActionListener(e -> {
            Calculator calculateSum = new Calculator();
            String addResult = calculateSum.add(String.valueOf(add1), String.valueOf(parseDouble(jTextField.getText())));
            jTextField.setText(addResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator2 = new Calculator();
            String minusResult = calculator2.minus(minus1, String.valueOf(parseDouble(jTextField.getText())));
            jTextField.setText(minusResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator3 = new Calculator();
            String multiplyResult = calculator3.multiply(multiply1, jTextField.getText());
            jTextField.setText(multiplyResult);
        });

        equal.addActionListener(e -> {
            Calculator calculator4 = new Calculator();
            String divisionResult = calculator4.division(division1, jTextField.getText());
            jTextField.setText(divisionResult);
        });
        uiCalculate.add(equal);
        JButton division = new JButton("/");
        division.setBounds(150, 200, WIDTH, HEIGHT);
        division.addActionListener(e -> {
            division1 = jTextField.getText();
            jTextField.setText("");
        });
        uiCalculate.add(division);

        uiCalculate.add(jTextField);
        uiCalculate.setSize(600, 600);
        uiCalculate.setLayout(null);
        uiCalculate.setVisible(true);
    }

    private static void getButton(String lable, int xPosition, int yPosition, JFrame calculator) {
        JButton button = new JButton(lable);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
        calculator.add(button);
    }
}