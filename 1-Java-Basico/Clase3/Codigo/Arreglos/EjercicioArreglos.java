import java.util.Scanner;

public class EjercicioArreglos{
	
	public static void main(String[] args) {
		
		System.out.print("\nIngresa 10 números: ");

		int arreglo1 [] = leeArreglo();

		System.out.println("\nArreglo ida: ");
		imprimeArregloIda(arreglo1);

		System.out.println("\nArreglo regreso: ");
		imprimeArregloInverso(arreglo1);

	}

	public static void imprimeArregloIda(int arreglo []){

		System.out.print("[");

		for (int i = 0 ; i < arreglo.length ; i++ ) {
			System.out.print(arreglo[i] + ", ");
		}

		System.out.println("]");
	}

	public static void imprimeArregloInverso(int arreglo []){

		System.out.print("[");

		for (int i = arreglo.length - 1 ; i >= 0 ; i-- ) {
			System.out.print(arreglo[i] + ", ");
		}

		System.out.println("]\n");

	}

	public static int[] leeArreglo(){

		int arreglo [] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0 ; i < arreglo.length ; i++ ) {
			arreglo[i] = sc.nextInt();
		}

		return arreglo;
	}

}