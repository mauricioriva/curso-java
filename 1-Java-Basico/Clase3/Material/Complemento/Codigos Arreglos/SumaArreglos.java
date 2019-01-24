public class SumaArreglos{

	public static void imprimirArreglo(int cadenas[]){
		System.out.print("[");
		for (int i = 0; i < cadenas.length; i++) {
			System.out.print(cadenas[i]+" ");
		}
		System.out.println("]");
	}


	public static boolean sumaArreglos(int arreglo1[], int arreglo2[]){
		System.out.println("Voy a sumar: ");
		imprimirArreglo(arreglo1);
		imprimirArreglo(arreglo2);
		if(arreglo1.length != arreglo2.length){
			return false;
		}
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i] = arreglo1[i] + arreglo2[i];
		}
		return true;
	}

	public static void main(String[] args) {
		int arreglo1[] = {4, 5, 6, 4};
		int arreglo2[] = {1, 2, 3, 4}; // n -1

		boolean seEfectuoSuma1 = sumaArreglos(arreglo1, arreglo2);
		if(seEfectuoSuma1){
			System.out.println("Si se pudo y el resultado es: ");
			imprimirArreglo(arreglo1);
		}else{
			System.out.println("No se pudo");
		}
		int arreglo3[] = {1, 2};
		boolean seEfectuoSuma2 = sumaArreglos(arreglo1, arreglo3);
		if(seEfectuoSuma2){
			System.out.println("Si se pudo y el resultado es: ");
			imprimirArreglo(arreglo1);
		}else{
			System.out.println("No se pudo");
		}
	}
}