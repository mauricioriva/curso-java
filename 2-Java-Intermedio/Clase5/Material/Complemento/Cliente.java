import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Cliente{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inroduce la direccion IP del servidor al que te quieras conectar:");
		String ip = sc.nextLine();
		int puerto = 9898;
		try{
			Socket socket = new Socket(ip,puerto);
			System.out.println("Conexion aceptada con: "+socket.getInetAddress());
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println(sc.nextLine());
			out.close();
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}

	}

}