import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad() {
        double motaghayer = -1.5;
        double meghdarMotlagh = Math.abs(motaghayer);
        assertEquals(1.5 , meghdarMotlagh);
        assertEquals(1,Math.cos(0));
    }
}
