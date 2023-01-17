import foroshande.ForoshandeMashin;
import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {
    @Test
    void Bayad_Tedad_Kol_Mashin_Hay_Forokhte_Shode_Ra_Be_Dast_Avarad() {
        ForoshandeMashin foroshande = new ForoshandeMashin();
        foroshande.foroshmashin();
        Assertions.assertEquals("1" , Mashin.tedadeforosh);


    }
}
