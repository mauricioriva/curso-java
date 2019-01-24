import java.io.*;
import java.util.Scanner;

public class ManejoArchivos{
	
	public File crearArchivo(String nombreArchivo){
		File file = new File("./"+nombreArchivo+".txt");
		try{
			if(file.createNewFile()){
				System.out.println("Se creo el archivo");
			}else{
				System.out.println("Hubo error al crear el archivo");
			}
		}catch(IOException ioe){}
		return file;
	}

	public void escribirEnArchivo(String textoArchivo, File f) throws IOException{
		FileWriter writer = new FileWriter(f);
		writer.write(textoArchivo);
		writer.close();
	}

	public void leerArchivo(File f) throws Exception{
		Scanner sc = new Scanner(f);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}

	}

}