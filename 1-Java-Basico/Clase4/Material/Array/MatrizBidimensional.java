public class MatrizBidimensional{
	public static void main(String[] args) {
		int arregloBi[][]={{1,2,3},{4,5,6}};

		//Para acceder a un elemento, especificamos su fila y su columna mediante índices. 
		System.out.println("Accediendo al elemento [1][2]: "+arregloBi[1][2]+"\n");

		//Ahora, para imprimir todos los elementos:
		for (int i = 0;i<arregloBi.length ; i++) {//filas
			for (int j=0; j<arregloBi[i].length; j++) {//columnas
				System.out.print(arregloBi[i][j]);//imprime los elementos
			}
			System.out.println("");
		}
	}	
}
