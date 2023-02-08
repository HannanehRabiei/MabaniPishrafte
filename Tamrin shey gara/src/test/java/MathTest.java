import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad() {
        double motaghayer = -1.5;
        double meghdarMotlagh = Math.abs(motaghayer);  // abs : static method
        Assertions.assertEquals(1.5 , meghdarMotlagh);

        Assertions.assertEquals(1 , Math.cos(0));
    }
}