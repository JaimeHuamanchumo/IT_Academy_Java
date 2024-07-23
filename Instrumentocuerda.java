package nivel1;

public class Instrumentocuerda extends Instrumento{
	
	public Instrumentocuerda (String nombre, int precio) {
		super (nombre, precio);
	}

	
	public String tocar() {
		
		return "Esta sonando un instrumento de cuerda";
	}
	
	
}
