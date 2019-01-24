
public class Matriz{
	
	static int matriz1 [][] = {{1,2},{3,4}};

	static int matriz2 [][] = {{4,2},{1,3}};

	static int escalar = 2;

	public static void main(String[] args) {
	
		System.out.println("\nMatriz 1:");
		imprimirMatriz(matriz1);

		System.out.println("\nMatriz 2:");
		imprimirMatriz(matriz2);

		System.out.println("\nEscalar: " + escalar);

		System.out.println("\nSuma de Matriz 1 y Matriz 2");
		imprimirMatriz(sumaMatrices(matriz1,matriz2));

		System.out.println("\nMultiplicacion de Matriz 1 y Matriz 2");
		imprimirMatriz(multMatrices(matriz1,matriz2));

		System.out.println("\nMatriz 1 por escalar: ");
		imprimirMatriz(multEscalar(escalar,matriz1));

		System.out.println("\nMatriz 2 por escalar: ");
		imprimirMatriz(multEscalar(escalar,matriz2));

		System.out.println("\nMatriz Identidad de tamaño " + escalar + "x" + escalar + ":");
		matrizIdentidad(escalar);

		System.out.println();

	}

	public static void imprimirMatriz(int arregloBi[][]){
		for (int i = 0 ; i < arregloBi.length ; i++ ) {
			System.out.print("\n|");
			for (int j = 0 ; j < arregloBi[i].length ; j++ ) {
				System.out.print(" " + arregloBi[i][j] + " ");
			}
			System.out.print("|");
		}
		System.out.println();
	}

	public static int [][] sumaMatrices(int [][] matriz1 , int [][] matriz2){
		
		int [][] matrizSumada = new int [matriz1.length][matriz2.length];
		for (int i = 0 ; i < matriz1[0].length ; i++ ) {
			for (int j = 0 ; j < matriz1.length ; j++) {
				matrizSumada [i][j] = matriz1 [i][j] + matriz2 [i][j];
			}
		}

		return matrizSumada;

	}

	public static int [][] multMatrices(int [][] matriz1 , int [][] matriz2){

		int [][] matrizMultiplicada = new int [matriz1.length][matriz2.length];
		for (int i = 0 ; i < matriz1[0].length ; i++ ) {  //Moverse en las columnas de la matriz 1
			for (int j = 0 ; j < matriz2.length ; j++ ) { //Moverse en los renglones de la matriz 2
				int a = 0;
					for (int k = 0 ; k < matriz2[0].length ; k++ ) { // for que calcula el resultado
						a = a + (matriz1[i][k] * matriz2[k][j]);	
					}
				matrizMultiplicada [i][j] = a; // y lo guarda en la posicion.
			}
		}

		return matrizMultiplicada;

	}

	//Método alternativo para multiplicacion de matrices
	public static int [][] multMatrices1(int [][] matriz1 , int [][] matriz2){

		int [][] matrizMultiplicada = new int [matriz1.length][matriz2.length];
		for (int i = 0 ; i < matriz1[0].length ; i++ ) {  //Moverse en las columnas de la matriz 1
			for (int j = 0 ; j < matriz2.length ; j++ ) { //Moverse en los renglones de la matriz 2
				for (int k = 0 ; k < matriz2[0].length ; k++ ) { // for que calcula el resultado
					matrizMultiplicada [i][j] = matrizMultiplicada [i][j] + (matriz1[i][k] * matriz2[k][j]);	
				}
			}
		}

		return matrizMultiplicada;

	}


	public static int [][] multEscalar(int escalar, int [] [] matriz){
		
		for (int i = 0 ; i < matriz.length ; i++ ) {
			for (int j = 0 ; j < matriz[i].length ; j++ ) {
				matriz [i][j] = matriz [i][j] * escalar;
			}
		}

		return matriz;

	}

	public static void matrizIdentidad(int escalar){
		
		int [][] matrizIdentidad = new int [escalar][escalar];
		for (int i = 0 ; i < matrizIdentidad[0].length ; i++ ) {
			for (int j = 0 ; j < matrizIdentidad.length ; j++ ) {
				
				if (i == j) {
					matrizIdentidad[i][j] = 1;
				} else {
					matrizIdentidad[i][j] = 0;
				}

			}
		}

		imprimirMatriz(matrizIdentidad);
	}

}