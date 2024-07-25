package nivel1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Nivel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List <Integer> numeros = new ArrayList<Integer>();
	numeros.add(0);
	numeros.add(1);
	numeros.add(2);
	
	List <Integer> numeros2 = new ArrayList <Integer> ();
	numeros2.addAll(numeros);
	
	ListIterator <Integer> IteracionLista  = numeros.listIterator();
	
	
	while (IteracionLista.hasNext()) {
		System.out.println(IteracionLista.next());
	}
	
	while (IteracionLista.hasPrevious()) {
		numeros2.add(IteracionLista.previous());
	}
	
	System.out.println(numeros2);
		
		
	}

}
