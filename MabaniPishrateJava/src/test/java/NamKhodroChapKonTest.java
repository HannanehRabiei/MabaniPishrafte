import Khodro.*;
import Khodro.Motor;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {
    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Kond() {
        // Given
        Khodro benz = new Mashin("Benz" ,120 , "automatic");
        Khodro volvo = new Mashin("Volvo" ,80 , "dasti");
        Khodro motor = new Khodro() {
            @Override
            public String typedande() {
                return null;
            }

            @Override
            public int gonjayeshmashin() {
                return 0;
            }
        };
        Khodro[]khodroha={benz , volvo , motor};
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);

        // When
      String Listnamkhodroha=  namKhodroChapKon.execute();
    }
}
