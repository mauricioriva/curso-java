import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteMayusculas{

	public static void main(String[] args) throws IOException{
		
		String ip = (args.length!=0)?args[0]:(new Scanner(System.in)).nextLine();
		Socket s = new Socket(ip, 9898);

		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		Scanner sc = new Scanner(System.in);
		String mensaje;

		System.out.println("Escribe un mensaje");

		while(true){
			mensaje = sc.nextLine();
			if(mensaje == null || mensaje.isEmpty()){
				break;
			}
			out.println(mensaje);
			System.out.println(in.readLine());
		}
	}
}