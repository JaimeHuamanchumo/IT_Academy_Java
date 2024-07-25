package nivel1_1;

public class Nivel1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrabajadorOnline smt = new TrabajadorOnline("A","B",15.0);
		Trabajador smt1 = new Trabajador("A","B",15.0);
		TrabajadorPresencial smt2 = new TrabajadorPresencial("A","B",15.0);
		
		System.out.println(smt.calcSalary(10) +" "+ smt1.calcSalary(10)+ " " + smt2.calcSalary(10));
		


		
	}

}
