import java.util.Scanner;

public class EjercicioString{
	
	/* Ejercicio: Dado un String verificar si la cadena está en
	 * mayúsculas.
	*/

	public static void main(String[] args) {
		
		System.out.println("\nPrograma que verifica si una cadena está escrita en mayúsculas.");
		System.out.print("Escribe una cadena: ");

		Scanner sc = new Scanner(System.in);

		String wrd = sc.nextLine();
		
		boolean mayus = esMayuscula(wrd);

		if(mayus == false){
			System.out.println("\nLa cadena \"" + wrd + "\" NO está en mayúsculas.\n");
		} else {
			System.out.println("\nLa cadena \"" + wrd + "\" está en mayúsculas.\n");
		}

	}

	public static boolean esMayuscula(String wrd){

		String cadenaSinEspacios = wrd.replaceAll(" ","");

		char arreglo [] = cadenaSinEspacios.toCharArray();

		int j = 0;

		for (int i = 0 ; i < arreglo.length ; i++) {
			
			if(Character.isUpperCase(arreglo[i])){
				j++;
			} else {
				return false;
			}
		}

		return true;
	}
}