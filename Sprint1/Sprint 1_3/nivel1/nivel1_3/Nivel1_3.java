package nivel1_3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Nivel1_3 {

	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int puntuacion = 0;
		int intentos = 0;
		String persona = "";
		String paisrandom ="";
		String capital = "";
		
		Map <String, String> Lista = Mapas();
		
		System.out.println("Nombre de la persona");
		persona = sc.next();
		
		
		do {
		
		paisrandom = paisAleatorio(Lista);
		
		System.out.println("Capital de: " + paisrandom);
		
		capital = sc.next();
		
		if (capital.equalsIgnoreCase(Lista.get(paisrandom))) {
			System.out.println("Correcto, 1 punto mas");
			puntuacion++;
			intentos++;
		} else {
			System.out.println("Incorrecto, no ganas un punto");
			intentos++;
		}
		
		} while (intentos <= 10); 
		
		puntuacionFinal(persona,puntuacion);
	}
	
	
	public static Map <String,String> Mapas() {
		Map <String,String> Referencia = new HashMap <> (); 
		BufferedReader lector = null;
		try {
			FileReader archivo = new FileReader("countries.txt");
 			if (archivo.ready()) {
 				 lector = new BufferedReader(archivo);
 				 String cadena; // para ir acumulando la cadena de textos;
 				 while ((cadena = lector.readLine()) != null) {
 					 String [] paises = cadena.split (""); 
 					 if (paises.length == 2) {
 						 String pais = paises[0].trim();
 						 String ciudad = paises[1].trim();
 						 Referencia.put(pais, ciudad);
 					 }
 				 }
			} else {
				System.out.println("No se puede leer el archivo, no esta listo para ser leido");
			}
		} catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				lector.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return Referencia;
	}
	
	public static String paisAleatorio(Map<String,String> mapas) {
		String pais ="";
		
		Random random = new Random();
		int numrandom = random.nextInt(mapas.size());
		pais = (String) mapas.keySet().toArray()[numrandom];
		
		
		return pais;
	}
	
	public static void puntuacionFinal(String persona, int puntuacion) {
		try (FileWriter listaPuntuacion = new FileWriter("classificacio.txt", true)){
			listaPuntuacion.write(persona + puntuacion +"\n");
		} catch(IOException e) {
			e.printStackTrace();
		}
			
	}
}
