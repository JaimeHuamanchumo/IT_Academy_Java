package Parte1_Nivel1_2;

public class Coche {

    static final String marca = "Seat"; //Se puede acceder desde el constructor pero no se puede cambiar
    final int potencia = 500; // no se puede acceder ni se puede cambiar
    static String modelo; // Se puede acceder y se puede cambiar;

    public Coche(String modelo){
        this.modelo = modelo;
    }

public static void frenar(){ //puedo importar el metodo desde main, y usar frenar a secas
        System.out.println("El vehiculo esta frenando");

}

public void acelerar(){ // se necesita acceder desde la clase Coche, con un objeto creado
        System.out.println("El vehiculo esta acelerando");
}

public String toString(){
        return "Este coche:\n" +
                "1.Marca: " + this.marca + "\n" +
                "2.Modelo: " + this.modelo + "\n"+
                "3.Potencia: " + this.potencia;
}
}
