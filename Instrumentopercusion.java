package nivel1;

public class Instrumentopercusion extends Instrumento {
	


    public Instrumentopercusion (String nombre, int precio) {
    	super(nombre,precio);
    }

    public String tocar() {
    	return "Esta sonando un instrumento de percusion";
    }

}