package Parte1_Nivel3;

import java.util.ArrayList;

public class Redactor {
    private String nombre;
    private final String dni;
    private double sueldos;
    private ArrayList <Noticia> noticias;

    public Redactor(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        sueldos = 1500.00;
        this.noticias = new ArrayList<Noticia>();
    }

    public String getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return sueldos;
    }
    public ArrayList<Noticia> getNoticias(){
        return this.noticias;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo){
        sueldos = sueldo;
    }
    public void setNoticas(ArrayList<Noticia>noticias){
        this.noticias = noticias;
    }

}
