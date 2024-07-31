package Parte1_Nivel2;

public class Telefono  {
    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String tel){
        System.out.println("Se esta llamando al " + tel  );
    }


}
