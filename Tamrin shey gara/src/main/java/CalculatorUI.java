import javax.swing.*;

public class CalculatorUI {
    public static void main(String... args) {

        JFrame calculator = new JFrame("Calculator");

        JTextField result = new JTextField();
        result.setBounds(0,0,200,50);
        result.setEnabled(false);

        JButton one = new JButton("1");
        one.setBounds(0,50,50,50);
        calculator.add(one);

        JButton two = new JButton("2");
        two.setBounds(50,50,50,50);
        calculator.add(two);

        JButton three = new JButton("3");
        three.setBounds(100,50,50,50);
        calculator.add(three);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);
        calculator.add(plus);

        JButton four = new JButton("4");
        four.setBounds(0,100,50,50);
        calculator.add(four);

        JButton five = new JButton("5");
        five.setBounds(50,100,50,50);
        calculator.add(five);

        JButton six = new JButton("6");
        six.setBounds(100,100,50,50);
        calculator.add(six);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);
        calculator.add(minus);

        JButton seven = new JButton("7");
        seven.setBounds(0,150,50,50);
        calculator.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(50,150,50,50);
        calculator.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(100,150,50,50);
        calculator.add(nine);

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,50,50);
        calculator.add(minus);

        JButton point = new JButton(".");
        point.setBounds(0,200,50,50);
        calculator.add(point);

        JButton zero = new JButton("0");
        zero.setBounds(50,200,50,50);
        calculator.add(zero);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);
        calculator.add(equal);

        JButton division = new JButton("/");
        division.setBounds(150,50,50,50);
        calculator.add(division);

        calculator.add(result);
        calculator.setSize(600 , 600);
        calculator.setLayout(null);
        calculator.setVisible(true);


    }
}
