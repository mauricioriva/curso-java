
public class ClaseString{

	public static void inmutabilidad(String cadena){
		String remplazo = cadena.replace("a","f"); //Sustituye todas las a's por f's
		System.out.println(remplazo);
	}

	public static void main(String[] args) {
		String cadena = "cadena";
		inmutabilidad(cadena);
		System.out.println(cadena);

		//Concatenacion de cadenas
		String cadenaConcat = cadena + " otra cadena";
		System.out.println(cadenaConcat);

		//Dato primitivo -> String
		int num = 4;
		String numString = 4 + "";
		String numString2 = String.valueOf(num);
		String piCadena = String.valueOf(Math.PI);

		//Funciones relacionadas con el indice
		String analizar = "mama"; //0 principio y n-1 final, n: num de carateres
		System.out.println("\nAnalizando \"mama\": " + analizar);

		char c = analizar.charAt(1); // a
		System.out.println("El carater en la posicion 1 es: " + c);

		int indice1 = analizar.indexOf("ma"); //Regresa cero
		int indice2 = analizar.lastIndexOf("ma"); // Regresa dos

		//Metodos relacionados con la division de cadenas
		String oracion = "anita lava la tina";
		int primero = 6;
		int segundo = 10;

		String particion = oracion.substring(primero, segundo); //Regresa lava
		System.out.println(particion);

		String dividos[] = oracion.split(" ");

		int caracteres = oracion.length();

		//index regresa un entero

		//Otras funciones
		String cadenaRara = "         s o y U na c a dena ra  r a ";
		String cadenaSinEspaciosALosLados = cadenaRara.trim();
		String todoAMayusculas = cadenaSinEspaciosALosLados.toUpperCase();
		String todoAMinusculas = cadenaSinEspaciosALosLados.toLowerCase();

		String sinEspacios = cadenaSinEspaciosALosLados.replace(" ","");

	}

}