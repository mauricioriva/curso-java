import java.util.Arrays;

public class EjercicioMatrices{

	static int matriz [][] =    {{1,0,0},
								 {0,1,0},
								 {0,0,1}};

	static int matriz2 [][] =   {{1,2,3},
								 {4,5,7}};

	static int matriz3 [][] =   {{1,2,3},
								 {3,4,5},
								 {6,7,8}};

	static int matriz4 [][] =   {{1,0},
								 {0,1}};

	static int matriz5 [][] =   {{1,2},
								 {3,4},
								 {7,9}};

	static int contadorMatrices = 1;

	public static void imprimirResultados(int matriz [][]){

		System.out.print("\nMatriz " + contadorMatrices + ":");
		imprimirMatriz(matriz);

		int matrizIdentidad [] [] = construyeIdentidad(matriz);

		boolean cuadrada = esCuadrada(matriz);
		boolean esIdentidad = Arrays.deepEquals(matriz,matrizIdentidad);
		int traza = obtenerTraza(matriz);
		
		if (cuadrada){
			System.out.println("-> La matriz es cuadrada.");
			System.out.println("-> La traza de la matriz es: " + traza);
		}
		
		if (esIdentidad) System.out.println("-> La matriz es la identidad.\n");

		contadorMatrices++;

		System.out.println("<----------------------->");

	}

	public static void imprimirMatriz(int arregloBi[][]){
		for (int i = 0 ; i < arregloBi.length ; i++ ) {
			System.out.print("\n|");
			for (int j = 0 ; j < arregloBi[i].length ; j++ ) {
				System.out.print(" " + arregloBi[i][j] + " ");
			}
			System.out.print("|");
		}
		System.out.println("\n");
	}

	public static boolean esCuadrada(int matriz [][]){
		for (int i = 0; i < matriz.length ; i++ ) {
			int arreglo[] = matriz[i];
			if(arreglo.length != matriz.length){
				return false;
			}
		}
		return true;
	}

	public static int [][] construyeIdentidad(int matriz [][]){
		int matrizIdentidad [][] = new int [matriz.length][matriz[0].length];
		for (int i = 0 ; i < matrizIdentidad.length ; i++ ) {
			for (int j = 0 ; j < matrizIdentidad[i].length ; j++ ) {
				if (i == j) {
					matrizIdentidad[i][j] = 1;
				} else {
					matrizIdentidad[i][j] = 0;
				}
			}
		}
		return matrizIdentidad;	
	}

	public static int obtenerTraza(int matriz [] []){
		int a = 0;
		for (int i = 0 ; i < matriz.length ; i++ ) {
			for (int j = 0 ; j < matriz[i].length ; j++ ) {
				if (i == j){
					a = a + matriz[i][j];
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		imprimirResultados(matriz);
		imprimirResultados(matriz2);
		imprimirResultados(matriz3);
		imprimirResultados(matriz4);
		imprimirResultados(matriz5);
	}

}