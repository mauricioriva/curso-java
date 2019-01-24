
public class Arreglos{
	
	public static void main(String[] args) {
		
		String meses [] = {"Enero","Febrero","Marzo","Abril","Mayo",
				"Junio","Julio","Agosto","Septiembre","Octubre",
				"Novimebre", "Diciembre"};

		System.out.println("Numero de meses: " + meses.length);

		//Mes Agosto
		System.out.println(meses[7]);
		System.out.println(meses[11]); //maximo n-1
		
		//Direccion de memoria del arreglo que es un objeto
		System.out.println(meses);

		imprimirArreglo(meses);

		imprimirArreglo2(meses);

	}

	public static void imprimirArreglo(String cadenas []){

		System.out.print("[");

		for (int i = 0; i < cadenas.length ; i++ ) {
			System.out.print((i + 1) + ":" + cadenas[i] + ", ");
		}

		System.out.println("]");

	}

	public static void imprimirArreglo2(String cadenas[]){

		System.out.print("[");
		int i = 1;
		for(String cadena : cadenas){
			System.out.print(i + ":" + cadena + ", ");
			i++;
		}

		System.out.println("]");

	}

}