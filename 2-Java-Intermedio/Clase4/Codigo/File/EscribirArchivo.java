import java.io.*;

public class EscribirArchivo{
	
	public static void main(String[] args) {
		
		File archivo = new File("archivo.txt");
		try{
			FileWriter fw = new FileWriter(archivo); //FileWriter hereda de Writer
			BufferedWriter bf = new BufferedWriter(fw);

			String cadenas[] = {"hola","estoy","en","un","archivo"};

			for (String cadena : cadenas ) {
				bf.write(cadena);
				bf.newLine();
			}

			bf.close();
			fw.close();


		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}