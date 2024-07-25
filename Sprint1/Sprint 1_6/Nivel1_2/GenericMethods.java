package nivel1_2;

public class GenericMethods {
	
	public  <T> void GenericDisplay(T element) {
		System.out.println(element.getClass().getName() +" = "+ element);
	}
	
	
}
