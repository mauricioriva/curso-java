import java.io.*;

public class PruebaArchivos{
	public static void main(String[] args) throws Exception{
		try{
			ManejoArchivos ma = new ManejoArchivos();
			File f = ma.crearArchivo("Archivo");
			ma.escribirEnArchivo("Hola",f);
			ma.escribirEnArchivo("Mundo",f);
			ma.leerArchivo(f);	
		}catch(FileNotFoundException fnfe){}
	}
}