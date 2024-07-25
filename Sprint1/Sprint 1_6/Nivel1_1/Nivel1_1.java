package nivel1_1;

public class Nivel1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object object1 = new Object("A","B");
		Object object2 = new Object("C","D");
		Object object3 = new Object("E","F");

		NoGenericMethods test = new NoGenericMethods(object1,object2,object3);
		
		System.out.println(test.toString());
	}

}
