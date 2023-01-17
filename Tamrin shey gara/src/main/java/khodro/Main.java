package khodro;

import khodro.Mashin;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {

        for (int index = 0; index < args.length; index++) {
            out.println(args[index]);
        }

        String mark = args[0];
        String gonjayeshsandough = args[1];
        String noeDande = args[2];
        Mashin mashin = new Mashin(mark, parseInt(gonjayeshsandough), noeDande);
        if (mashin.ayadarhalharekatast()){
            out.println("mashin dar hal harekat ast");
        }else {
            out.println("mashin park ast");
        }
        out.println(mashin.getmark());

        Scanner scanner = new Scanner(System.in);
        out.println("enter your name : ");
        String name = scanner.nextLine();

        out.println("enter your age : ");
        String age = scanner.nextLine();

        out.println("my name is " + name + " i'm " + age + " years old");
        out.println("payan ejra");
    }

}
