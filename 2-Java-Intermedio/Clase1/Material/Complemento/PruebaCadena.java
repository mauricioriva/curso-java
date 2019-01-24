import java.util.Scanner;

public class PruebaCadena{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un a cadena entre 5 y 10 caracteres");
		try{
			revisarCadena(sc.nextLine());
		}catch(CadenaCorta cc){
			System.err.println(cc.getMessage());
		}catch(CadenaLarga cl){
			System.err.println(cl.getMessage());
		}

	}

	public static void revisarCadena(String cad) throws CadenaCorta, CadenaLarga{
		if(cad.length()<=5){
			throw new CadenaCorta();
		}else if(cad.length()>=10){
			throw new CadenaLarga();
		}else{
			System.out.println("Bien hecho");
		}
	}

}