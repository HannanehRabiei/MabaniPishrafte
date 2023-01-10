package Khodro.New;
import Khodro.SandoghDar;
import Khodro.Gearbox;
import Khodro.Ranande;
import Khodro.Khodro;

// mashin yek khodro ast : car is a vehicle
 public class Mashin extends Khodro implements SandoghDar, Gearbox {

        // Dade :
        private boolean AyaDarBazAst;
        private String mark;
        private int gonjayeshsandogh;
        private Ranande ranande;
        private String typedande;

        // constructor
       public Mashin() {

        }

        public Mashin(String mark){
            this.mark=mark;

        }

    public Mashin(String mark, int gonjayeshsandogh, String typedande) {
           this.mark=mark;
           this.gonjayeshsandogh=gonjayeshsandogh;
        this.typedande=typedande;
    }

    // Tabe(Method) :
        void bazkardandar(){
            AyaDarBazAst = true;
        }
        void bastandar(){
            AyaDarBazAst = false;
        }
        public boolean AyaDarHalHarekatAst(){
            protectedMethod();
            // dar baste bashad va mashin roshan bashad (rule)
            boolean AyaRoshanAst = false;
            if (!AyaDarBazAst && AyaRoshanAst)
            {
                return true;
            }
            else {
                return false;
            }

        }

    @Override
    public String typedande() {
        return "automatic";
    }

    @Override
    public int gonjayeshmashin() {
        return 100;
    }

    @Override
    public String getmark() {
        return mark;
    }

    public void roshan() {
    }
}


