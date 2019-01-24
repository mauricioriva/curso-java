import java.io.*;

public class PruebaArchivo{
	
	public static void main(String[] args) throws IOException {
		
		try{
			ManejoArchivos ma = new ManejoArchivos();

			File f = ma.crearArchivo("Archivo");

			ma.escribirArchivo("Hola",f);
			ma.escribirArchivo("Adios",f);

			ma.leerArchivo(f);

		}catch (FileNotFoundException e) {
			
		}

	}

}