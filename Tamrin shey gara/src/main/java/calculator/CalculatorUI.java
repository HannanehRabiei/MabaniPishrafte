package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JTextField jTextField;
    private static String add1;
    private static String minus1;
    private static String multiply1;
    private static String division1;

    public static void main(String... args) {

        JFrame calculator = new JFrame("Calculator");

        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,50);
        jTextField.setEditable(false);

        JButton cancle = new JButton("C");
        cancle.setBounds(150,0,50,50);
        cancle.addActionListener(event -> jTextField.setText(""));
        calculator.add(cancle);

        getButton("1", 0, 50, calculator);

        getButton("2", 50, 50, calculator);

        getButton("3", 100, 50, calculator);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);
        plus.addActionListener(e -> {
            add1= jTextField.getText();
            jTextField.setText("");
        });
        calculator.add(plus);

        getButton("4", 0, 100, calculator);

        getButton("5", 50, 100, calculator);

        getButton("6", 100, 100, calculator);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);
        minus.addActionListener(e -> {
            minus1= jTextField.getText();
            jTextField.setText("");
        });
        calculator.add(minus);

        getButton("7", 0, 150, calculator);

        getButton("8", 50, 150, calculator);

        getButton("9", 100, 150, calculator);

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,50,50);
        multiply.addActionListener(e -> {
            multiply1=jTextField.getText();
            jTextField.setText("");
        });
        calculator.add(multiply);

        getButton(".", 0, 200, calculator);

        getButton("0", 50, 200, calculator);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);

        equal.addActionListener(e -> {
                    Calculator calculator1 = new Calculator();
                    String addresult = calculator1.add(add1, jTextField.getText());
                    jTextField.setText(addresult);
                });
            equal.addActionListener(e1 -> {
            Calculator calculator2 = new Calculator();
            String minusResult=calculator2.minus(minus1 , jTextField.getText());
            jTextField.setText(minusResult);
        });
            equal.addActionListener(e2 -> {
                Calculator calculator3 = new Calculator();
                String multiplyResult = calculator3.multiply(multiply1 , jTextField.getText());
                jTextField.setText(multiplyResult);
            });
            equal.addActionListener(e3 -> {
                Calculator calculator4 = new Calculator();
                String divisionResult = calculator4.division(division1 , jTextField.getText());
                jTextField.setText(divisionResult);
            });
        calculator.add(equal);

        JButton division = new JButton("/");
        division.setBounds(150,200,50,50);
        division.addActionListener(e -> {
            division1=jTextField.getText();
            jTextField.setText("");
        });
        calculator.add(division);

        calculator.add(jTextField);
        calculator.setSize(600 , 600);
        calculator.setLayout(null);
        calculator.setVisible(true);
    }
    private static void getButton(String lable, int xPosition, int yPosition, JFrame calculator) {
        JButton button = new JButton(lable);
        button.setBounds(xPosition, yPosition,50,50);
        button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
        calculator.add(button);
    }
}
