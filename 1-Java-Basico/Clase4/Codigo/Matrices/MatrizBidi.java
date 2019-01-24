
public class MatrizBidi{
	
	public static void main(String[] args) {
		
		int arregloBi [] [] = {{1,2,3},{4,5,6}};

		imprimirMatriz(arregloBi);

		System.out.println("\nAccediendo al elemento [2][3]: " + arregloBi[1][2] + "\n");

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

}