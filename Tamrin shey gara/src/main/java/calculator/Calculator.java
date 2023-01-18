package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {

    public String add(String adad1, String adad2) {
        double d1 = parseDouble(adad1) ;
        double d2 = parseDouble(adad2) ;
        double result = d1 + d2;
        return String.valueOf(result);
    }

    public String minus(String adad1, String adad2) {
        double d1 = parseDouble(adad1) ;
        double d2 = parseDouble(adad2) ;
        double result = d1 - d2;
        return String.valueOf(result);
    }

    public String multiply(String adad1, String adad2) {
        double d1 = parseDouble(adad1);
        double d2 = parseDouble(adad2);
        double result = d1 * d2;
        return String.valueOf(result);
    }

    public String division(String adad1, String adad2) {
        double d1 = parseDouble(adad1);
        double d2 = parseDouble(adad2);
        double result = d1 / d2;
        return String.valueOf(result);
    }
}

