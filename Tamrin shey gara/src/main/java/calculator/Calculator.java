package calculator;
import static java.lang.Double.parseDouble;

public class Calculator  {

    public String plus(String firstNumber, String secondNumber) {
        double numberOne = parseDouble(firstNumber);
        double numberTwo = parseDouble(secondNumber);
        double result = numberOne + numberTwo;
        return String.valueOf(result);
    }
    public String minus(String firstNumber, String secondNumber) {
        double numberOne = parseDouble(firstNumber);
        double numberTwo = parseDouble(secondNumber);
        double result = numberOne - numberTwo;
        return String.valueOf(result);
    }
    public String multiply(String firstNumber, String secondNumber) {
        double numberOne = parseDouble(firstNumber);
        double numberTwo = parseDouble(secondNumber);
        double result = numberOne * numberTwo;
        return String.valueOf(result);
    }
    public String division(String firstNumber, String secondNumber) {
        double numberOne = parseDouble(firstNumber);
        double numberTwo = parseDouble(secondNumber);
        double result = numberOne / numberTwo;
        return String.valueOf(result);
    }
}