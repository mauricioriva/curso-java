import java.io.*;

public class IoEntrada{
	
	public static void main(String[] args) {
		
		int dato;
		System.out.println("Agrega un caracter: ");
		try{
			dato = System.in.read(); //Leer siguiente byte
			System.out.println(dato);
			System.out.printf("%c\n",dato);
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}