package khodro;

import static java.lang.System.out;

public  class Mashin extends Khodro implements Gearbox,Sandoughdar {

    // Dade
    boolean ayadarmashinbazast;   // default : false
    String mark;
    int gonjayeshSandough;
    String noeDande;
    // constructor
   public Mashin(){
        out.println("yek mashin bedone dade sakhte shod");
    }
     public Mashin(String mark){
        this.mark=mark;
        out.println("yek mashine " + this.mark + " sakhte shod");
    }

    public Mashin(String mark, int gonjayeshSandough, String noeDande) {
        this.mark=mark;
        this.gonjayeshSandough=gonjayeshSandough;
        this.noeDande=noeDande;
    }

    // Method

    void bazkardandar(){
        out.println("dar mashin baz ast");
        ayadarmashinbazast=true;
    }
    void bastandar(){
        out.println("dar mashin baste shod");
        ayadarmashinbazast=false;
    }
    public boolean ayadarhalharekatast(){

        if (!ayadarmashinbazast && ayamashinroshanast){
            out.println("mashin dar hal harekat ast");
            return true;
        }else {
            out.println("mashin park ast");
            return false;
        }

    }

    @Override
    public String getmark() {
        return mark;
    }

    @Override
    public String typedande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshsandough() {
        return 100;
    }
}

