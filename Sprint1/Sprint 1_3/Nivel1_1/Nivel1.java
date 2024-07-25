package nivel1_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Nivel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Month> meses = new ArrayList <Month>();
		
		Month enero = new Month ("enero");
		Month febrero = new Month ("febrero");
		Month marzo = new Month ("marzo");
		Month abril = new Month ("abril");
		Month mayo = new Month ("mayo");
		Month junio = new Month ("junio");
		Month julio = new Month ("julio");
		Month agosto = new Month ("agosto");
		Month septiembre = new Month ("septiembre");
		Month octubre = new Month ("octubre");
		Month noviembre = new Month ("noviembre");
		Month diciembre = new Month ("diciembre");
		
		meses.add(enero);
		meses.add(febrero);
		meses.add(marzo);
		meses.add(abril);
		meses.add(mayo);
		meses.add(junio);
		meses.add(julio);
		meses.add(septiembre);
		meses.add(octubre);
		meses.add(noviembre);
		meses.add(diciembre);
		meses.add(7,agosto); // comenzamos desde el mes 0
		
		System.out.println(meses.toString()); //comprobamos que la lista esta en un orden correcto
		
		HashSet <Month> meses2 = new HashSet <Month>();
		
		meses2.add(enero);
		meses2.add(febrero);
		meses2.add(marzo);
		meses2.add(abril);
		meses2.add(mayo);
		meses2.add(junio);
		meses2.add(julio);
		meses2.add(septiembre);
		meses2.add(octubre);
		meses2.add(noviembre);
		meses2.add(diciembre);
		meses2.add(diciembre);
		meses2.add(agosto);
		
		System.out.println(meses2.toString()); // comprobamos que no permite duplicados
		
		
		// con un for each
		for (Month mes : meses2) {
			System.out.println(mes.toString());
		}
		
		
		// con un iterador
		Iterator <Month> mesis = meses2.iterator();
		
		while (mesis.hasNext()) {
		System.out.println(mesis.next().toString());
		}
	}

}
