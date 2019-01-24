import java.io.*;

public class Serializar{
	
	public static void main(String[] args) {
		
		Empleado em = new Empleado();
		em.nombre = "Alex";
		em.direccion = "Av Universidad";
		em.numero = 456554;

		try{
			FileOutputStream archivoSalida = new FileOutputStream("./empleado.ser");

			ObjectOutputStream salida = new ObjectOutputStream(archivoSalida);

			salida.writeObject(em);

			salida.close();

			archivoSalida.close();

			System.out.println("Se guardo en: empleado.ser");
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}