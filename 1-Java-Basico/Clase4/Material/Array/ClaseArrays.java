import java.util.Arrays;
import java.util.Collections; 

//Documentación completa de la clase Arrays en:
//https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class ClaseArrays{
	public static void main(String[] args) {
		int numeros[] = {8,9,10,11,12,13,14,15};
		System.out.print("El array declarado contiene los elementos: ");
		imprimirArray(numeros);
		System.out.println("\n");
		//Arrays.binarySearch(array, elemento a buscar)
		System.out.println("El elemento 12 del array 'números' se encuentra en la posición: "+Arrays.binarySearch(numeros,12)+"\n");

		//Si queremos acceder a un elemento e imprimirlo:
		System.out.println("\nEl cuarto elemento del array es: "+numeros[3]+"\n");

		//Método copyOf: tipo nombre[]=Arrays.copyOf(array, número de elementos a copiar)
		System.out.println("Una copia de 11 elementos del array declarado anteriormente es:");
		int numeros2[] = Arrays.copyOf(numeros,11);
		imprimirArray(numeros2);
		System.out.println("\n");

		//Método copyOfRange
		int numeros3[] = Arrays.copyOfRange(numeros,2,6);
		System.out.println("Esta es una copia del arreglo 'numeros', tomando los índices del 2 al 5:");
		imprimirArray(numeros3);
		System.out.println("\n");

		//Método equals
		//Primero crearemos una copia idéntica de numeros
		int numerosCopia[] = Arrays.copyOf(numeros,8);
		//Ahora vamos a comprobar si son iguales
		System.out.println("Son numeros y numerosCopia Arrays iguales? "+Arrays.equals(numeros,numerosCopia));
		//Y también vamos a comprobar qué ocurre si se comparan Arrays distintos
		System.out.println("Son numeros y numeros2 Arrays iguales? "+Arrays.equals(numeros,numeros2));


		//Método fill
		System.out.println("\nSi rellenamos el Array numeros, del índice dos al seis obtenemos: ");
		Arrays.fill(numeros,2,7,50000);
		imprimirArray(numeros);
		System.out.println("");

		//Método toString
		//Para convertir imprimir fácilmente un Array
		System.out.println("\nEl array numeros es:\n"+Arrays.toString(numeros));

		//Método sort
		//Declaramos un Array desordenado:
		Integer numeros4[] = {30,9,6,11,12,2,14,6}; //se usa la clase envolvente Integer para poder hacer uso de Collections.reverseOrder(), que no admite tipos primitivos
		System.out.print("\nEl array desordenado declarado contiene los elementos: ");
		System.out.println(Arrays.toString(numeros4));
		//Ahora, usamos el método sort para ordenarlo:
		Arrays.sort(numeros4);
		System.out.println("Ya ordenado, el arreglo es: ");
		System.out.println(Arrays.toString(numeros4));
		System.out.println("Y en orden descendente:");
		Arrays.sort(numeros4, Collections.reverseOrder());
		System.out.println(Arrays.toString(numeros4));

	}

	public static void imprimirArray(int num[]){
     
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
         System.out.println("\n");
    }

}
