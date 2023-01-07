import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
   void Mashin_Bayad_Harekat_Kond_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        mashin benz = new mashin("Benz");
        boolean AyaHarekatMikond = benz.AyaMashinDarHalHarekatAst();
        assertFalse(AyaHarekatMikond);
        mashin volvo = new mashin("Volvo");
        volvo.roshan();
        boolean AyavolvoHarekatMikond = volvo.AyaMashinDarHalHarekatAst();
        assertTrue(AyavolvoHarekatMikond);
//        // Object Mashin
//        mashin mashin = new mashin();
//        mashin.bazkardandar();
//        mashin.bastandar();
//        out.println(" dar mashin baz ast ? " + mashin.AyaDarMashinBazAst);
//        mashin.harkat();
//        out.println("--------------------------------");
//        CarTest.mashin pride = new mashin("Pride");
//        pride.roshan();
//        pride.bazkardandar();
//        pride.harkat();
    }

     class mashin {
        // Dade :
            boolean AyaMashinRoshanAst;
            boolean AyaDarMashinBazAst;
            String mark;
         // constructor
         mashin() {

             out.println(" yek mashin bedone dade sakhte shod");
         }

         mashin(String mark){
             this.mark=mark;
             out.println("yek mashin " + this.mark + " sakhte shod");
         }
        // Tabe(Method) :
         void roshan (){
            out.println("mashin roshan ast");
            AyaMashinRoshanAst = true;
        }
         void khamosh(){
            out.println("mashin khamosh ast");
            AyaMashinRoshanAst = false;
        }
        void bazkardandar(){
            out.println("dar baz ast");
            AyaDarMashinBazAst = true;
        }
         void bastandar(){
            out.println("dar baste shod");
            AyaDarMashinBazAst = false;
        }
         boolean AyaMashinDarHalHarekatAst(){
            // dar baste bashad va mashin roshan bashad (rule)
        if (!AyaDarMashinBazAst && AyaMashinRoshanAst)
        {
            out.println("mashin dar hal harkat ast");
            return true;
        }
        else {
            out.println("mashin park ast");
            return false;
        }

        }
    }
}
