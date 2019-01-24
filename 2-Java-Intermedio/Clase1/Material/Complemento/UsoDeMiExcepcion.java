import java.util.Scanner;

public class UsoDeMiExcepcion{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero de 1 al 10");
		int x = sc.nextInt();
		try{
			revisarNumero(x);
		}catch(MiExcepcion me){
			System.err.println(me.getMessage());
		}catch(MiExcepcion2 me2){
			System.err.println(me2.getMessage());
		}
		
	}

	public static void revisarNumero(int x) throws MiExcepcion, MiExcepcion2{
		if(x==5){
			throw new MiExcepcion("No me gusta el numero 5");
		}else if(x==3){
			throw new MiExcepcion2("No me gusta el numero 3");
		}else{
			System.out.println("Bien hecho");
		}
	}

}