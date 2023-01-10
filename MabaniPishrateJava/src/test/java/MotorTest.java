import Khodro.Motor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {

    @Test
    void Motor_Bayad_Harekat_Kond_Vaghti_Roshan_Ast() {
        // Given
        Motor motor = new Motor();

        // When
        motor.roshan();
        boolean AyaHarekatMikond = motor.AyaDarHalHarekatAst();

        // Then
        assertTrue(AyaHarekatMikond);
    }
}
