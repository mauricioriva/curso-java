import java.io.*;

public class Deserializar{

	public static void main(String[] args) {
	
		Empleado e = null;

		try{
			FileInputStream fileIn = new FileInputStream("/Users/cur01alu12/Desktop/miercoles/empleado.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Empleado)in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
			return;
		}catch(ClassNotFoundException cnfe){
			System.out.println("Clase Empleado no fue encontrada");
			cnfe.printStackTrace();
			return;
		}

		System.out.println("Empleado deserializado: ");
		System.out.println("Nombre: "+e.nombre);
		System.out.println("Direcion: "+e.direccion);
		System.out.println("Numero: "+e.numero);

	}

}