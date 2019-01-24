import java.util.*;

public class EjercicioQueue{
	
	public static void main(String[] args) {
		
		ArrayList<String> cadena = new ArrayList<String>();
		cadena.add("hola");
		cadena.add("como");
		cadena.add("estas");

		System.out.println(cadena);

		ArrayDeque<String> cadena1 = new ArrayDeque<String>();

		for (int i = cadena.size() - 1 ; i >= 0 ; i-- ) {
			cadena1.add(cadena.get(i));
		}

		ArrayList<String> cadena2 = new ArrayList<String>(cadena1);

		System.out.println(cadena2);

	}

}