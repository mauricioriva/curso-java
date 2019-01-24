import java.util.Scanner;

public class Cifrado{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		String cadenaCifrada;
		String cadenaDescifrada;

		try{

			switch (args[0]) {
				case "1":
					System.out.println("\nIngresa una cadena a cifrar:\n");
					System.out.print("Cadena ingresada -> ");
					cadena = sc.nextLine();
					cadenaCifrada = cifrar(cadena);
					System.out.println("\nCadena cifrada -> " + cadenaCifrada + "\n");
					break;

				case "2":
					System.out.println("\nIngresa una cadena a descifrar:\n");
					System.out.print("Cadena ingresada -> ");
					cadena = sc.nextLine();
					cadenaDescifrada = desCifrar(cadena);
					System.out.println("\nCadena descifrada -> " + cadenaDescifrada + "\n");
					break;

				default:
					System.out.println("\nIngresa como argumento 1 para cifrar, o 2 para descifrar." +
					 " (java Cifrado 1)\n");		
			}

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\nIngresa como argumento 1 para cifrar, o 2 para descifrar." +
					 " (java Cifrado 1)\n");
		}
	}

	public static String cifrar(String cadena){

		char cifrado [] = cadena.toCharArray();

		for (int i = 0 ; i < cifrado.length ; i++ ) {
			if(cifrado[i] != 32){
				cifrado[i] = (char)(cifrado[i] + 3);
			}
		}

		String resultado = new String(cifrado);

		return resultado;

	}

	public static String desCifrar(String cadena){

		char desCifrado [] = cadena.toCharArray();

		for (int i = 0 ; i < desCifrado.length ; i++ ) {
			if(desCifrado[i] != 32){
				desCifrado[i] = (char)(desCifrado[i] - 3);
			}
		}

		String resultado = new String(desCifrado);

		return resultado;

	}

}