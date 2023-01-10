import Khodro.*;

import Khodro.New.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {
    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Kond() {
        // Given
        Khodro benz = new Mashin("Benz" ,120 , "automatic");
        Khodro volvo = new Mashin("Volvo" ,80 , "dasti");
        Khodro kashti = new Kashti();
        Khodro motor = new Motor() {
            @Override
            public String typedande() {
                return null;
            }

            @Override
            public int gonjayeshmashin() {
                return 0;
            }
        };
        Khodro[]khodroha={benz , volvo , motor , kashti};
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);

        // When
      String Listnamkhodroha=  namKhodroChapKon.execute();
      // Then
        Assertions.assertEquals("Benz-Volvo-Motor-kashti" , Listnamkhodroha);
    }
}
