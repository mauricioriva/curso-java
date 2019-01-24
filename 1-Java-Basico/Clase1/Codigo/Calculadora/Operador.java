import java.util.Scanner;

public class Operador {
	
	private double a, b, resultado;

	public void leerDatos(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		a = teclado.nextDouble();
		System.out.println("Dame el segundo numero");
		b = teclado.nextDouble();
	}

	public double sumar(){
		return a + b;
	}

	public void restar(){
		resultado = a - b;
	}

	public double multiplica(){
		System.out.println(a + b);
		return a * b;
	}

	public double divide(){
		if (b == 0) {
			System.out.println("No se puede dividir entre cero");
			return 0;
		} else {
			return a / b;
		}
	}

}