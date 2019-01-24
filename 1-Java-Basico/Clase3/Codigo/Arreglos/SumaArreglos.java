
public class SumaArreglos{
	
	public static void imprimirArreglo(int cadenas []){

		System.out.print("[");

		for (int i = 0; i < cadenas.length ; i++ ) {
			System.out.print(cadenas[i] + ", ");
		}

		System.out.println("]");

	}

	public static boolean sumaArreglos(int arreglo1 [], int arreglo2 []){
		
		System.out.println("Voy a sumar: ");
		imprimirArreglo(arreglo1);
		imprimirArreglo(arreglo2);

		if (arreglo1.length != arreglo2.length) {
			return false;
		} else {

			for (int i = 0 ; i < arreglo1.length ; i++ ) {
				arreglo1[i] = arreglo1[i] + arreglo2[i];
			}

			return true;
		}
	}

	public static void main(String[] args) {
		
		int arreglo1 [] = {4,5,6,4};
		int arreglo2 [] = {1,2,3,4};
		int arreglo3 [] = {1,3};

		boolean suma = sumaArreglos(arreglo1, arreglo2);

		if (suma == true) {
			System.out.println("Si se pudo y el resultado es: ");
			imprimirArreglo(arreglo1);
		} else {
			System.out.println("No se pudo hacer la suma, los arreglos no tienen la misma longitud.");
		}

	}

}