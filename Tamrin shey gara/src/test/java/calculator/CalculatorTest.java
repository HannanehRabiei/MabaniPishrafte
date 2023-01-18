package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Kond() {
        Calculator calculator = new Calculator();

       String haselJamDoAdad = calculator.add("5.3" , "-2");

        assertEquals("3.3" , haselJamDoAdad);
    }

    @Test
    void Bayad_Do_Adad_Ra_Az_Ham_Kam_Kond() {
        Calculator calculator = new Calculator();
        String haselKamKadanDoAdad = calculator.minus("5" , "3");
        Assertions.assertEquals("2.0" , haselKamKadanDoAdad);
    }

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Zarb_Kond() {
        Calculator calculator = new Calculator();
       String haselZarbDoAdad = calculator.multiply("2" , "5");
       Assertions.assertEquals("10.0" , haselZarbDoAdad);

    }

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Taghsim_Kond() {
        Calculator calculator = new Calculator();
       String haselTaghsimDoAdad= calculator.division("10" , "5");
       Assertions.assertEquals("2.0" , haselTaghsimDoAdad);
    }
}
