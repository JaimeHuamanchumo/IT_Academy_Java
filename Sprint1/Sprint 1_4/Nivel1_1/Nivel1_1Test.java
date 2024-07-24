package nivel1_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Nivel1_1Test {

	@Test
	void test() {
		 
		Nivel1_1 ejemplo = new  Nivel1_1();
		
		 ejemplo.masMeses("Enero");
		 ejemplo.masMeses("Febrero");
		 ejemplo.masMeses("Marzo");
		 ejemplo.masMeses("Abril");
		 ejemplo.masMeses("Mayo");
		 ejemplo.masMeses("Junio");
		 ejemplo.masMeses("Julio");
		 ejemplo.masMeses("Agosto");
		 ejemplo.masMeses("Septiembre");
		 ejemplo.masMeses("Octubre");
		 ejemplo.masMeses("Noviembre");
		 ejemplo.masMeses("Diciembre");
		 
			assertEquals("Agosto", ejemplo.getMeses().get(7));

	}
}
