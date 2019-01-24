public class Matriz{
	static int matriz1[][] = {{1,2},{5,6}};
	static int matriz2[][] = {{5,7},{6,1}};
	static int matriz3[][] = {{1,2},{5,6}};
	static int [][] matrizResultante= new int [2][2];
	static int [][] matrizSumada= new int [2][2];
	static int [][] matrizMultPorEscalar = new int[2][2];

	public static int[][] multiplicar(int [][] matriz1, int [][] matriz2){
		for (int i=0; i<matriz1[0].length;i++){
            for (int j=0; j<matriz2.length;j++){
              int a=0;
              for(int k=0;k<matriz2[0].length;k++){
                  a=a+matriz1[i][k]*matriz2[k][j];
                }
           	  matrizResultante[i][j]=a;     
            }
		}
		return matrizResultante;
	}

	public static int[][] sumar(int [][] matriz1, int [][] matriz2){
		for (int i = 0; i<matriz1[0].length;i++ ) {
			for (int j = 0; j<matriz1.length;j++ ) {
				matrizSumada[i][j] = matriz1[i][j]+matriz2[i][j];
			}			
		}
		return matrizSumada;
	}

	public static void imprimeMatriz(int [][] matriz){
		for (int i = 0;i<matriz.length ; i++) {//filas
			for (int j=0; j<matriz[i].length; j++) {//columnas
				System.out.print(matriz[i][j]+" ");//imprime los elementos
			}
			System.out.println("");
		}
	}

	public static int[][] multPorEscalar(int escalar,int[][] matriz){
		for (int i = 0; i<matriz1[0].length;i++ ) {
			for (int j = 0; j<matriz1.length;j++ ) {
				matrizMultPorEscalar[i][j] = escalar*matriz[i][j];
			}			
		}
		return matrizMultPorEscalar;
	}

	public static void matrizIdentidad(int escalar){
		int[][] matrizIdentidad = new int[escalar][escalar];
		for (int i = 0; i<matrizIdentidad[0].length;i++ ) {
			for (int j = 0; j<matrizIdentidad.length;j++ ) {
				if (i==j) {
					matrizIdentidad[i][j] = 1;
				}
				else {
					matrizIdentidad[i][j] = 0;
				}
			}			
		}
		imprimeMatriz(matrizIdentidad);
	}

	public static void main(String[] args){
		multiplicar(matriz1,matriz2);
		System.out.println("\nmatriz1 multiplicada por matriz2 es: ");
		imprimeMatriz(matrizResultante);
		sumar(matriz1,matriz2);
		System.out.println("\nmatriz1 mas matriz2: ");
		imprimeMatriz(matrizSumada);
		System.out.println("\nmatriz1 multiplicada por el escalar 2 es: ");
		multPorEscalar(2,matriz1);
		imprimeMatriz(matrizMultPorEscalar);
		System.out.println("\nUna matriz identidad de 4x4 es: ");
		matrizIdentidad(4);
	}
}