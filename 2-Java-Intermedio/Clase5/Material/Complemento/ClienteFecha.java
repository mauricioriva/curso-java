import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteFecha{
	public static void main(String[] args) throws IOException{
		System.out.println("Introduce el IP del servidor");
		String ip = (new Scanner(System.in)).nextLine();
		Socket socket = new Socket(ip,9898);
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader in = new BufferedReader(isr);
		System.out.println("La fecha del servidor es: "+in.readLine());
		in.close();
	}
}