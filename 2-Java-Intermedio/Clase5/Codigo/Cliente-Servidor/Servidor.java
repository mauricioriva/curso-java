
import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Servidor{

	public static void main(String[] args) {

		int puerto = 9898;
		String usuario = "";
		
		try{
			ServerSocket serverSocket = new ServerSocket(puerto);
			System.out.println("El servidor ya esta corriendo...");
			
			Socket socket = serverSocket.accept();
			System.out.println("Conexion aceptada con: " + socket.getInetAddress());
			usuario = socket.getInetAddress().getCanonicalHostName();
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader in = new BufferedReader(isr);
			System.out.println(usuario + " dice: " + in.readLine());
			in.close();

		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
}