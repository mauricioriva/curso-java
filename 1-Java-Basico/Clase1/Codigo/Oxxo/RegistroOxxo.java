import java.util.Scanner;


public class RegistroOxxo{
	
	public static void main(String[] args) {
		
		SucursalOxxo s1 = new SucursalOxxo("Av. Universidad 123","fdhjsdh4",3);
		SucursalOxxo s2 = new SucursalOxxo("Av. Coyoacan 34","7uyh4",4);
		SucursalOxxo s3 = new SucursalOxxo("America 93","hjre784",2);

		Scanner sc = new Scanner(System.in);
		int opcion;

		s1.vender(50);
		s2.vender(60);
		s3.vender(40);


		double ganancia1 = s1.getGanancias();
		double ganancia2 = s2.getGanancias();
		double ganancia3 = s3.getGanancias();
		
		double gananciastotales = ganancia1 + ganancia2 + ganancia3;

		System.out.println("<-- Sucursales Oxxo -->");
		System.out.println("1: Sucursal Universidad");
		System.out.println("2: Sucursal Coyoacan");
		System.out.println("3: Sucursal America");
		System.out.println("Numero de Sucursales: " + s3.contador);
		System.out.println("Ganancias totales: " + gananciastotales);

		opcion = sc.nextInt();

		switch (opcion) {
			case 1:
				System.out.println(s1);
				break;
			case 2:
				System.out.println(s2);
				break;
			case 3:
				System.out.println(s3);
				break;
			default:
				System.out.println("Error numero no valido.");
		}

		//Imprima en pantala el numero total de oxxos 

		//Me muestre uno por uno toda la informacion de cada oxxo

		//Me muestre la suma de ganancias de todos los Oxxos
	}

}