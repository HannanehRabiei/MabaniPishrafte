package calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Kond() {
       String haselJamDoAdad = calculator.add("2" , "3");
        assertEquals("3.3" , haselJamDoAdad);
    }
    @Test
    void Bayad_Do_Adad_Ra_Az_Ham_Kam_Kond() {
        String haselKamKadanDoAdad = calculator.minus("5" , "3");
        assertEquals("2.0" , haselKamKadanDoAdad);
    }
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Zarb_Kond() {
       String haselZarbDoAdad = calculator.multiply("2" , "5");
       assertEquals("10.0" , haselZarbDoAdad);
    }
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Taghsim_Kond() {
       String haselTaghsimDoAdad= calculator.division("10" , "5");
       assertEquals("2.0" , haselTaghsimDoAdad);
    }
}