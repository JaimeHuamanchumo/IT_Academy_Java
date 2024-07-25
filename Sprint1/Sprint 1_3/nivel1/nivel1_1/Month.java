package nivel1_1;

public class Month {

	private String nombre;
	
	public Month(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Mes: " + this.nombre;
	}
	
}
