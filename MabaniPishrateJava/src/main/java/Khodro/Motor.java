package Khodro;

public class Motor {

    boolean AyaRoshanAst;

    public void roshan (){
        AyaRoshanAst = true;
    }
    void khamosh(){
        AyaRoshanAst = false;
    }

    public boolean AyaDarHalHarekatAst() {
        return AyaRoshanAst;
    }

}
