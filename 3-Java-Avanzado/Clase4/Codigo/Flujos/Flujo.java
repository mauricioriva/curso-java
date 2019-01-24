import java.util.*;
import java.util.stream.Collectors;

public class Flujo{

    static List<Integer> lista = new ArrayList<Integer>();
    static List<String> lista2 = new ArrayList<String>();

    public static void main(String[] args) {
        
        List<Integer> listaResultado = null;
        Random rd = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(rd.nextInt(30)); //Genera numeros del 0 al 29
        }

        listaResultado = lista.stream().filter(a -> Integer.valueOf(a) > 15).collect(Collectors.toList());

        System.out.println(listaResultado);

        List<String> lr = null;

        lista2.add("Mexico");
        lista2.add("Canada");
        lista2.add("Marruecos");
        lista2.add("Chile");
        lista2.add("Canada");
        lista2.add("Mexico");

        lr = lista2.stream().filter(s -> s.charAt(0) == 'M').collect(Collectors.toList());

        System.out.println(lr);

        lr = lista2.stream().distinct().collect(Collectors.toList());

        System.out.println(lr);

    }

}