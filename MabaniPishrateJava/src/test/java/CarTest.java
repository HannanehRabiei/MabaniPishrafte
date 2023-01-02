import static java.lang.System.out;

public class CarTest {


    class car{
        // Dade :
            boolean AyaMashinRoshanAst;
            boolean AyaDarMashinBazAst;



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

         void harkat(){
            // dar baste bashad va mashin roshan bashad (rule)
        if (!AyaDarMashinBazAst && AyaMashinRoshanAst)
        {
            out.println("mashin dar hal harkat ast");
        }
        else {
            out.println("mashin park ast");
        }
        }
    }
}
