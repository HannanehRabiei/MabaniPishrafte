
import Khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Kond_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        // Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");
        // When
        boolean AyaHarekatMikond = benz.AyaDarHalHarekatAst();
        volvo.roshan();
        boolean AyavolvoHarekatMikond = volvo.AyaDarHalHarekatAst();
        // Then
        assertFalse(AyaHarekatMikond);
        assertEquals(false, AyavolvoHarekatMikond);
    }
}
