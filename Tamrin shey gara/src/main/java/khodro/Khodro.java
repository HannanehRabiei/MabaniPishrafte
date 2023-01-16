package khodro;
import static java.lang.System.out;

public abstract class Khodro {
    boolean ayamashinroshanast;
    public void roshan(){
        out.println("mashin roshan ast");
        ayamashinroshanast=true;
    }
    void khamosh(){
        out.println("mashin khamosh ast");
        ayamashinroshanast=false;
    }

    public abstract boolean ayadarhalharekatast();


    public abstract String getmark();
}


