
public class Promedio{
	
	//Metodo con parametros de longitud variable
	public static double promedio(double... numeros){
		double suma = 0;
		for (double temp : numeros ) {
			suma = suma + temp;
		}

		return suma / numeros.length;
	}

	public static void main(String[] args) {
		double primero = 5;
		double segundo = 8;
		double tercero = 9;
		double promedioDeNumeros = promedio(primero, segundo, tercero, 3, 7.4, 9);

		System.out.println("El promedio es: " + promedioDeNumeros);
	}

}