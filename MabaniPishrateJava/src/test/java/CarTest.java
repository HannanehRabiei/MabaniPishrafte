import static java.lang.System.out;

public class CarTest {

    class car{
        // Dade :
            boolean AyaMashinRoshanAst;
            boolean AyaDarMashinBazAst;



        // Tabe(Method) :
        public void roshan ;{
            out.println("mashin roshan ast");
            AyaMashinRoshanAst = true;
        }

        public void khamosh;{
            out.println("mashin khamosh ast");
            AyaMashinRoshanAst = false;

        }

        public void bazkardandar;{
            out.println("dar baz ast");
            AyaDarMashinBazAst = true;
        }

        public void bastandar;{
            out.println("dar baste shod");
            AyaDarMashinBazAst = false;
        }

        public void harkat;{
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
