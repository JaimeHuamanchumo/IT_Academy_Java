package nivel1;

public abstract class Instrumento {
	
	private String nombre;
	private int precio; 
	
	public Instrumento (String nombre, int precio) {
		nombre = this.nombre;
		precio = this.precio;
	}

	
	public abstract String tocar();
	
}
