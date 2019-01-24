public class Arreglos{

	public static void main(String[] args) {
		String meses[]={"Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		System.out.println("Numero de meses: "+meses.length);
		System.out.println(meses[7]);// mes agosto
		System.out.println(meses[11]); //maximo n-1
		System.out.println(meses);

		imprimirArreglo2(meses);
	}
	public static void imprimirArreglo(String cadenas[]){
		System.out.print("[");
		for (int i = 0; i < cadenas.length; i++) {
			System.out.print(cadenas[i]+" ");
		}
		System.out.println("]");
	}

	public static void imprimirArreglo2(String cadenas[]){
		System.out.print("[");
		for (String cadena : cadenas) {
			System.out.print(cadena+" ");
		}
		System.out.println("]");
	}
}
