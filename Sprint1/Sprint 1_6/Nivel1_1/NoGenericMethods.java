package nivel1_1;

public class NoGenericMethods {

	private Object object1;
	private Object object2;
	private Object objetct3;
	
	public NoGenericMethods(Object object1, Object object2, Object object3) {
		this.object1 = object1;
		this.object2 = object2;
		this.objetct3 = object3;
	}
	
	
	
	public Object getObject1() {
		return this.object1;
	}
	
	public Object getObject2() {
		return this.object2;
	}
	
	public Object getObject3() {
		return this.objetct3;
	}
	
	public void setObject1(Object object1) {
		this.object1 = object1;
	}
	
	public void setObject2(Object object2) {
		this.object2 = object2;
	}
	
	public void setObject3(Object object3) {
		this.objetct3 = object3;
	}
	
	public String toString() {
		return "Three objects:\n"
				+ "1: Object " + this.object1.getName() + " with user "+ this.object1.getUser() +"\n"
				+ "2: Object " + this.object2.getName() + " with user "+ this.object2.getUser() +"\n"
				+ "3: Object " + this.objetct3.getName() + " with user "+ this.objetct3.getUser();
	}
}
