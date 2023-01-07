package Khodro;

 public class Mashin {  // DRY : Don't Reapet Yourself

        // Dade :
        boolean AyaRoshanAst;
        boolean AyaDarBazAst;
        String mark;
        Ranande ranande;
        // constructor
       public Mashin() {

        }

        public Mashin(String mark){
            this.mark=mark;

        }
        // Tabe(Method) :
        public void roshan (){
            AyaRoshanAst = true;
        }
        void khamosh(){
            AyaRoshanAst = false;
        }
        void bazkardandar(){
            AyaDarBazAst = true;
        }
        void bastandar(){
            AyaDarBazAst = false;
        }
        public boolean AyaDarHalHarekatAst(){
            // dar baste bashad va mashin roshan bashad (rule)
            if (!AyaDarBazAst && AyaRoshanAst)
            {
                return true;
            }
            else {
                return false;
            }

        }
    }


