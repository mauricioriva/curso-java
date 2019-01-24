
public class ClaseMath{
	
	public static void main(String[] args) {
		
		//Constantes
		System.out.println("El valor de pi es: " + Math.PI);
		System.out.println("El valor de E es: " + Math.E);

		//Metodos funciones trigonometricas
		double noventaGrados = Math.PI/2;
		double senoDeNoventaGrados = Math.sin(noventaGrados);

		System.out.println("El Seno de 90 es: " + senoDeNoventaGrados);

		//Potencia
		double dosAlaDiez = Math.pow(2,10);
		System.out.println("2 a la 10 es: " + dosAlaDiez);

		//Raiz Cuadrada
		double raizCuadradaDeNueve = Math.sqrt(9);
		System.out.println("La raiz cuadrada de 9 es: " + raizCuadradaDeNueve);

		//Probando Redondeos
		double num1 = 3.6;
		double num2 = 3.4;
		double num3 = -3.6;
		double num4 = -3.4;

		MathSimplificada.diferentesRedondeos(num1);
		MathSimplificada.diferentesRedondeos(num2);
		MathSimplificada.diferentesRedondeos(num3);
		MathSimplificada.diferentesRedondeos(num4);

		//Numero Aleatorios
		double numAleatorio = Math.random(); //[0,1) -> [a,b]
		System.out.println("Aleatorio " + numAleatorio);
		System.out.println("Aleatorio de 10 a 100: " + MathSimplificada.aleatorio(50,100));

	}
}