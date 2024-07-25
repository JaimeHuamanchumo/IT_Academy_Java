package nivel1_2;

public class Trabajador {
	private String name;
	private String surname;
	private double priceph;
	
	public Trabajador(String name, String surname, double priceph) {
		this.name = name;
		this.surname = surname;
		this.priceph = priceph;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}

	public double getPrice() {
		return this.priceph;
	}
	
	public double calcSalary(int hours) {
		return hours*this.priceph;
	}
}
