import java.util.ArrayList;
import java.util.List;

public class PruebaLambda {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<String>();
        palabras.add("Algo");
        palabras.add("Olga");
        palabras.add("Patata");
        palabras.add("Nada");
        List<String> O = new ArrayList<String>();
        
        ListaString lista = () -> {
            for(int i = 0; i < palabras.size(); i++){
                for (int x = 0; x < palabras.get(i).length(); x++){
                    if (palabras.get(i).toLowerCase().charAt(x) == 'o' ){
                        O.add(palabras.get(i));
                    }
                }
            }
            O.forEach(pal -> System.out.println("La palabra " + pal));
        };

lista.ordenar();

    }

}
