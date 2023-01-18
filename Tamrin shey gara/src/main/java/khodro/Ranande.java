package khodro;
   // outer class
public class Ranande {


    private String noeGavahiname="paye 1";
    private static String nam="Jafar";

    // none-static nested class : inner class
    public class Gavahiname{

        public void print(){
            System.out.println("class none static : ");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }
    }
    // static nested class
    public static class Staticgavahiname{
        public void print(){
            System.out.println("class static : ");
          //  System.out.println(noeGavahiname);
            System.out.println(nam);
        }

    }
}