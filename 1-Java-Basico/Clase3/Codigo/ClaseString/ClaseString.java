
public class ClaseString{

	public static void main(String[] args) {
		
		String cadena = "cadena";
		String cadena2 = "cadena";
		String cadena3 = new String("cadena");

		System.out.println(cadena == cadena2); //True
		System.out.println(cadena == cadena3); //False

		System.out.println(cadena.equals(cadena2)); //True
		System.out.println(cadena.equals(cadena3)); //True

		String cadenaPequena = cadena.replace("e","a");
		System.out.println(cadenaPequena);

		

	}

}