import java.util.Scanner;
import java.util.InputMismatchException;

public class DivEntreCero{

	public static int dividir(int num, int den){
		return num/den;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean bandera = true;

		do{
			int resultado = 0;
			try{
				System.out.println("Introduzca el numerador");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();
				resultado = dividir(numerador, denominador);
				bandera = false;
			}catch(ArithmeticException ae){
				System.err.println(ae.getMessage());
			}catch(InputMismatchException ime){
				System.err.println(ime.getMessage());
				sc.next();
			}catch(Exception e){
				System.err.println(e.getMessage());
			}
			System.out.println("El resultado es: "+resultado);
		}while(bandera);

	}
	 
}