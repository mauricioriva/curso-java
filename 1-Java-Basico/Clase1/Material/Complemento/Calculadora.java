import java.util.Scanner;

public class Calculadora{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");

		opcion = sc.nextInt();

		Operador.leerDatos();

		switch(opcion){
			case 1:
				Operador.sumar();
				break;
			case 2:
				Operador.restar();
				System.out.println(Operador.getResultado());
				break;
			case 3:
				System.out.println(Operador.multiplicar());
				break;
			case 4:
				System.out.println(Operador.dividir());
				break;
			default:
				System.out.println("Opcion no valida");
		}

	}

}