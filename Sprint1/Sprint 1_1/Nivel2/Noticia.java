package Parte1_Nivel3;

public class Noticia {
    private String titular;
    private String texto = "";
    private int puntuacion;
    private int precio;

    public Noticia(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void calcPuntuacion(){

    }
    public void calcPrecio(){

    }
}
