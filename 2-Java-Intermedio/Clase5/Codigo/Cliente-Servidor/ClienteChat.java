
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteChat {
	
	public static void main(String[] args) throws Exception{
		
		String ip = (args.length != 0)?args[0]:(new Scanner(System.in).nextLine());
		Socket socket = new Socket(ip, 9898);

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

		System.out.println(in.readLine());

		Scanner sc = new Scanner(System.in);
		String mensaje;
		System.out.println("Puedes comenzar a escribir mensajes");

		while (true) {
		 	mensaje = sc.nextLine();
		 	if (mensaje == null || mensaje.isEmpty()) {
				break;
			}
			out.println(mensaje);
			System.out.println(in.readLine());
		 } 



	}
}