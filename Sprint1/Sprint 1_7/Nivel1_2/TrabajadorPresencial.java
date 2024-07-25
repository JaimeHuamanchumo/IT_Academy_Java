package nivel1_2;

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
	
	@Deprecated
	public double DeprecatedMethod() {
		/*
		 * There is no longer a bonus payments for meals inside the 
		 * company for the employees 
		 */
		double bonusMeal = 50.0;
		
		return bonusMeal;
		
	}
	
}
