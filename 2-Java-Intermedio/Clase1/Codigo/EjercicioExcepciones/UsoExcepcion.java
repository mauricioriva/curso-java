import java.util.Scanner;

public class UsoExcepcion{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una cadena entre 5 y 10 caracteres");

		String cadena = sc.next();

		try{
			revisaCadena(cadena);
		}catch (CadenaLarga cl) {
			System.err.println(cl.getMessage());
		}catch (CadenaCorta cc) {
			System.err.println(cc.getMessage());
		}

	}

	//Array.length;
	//String.length();


	public static void revisaCadena(String cadena) throws CadenaLarga,CadenaCorta{
		if(cadena.length() > 10){
			throw new CadenaLarga("La cadena es muy larga");
		} else if (cadena.length() < 5) {
			throw new CadenaCorta("La cadena es muy corta");
		} else {
			System.out.println("Bien Hecho");
		}
	}

}