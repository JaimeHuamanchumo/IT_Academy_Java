package nivel1;

public class Nivel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venta nuevaVenta= new Venta (0);
		
		System.out.println("Provem amb productes a la llista:");
		nuevaVenta.afegirProducte(new Producto ("pera", 15));
		nuevaVenta.afegirProducte(new Producto ("manzana", 20));
		
		try {
			nuevaVenta.calcularTotal();
		}catch (VentaVaciaException e) {
			System.out.println("Para hacer una venta primero tienes que añadir productos");
		}

		
		System.out.println("Sin objetos en la lista:");
		Venta SegundaVenta = new Venta(0);
		
		try {
			SegundaVenta.calcularTotal();
		}catch (VentaVaciaException e) {
			System.out.println("Para hacer una venta primero tienes que añadir productos");
		}
		
		System.out.println("Excepcion de tipo ArrayIndexOutOfBoundsException:");
		try {
			nuevaVenta.mostrarProducte(3);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error, indice no encontrado");
		}
		
		try {
			nuevaVenta.mostrarProducte(1);
			
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error, indice no encontrado");
			}		
	   }
		
	}


