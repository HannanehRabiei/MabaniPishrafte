package calculator;
import static java.lang.Double.parseDouble;

public class Calculator {

    public String plus(String firstNumber, String secondNumber) {
        double d1 = parseDouble(firstNumber);
        double d2 = parseDouble(secondNumber);
        double result = d1 + d2;
        return String.valueOf(result);
    }
    public String minus(String firstNumber, String secondNumber) {
        double d1 = parseDouble(firstNumber);
        double d2 = parseDouble(secondNumber);
        double result = d1 - d2;
        return String.valueOf(result);
    }
    public String multiply(String firstNumber, String secondNumber) {
        double d1 = parseDouble(firstNumber);
        double d2 = parseDouble(secondNumber);
        double result = d1 * d2;
        return String.valueOf(result);
    }
    public String division(String firstNumber, String secondNumber) {
        double d1 = parseDouble(firstNumber);
        double d2 = parseDouble(secondNumber);
        double result = d1 / d2;
        return String.valueOf(result);
    }
}