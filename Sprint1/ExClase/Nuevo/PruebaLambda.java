import java.util.ArrayList;
import java.util.List;

public class PruebaLambda {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<String>();
        palabras.add("Algo");
        palabras.add("Olga");
        palabras.add("Patata");
        palabras.add("Nada");

        List <String> O = new ArrayList<String>();

        ListaString lista1 = (q,w) -> {
            for(int i = 0; i < q.size(); i++){
                for (int x = 0; x < q.get(i).length(); x++){
                    if (q.get(i).toLowerCase().charAt(x) == 'o' ){
                        w.add(q.get(i));
                    }
                }
            }
            w.forEach(pal -> System.out.println("Palabra:  " + pal));
        };


        lista1.ordenar(palabras,O);


    }

}
