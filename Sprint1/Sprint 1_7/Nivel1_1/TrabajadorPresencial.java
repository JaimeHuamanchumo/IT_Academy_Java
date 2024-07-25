package nivel1_1;

public class TrabajadorPresencial extends Trabajador{

	private static double fuel;
	
	public TrabajadorPresencial(String name, String surname, double priceph) {
		super(name,surname,priceph);
		fuel = 150.0;
	}
	
	@Override
	public double calcSalary(int hours) {
		return hours*super.getPrice() + fuel;
	}
}
