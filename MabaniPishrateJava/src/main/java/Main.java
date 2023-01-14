import Khodro.New.Mashin;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {  // arguments
        Mashin mashin = new Mashin();
        if (mashin.AyaDarHalHarekatAst()) {
            out.println("mashin Dar Hal Harekat Ast");
        } else {
            out.println("mashin park ast");
        }
        out.println("payan ejra");
    }
}
