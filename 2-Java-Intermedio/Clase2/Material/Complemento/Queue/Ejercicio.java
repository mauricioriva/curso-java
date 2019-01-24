import java.util.*;

public class Ejercicio{
	
	public static void main(String[] args) {
		ArrayList<String> entrada = new ArrayList<String>();
		entrada.add("1");
		entrada.add("2");
		entrada.add("3");
		System.out.println(entrada);

		ArrayDeque<String> cambio = new ArrayDeque<String>(entrada);
		ArrayList<String> salida = new ArrayList<String>();
		while(!cambio.isEmpty()){
			salida.add(cambio.removeLast());
		}

		System.out.println(salida);

		//Queue<E> colaSimple = ArrayDeque<E>();
	}
}