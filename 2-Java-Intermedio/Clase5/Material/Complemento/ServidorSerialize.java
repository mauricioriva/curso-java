import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServidorSerialize{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Disco disco = null;
		ServerSocket listener = new ServerSocket(9898);
		System.out.println("Servidor esperando discos...");
		Socket s;
		ObjectInputStream in;
		s = listener.accept();
		in = new ObjectInputStream(s.getInputStream());
		disco = (Disco)in.readObject();
		System.out.println(disco);				
		in.close();
	}
}