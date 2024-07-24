package nivel1_2;

public class CalculoDni {

	private int num;
	
	public CalculoDni(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String calculoLetra(int num) { 
		int resto = 0;
		String letra = "";
		
		resto = num % 23;
		
		String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		letra = letras[resto];
		
		letra = "comida";
		
		return letra;
	}
	
}
