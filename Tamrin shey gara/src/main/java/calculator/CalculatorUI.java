package calculator;
import javax.swing.*;

import static java.lang.Double.parseDouble;

public class CalculatorUI{

    public static final int WIDTH = 45;
    public static final int HEIGHT = 45;
    private static JTextField jTextField;
    private static String add1;
    private static String minus1;
    private static String multiply1;
    private static String division1;

    public static void main(String... args) {

        JFrame calculator = new JFrame("Calculator");
        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,HEIGHT);
        jTextField.setEditable(false);

        JButton cancle = new JButton("C");
        cancle.setBounds(150,0,WIDTH,HEIGHT);
        cancle.addActionListener(event -> jTextField.setText(""));
        calculator.add(cancle);

        getButton("1", 0, 50, calculator);

        getButton("2", 50, 50, calculator);

        getButton("3", 100, 50, calculator);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,WIDTH,HEIGHT);
        plus.addActionListener(e -> {
            add1= String.valueOf(parseDouble(jTextField.getText()));
            jTextField.setText("");
        });
        calculator.add(plus);

        getButton("4", 0, 100, calculator);

        getButton("5", 50, 100, calculator);

        getButton("6", 100, 100, calculator);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,WIDTH,HEIGHT);
        minus.addActionListener(e -> {
            minus1= String.valueOf(parseDouble(jTextField.getText()));
            jTextField.setText("");
        });
        calculator.add(minus);

        getButton("7", 0, 150, calculator);

        getButton("8", 50, 150, calculator);

        getButton("9", 100, 150, calculator);

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,WIDTH,HEIGHT);
        multiply.addActionListener(e -> {
            multiply1=jTextField.getText();
            jTextField.setText("");
        });
        calculator.add(multiply);

        getButton(".", 0, 200, calculator);

        getButton("0", 50, 200, calculator);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,WIDTH,HEIGHT);

        equal.addActionListener(e -> {
                    Calculator calculator1 = new Calculator();
                    String addresult = calculator1.add(String.valueOf(add1), String.valueOf(parseDouble(jTextField.getText())));
                    jTextField.setText(addresult);
                });
            equal.addActionListener(e -> {
            Calculator calculator2 = new Calculator();
            String minusResult=calculator2.minus(minus1 , String.valueOf(parseDouble(jTextField.getText())));
            jTextField.setText(minusResult);
        });
            equal.addActionListener(e -> {
                Calculator calculator3 = new Calculator();
                String multiplyResult = calculator3.multiply(multiply1 , jTextField.getText());
                jTextField.setText(multiplyResult);
            });
            equal.addActionListener(e -> {
                Calculator calculator4 = new Calculator();
                String divisionResult = calculator4.division(division1 , jTextField.getText());
                jTextField.setText(divisionResult);
            });
        calculator.add(equal);
        JButton division = new JButton("/");
        division.setBounds(150,200,WIDTH,HEIGHT);
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
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
        calculator.add(button);
    }
}