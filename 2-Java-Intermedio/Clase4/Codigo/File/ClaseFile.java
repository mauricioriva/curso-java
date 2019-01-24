import java.io.*;

public class ClaseFile{
	
	public static void main(String[] args) {
		File archivo = new File("archivo.txt");
		try{
			if (archivo.exists()) {
				System.out.println("Existe el archivo");
			} else {
				System.out.println("El archivo no existe");
				archivo.createNewFile();
			}
			System.out.println("La direccion completa del archivo es " + archivo.getAbsolutePath());
			System.out.println("El nombre del archivo es: " + archivo.getName());
			System.out.println("El archivo es una carpeta? " + archivo.isDirectory());
			System.out.println("El archivo es un file? " + archivo.isFile());
			System.out.println("El archivo es oculto? " + archivo.isHidden());
			System.out.println("El tamaño del archivo es? " + archivo.length());

		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
