import java.util.*;

public class ClaseQueue{

	public static void main(String[] args) {

		ArrayList<Strng> arreglo = new ArrayString<String>();
		

		ArrayDeque<String> colaDoble = new ArrayDeque<String>();
		colaDoble.add("hola");
		System.out.println(colaDoble);

		//vamos a insertar al principio
		colaDoble.addFirst("principio");
		colaDoble.addLast("Final");
		System.out.println(colaDoble);

		//remover el primer elemento
		String cadena = colaDoble.removeFirst();
		System.out.println("Borre el elemento "+cadena);
		System.out.println(colaDoble);

		//Ver el primer elemeto sin borrarlo
		String cadenaVista = colaDoble.getFirst();
		System.out.println("Vi pero no borre el elemento "+cadenaVista);
		System.out.println(colaDoble);
	}





}