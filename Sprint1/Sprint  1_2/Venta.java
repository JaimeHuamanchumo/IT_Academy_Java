package nivel1;

import java.util.ArrayList;

public class Venta {

	private int precioVenta;
	private ArrayList <Producto> productos;
	
	public Venta(int precio) {
		this.precioVenta = precio;
		this.productos = new ArrayList<Producto>();
	}

	public int getPrecioVenta() {
		return this.precioVenta;
	}
	
	public ArrayList <Producto> getProductos(){
		return this.productos;
	}
	
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public void setProductos(ArrayList <Producto> productos) {
		this.productos = productos;
	}
	
	public void validarVenda(ArrayList<Producto> llistaProductes) throws VentaVaciaException {
        if (productos.isEmpty()) {
            throw new VentaVaciaException ();
        }
    }
	
	
	public void afegirProducte(Producto producto) {
		
		productos.add(producto);
	}
	
	public void calcularTotal() throws VentaVaciaException {
		
		if (productos.isEmpty()) {
			
			throw new VentaVaciaException();
		}
		
		for(Producto p: productos) {
			precioVenta+=p.getPrecio();
			
		System.out.println("Preu total de la venda " +precioVenta);
			}
	}
		


	public void mostrarProducte(int index) throws ArrayIndexOutOfBoundsException {
	
	
		if (this.productos.size()< index) {
		
			throw new ArrayIndexOutOfBoundsException ();
	
		}
		
		System.out.println(this.productos.get(index));
	
}
}
