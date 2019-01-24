import java.util.Arrays;
import java.util.Collections;

public class ClaseArrays{
	
	public static void main(String[] args) {
		
		int numeros [] = {8,9,10,11,12,13,14,15};
		System.out.print("\nEl array declarado contiene los elementos: ");
		imprimirArray(numeros);
		System.out.println("El elemento 12 del array \"números\" se encuentra en la posición: "
							 + Arrays.binarySearch(numeros,12) + "\n");

		System.out.print("Una copia de 11 elementos del array \"numeros\" es: ");
		int numeros2 [] = Arrays.copyOf(numeros,11);
		imprimirArray(numeros2);

		System.out.print("Esta es una copia del arreglo \"numeros\", tomando los indices del 2 al 5: ");
		int numeros3 [] = Arrays.copyOfRange(numeros,2,6);
		imprimirArray(numeros3);

		int numerosCopia [] = Arrays.copyOf(numeros,8);
		System.out.println("¿Son \"numeros\" y \"numerosCopia\" arrays iguales?: " + Arrays.equals(numeros,numerosCopia) + "\n");
		System.out.println("¿Son \"numeros\" y \"numeros2\" arrays iguales?: " + Arrays.equals(numeros,numeros2) + "\n");

		System.out.print("Si rellenamos el Arrays numeros, del índice 2 al 6 obtenemos: ");
		Arrays.fill(numeros,2,7,5000);
		imprimirArray(numeros);

		System.out.println("El array \"numeros\" es: " + Arrays.toString(numeros) + "\n");

		//Tiene que se un objeto porque no puedes aplicarle metodos a un tipo primitivo.
		Integer numeros4[] = {30,9,6,11,12,2,14,16};
		System.out.println("El array desordenado tienen los elementos: " + Arrays.toString(numeros4) + "\n");
		Arrays.sort(numeros4);
		System.out.println("El array ya ordenado es: " + Arrays.toString(numeros4) + "\n");

		System.out.print("En orden inverso: ");
		Arrays.sort(numeros4,Collections.reverseOrder());
		System.out.println(Arrays.toString(numeros4) + "\n");
		
	}

	public static void imprimirArray(int array []){
		System.out.print("[");
		for (int i = 0 ; i < array.length ; i++ ) {
			if (i != (array.length - 1)) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);	
			}
		}
		System.out.print("]\n\n");
	}

}