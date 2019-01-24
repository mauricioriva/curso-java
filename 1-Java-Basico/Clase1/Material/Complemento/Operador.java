import java.util.Scanner;

public class Operador{

	private static double a, b, resultado;

	public static void leerDatos(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		a = teclado.nextDouble();
		System.out.println("Dame el segundo numero");
		b = teclado.nextDouble();
	}

	public static double getResultado(){
		return resultado;
	}

	public static void sumar(){
		System.out.println(a+b);
	}

	public static void restar(){
		resultado = a-b;
	}

	public static double multiplicar(){
		return a*b;
	}

	public static double dividir(){
		if(b==0){
			System.out.println("No se puede dividir entre 0");
			return 0;
		}else
			return a/b;
	}

}