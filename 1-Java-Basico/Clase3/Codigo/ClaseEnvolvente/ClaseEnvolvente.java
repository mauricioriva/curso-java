
public class ClaseEnvolvente{
	
	public static void main(String[] args) {
		
		//Convertir una cadena a un entero
		String numero = "23454";
		int num = Integer.parseInt(numero);
		System.out.println(num);
		
		/*Otros métodos:
			Double.parseDouble(String)
			Short.parseShort(String)
			Byte.parseByte(String)
		*/

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		System.out.println("Maximo de un int: " + max);
		System.out.println("Minimo de un int: " + min);

		//Conversion de bases
		//Convertir 15 a binario
		String binarioDe15 = Integer.toBinaryString(15);
		System.out.println(binarioDe15);

		//Clase Character
		char c = 'p';
		//isDigit es estatico, si no fuera estatico tendriamos que crear una instancia
		boolean esDigito = Character.isDigit(c);
		boolean esLetra = Character.isLetter(c);
		boolean esMinuscula = Character.isLowerCase(c);
		boolean esMayuscula = Character.isUpperCase(c);

		System.out.println("Elemento: " + c);
		System.out.println("Es digito? " + esDigito);
		System.out.println("Es letra? " + esLetra);
		System.out.println("Es minuscula? " + esMinuscula);
		System.out.println("Es mayuscula? " + esMayuscula);


	}

}
