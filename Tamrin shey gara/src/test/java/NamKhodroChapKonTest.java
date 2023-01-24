//import khodro.Khodro;
//import khodro.Mashin;
//import khodro.Motor;
//import khodro.NamKhodroChapKon;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class NamKhodroChapKonTest {
//
//    @Test
//    void Bayad_Nam_Khodro_Chap_Konad() {
//        // Given
//        Khodro benz = new Mashin("Benz" , 120 , "Automatic");
//        Khodro volvo = new Mashin("Volvo" , 80 , "Dasti");
//        Motor motor = new Motor();
//        Kashti kashti = new Kashti();
//        Khodro[] khodroha={benz , volvo , motor , kashti};
//        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);
//
//        // When
//       String ListNamKhodroha = namKhodroChapKon.execute();
//
//       // Then
//        assertEquals("Benz-Volvo-Motor-Kashti" , ListNamKhodroha );
//    }
//}
