package Parte1_Nivel1_2;

import static Parte1_Nivel1_2.Coche.frenar;

public class Nivel1_2 {
    public static void main(String[] args) {


        Coche coche = new Coche ("Algo");

        Coche.modelo = "CP4";
        frenar();
        coche.acelerar();
        System.out.println(coche.toString());



    }
}
