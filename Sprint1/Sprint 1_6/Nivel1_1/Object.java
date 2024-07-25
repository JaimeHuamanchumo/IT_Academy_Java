package nivel1_1;

public class Object {

	private String name;
	private String user;
	
	
	public Object(String name,String user) {
		this.name = name;
		this.user = user;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
}
