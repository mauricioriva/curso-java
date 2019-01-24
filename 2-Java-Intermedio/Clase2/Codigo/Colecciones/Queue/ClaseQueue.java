import java.util.*;

public class ClaseQueue{
	
	public static void main(String[] args) {
		
		ArrayDeque<String> colaDoble = new ArrayDeque<String>();
		colaDoble.add("hola");
		System.out.println(colaDoble);

		//Vamos a insertar al principio
		colaDoble.addFirst("principio");

		//Insertar al final
		colaDoble.addLast("final"); //es lo mismo que add()

		System.out.println(colaDoble);

		//Remover el primer elemento
		colaDoble.removeFirst();
		
		String principio = colaDoble.getFirst();
		System.out.println("El primer elemento es: " + principio);

		//Remover el ultimo elemento
		colaDoble.removeLast();
		System.out.println(colaDoble);

		

	}

}