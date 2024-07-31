package Parte1_Nivel3;

import java.util.ArrayList;

public class Redaccion {
    private ArrayList <Redactor> redactores;

    public Redaccion (){
        this.redactores = new ArrayList<Redactor>();
    }

    public ArrayList <Redactor> getRedactores(){
        return this.redactores;
    }

    public void setRedactores(ArrayList<Redactor> redactores){
        this.redactores = redactores;
    }
}
