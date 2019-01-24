public class Promedio{

	public static double promedio(double... numeros){
		double suma = 0.0;
		for (double temp : numeros) {
			suma = suma + temp;
		}
		return suma / numeros.length;
	}

	public static void main(String[] args) {
		double primero = 5;
		double segundo = 8;
		double tercero = 9;
		double promedioDeNumeros = promedio(primero, segundo, 
											tercero, 4.5, 9, 10, 100);
		System.out.println("El promedio es: "+promedioDeNumeros);
	}

}