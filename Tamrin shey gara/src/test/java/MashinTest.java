import khodro.Khodro;
import khodro.Mashin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MashinTest {
    @Test
    void mashin_bayad_harekat_kond_vaghty_dar_baste_ast_va_mashin_roshan_ast() {

        Khodro pride = new Mashin("Pride");
        boolean ayamashinharekatmikond = pride.ayadarhalharekatast();  // pride.ayamashindarhalharekatast();
        assertFalse(ayamashinharekatmikond);

        Khodro volvo = new Mashin("Volvo");
        volvo.roshan();
        boolean ayamashinvolvoharekatmikond = volvo.ayadarhalharekatast();
        assertTrue(ayamashinvolvoharekatmikond);

    }
}
