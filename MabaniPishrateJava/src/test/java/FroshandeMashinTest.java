import Khodro.New.Mashin;
import froshande.Froshande;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FroshandeMashinTest {
    @Test
    void Bayad_Tedad_Kole_Mashin_Haye_Frokhte_Shode_Ra_Be_Dast_Avarim() {
        Froshande hana = new Froshande();
        Froshande nima = new Froshande();

        hana.foroshandeMashin();
        hana.foroshandeMashin();
        hana.foroshandeMashin();
        hana.foroshandeMashin();
        nima.foroshandeMashin();

        Assertions.assertEquals(4,Mashin.tedadeforosh);
    }
}
