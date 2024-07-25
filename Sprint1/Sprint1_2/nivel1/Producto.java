package nivel1;

public class Producto {

	private String nombre;
	private int precio;
	
	public Producto (String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public int getPrecio() {
		return this.precio;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "El producto " + this.nombre +" tiene un precio de " + this.precio;
	}
}
