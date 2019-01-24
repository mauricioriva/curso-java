import java.io.*;
import java.net*;
import java.util.Date;

public class ServidorFecha{

	public static void main(String[] args) throws IOException{
		
		ServerSocket listener = new ServerSocket(9898);
		System.out.println("El servidor esta corriendo...");
		Socket socket;
		PrintWriter out;
		while(true){
			socket = listener.accept();
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println(new Date().toString());
			out.close();
		}
	}
}