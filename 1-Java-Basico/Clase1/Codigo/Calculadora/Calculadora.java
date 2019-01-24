import java.util.Scanner;


public class Calculadora{
	
	public static void main(String[] args) {
		
		//Si usas static puedes simplemente
		//Operador.sumar();
		Operador op = new Operador();
		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("1: Sumar");
		System.out.println("2: Restar");
		System.out.println("3: Multiplicar");
		System.out.println("4: Dividir");

		opcion = sc.nextInt();

		op.leerDatos();

		switch (opcion) {
			case 1:
				System.out.println(op.sumar());
				break;
			case 2:
				op.restar();
				System.out.println(op.resultado);
				break;
			case 3:
				op.multiplica();
				break;
			case 4:
				System.out.println(op.divide());
				break;
			default:
				System.out.println("Opcion no valida");
		}

	}

}