import java.util.Scanner;
import java.util.ArrayList;

public class UsoControlRemoto2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos electrodomesticos tienes?");
		int op = sc.nextInt();
		Encendible le[] = new Encendible[op];
		for (Encendible e : le ) {
			System.out.println("Que tipo de aparato es?");
			System.out.println("1:Computadora");
			System.out.println("2:Television");
			System.out.println("3:Lampara");
			op = sc.nextInt();
			switch (op) {
				case 1: e = new Computadora();
					break;
				case 2: e = new Television();
					break;
				case 3: e = new Lampara();
			}
		}
		ArrayList<ControlRemoto> lcr = new ArrayList<ControlRemoto>();
		boolean bandera = true;
		do{
			System.out.println("Quieres un control remoto?");
			System.out.println("1:Si   2:No");
			op = sc.nextInt();
			int b1, b2;
			if (op == 1) {
				System.out.println("Dime que componentes quieres controlar");
				sc.nextLine();
				b1 = sc.nextInt();
				sc.nextLine();
				b2 = sc.nextInt();
				lcr.add(new ControlRemoto(le[b1],le[b2]));
			} else {
				bandera = false;
			}
		}while(bandera);

		for (ControlRemoto cr : lcr) {
			cr.oprimirBoton1();
			cr.oprimirBoton2();
		}

	}

}