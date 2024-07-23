package nivel1;

public class Instrumentoviento extends Instrumento{

	public Instrumentoviento (String nombre, int precio) {
		super (nombre, precio);
	}
	
	public String tocar() {
		return "Esta sonando un instumento de viento";
	}
}
