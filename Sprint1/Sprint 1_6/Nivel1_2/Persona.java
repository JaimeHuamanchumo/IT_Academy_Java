package nivel1_2;

public class Persona {

	private String name;
	private String surname;
	private int age;
	
	public Persona(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return this.name + this.surname + this.age;
		
	}
}
