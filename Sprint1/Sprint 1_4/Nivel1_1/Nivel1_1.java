package nivel1_1;

import java.util.ArrayList;

public class Nivel1_1 {

	private ArrayList <String> meses;
	
	public Nivel1_1() {
	
		this.meses = new ArrayList<String>();
	}
	
	public ArrayList <String> getMeses(){
		return this.meses;
	}
	
	
	public void masMeses(String mes) {
		this.meses.add(mes);
	}
	
}
