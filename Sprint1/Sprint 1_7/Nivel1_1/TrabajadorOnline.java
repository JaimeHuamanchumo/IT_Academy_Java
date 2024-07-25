package nivel1_1;

public class TrabajadorOnline extends Trabajador{
private static double internet;
	
	public TrabajadorOnline(String name, String surname, double priceph) {
		super(name,surname,priceph);
		internet = 100.0;
	}
	
	@Override
	public double calcSalary(int hours) {		
		return hours*super.getPrice() + internet;
	}
}
