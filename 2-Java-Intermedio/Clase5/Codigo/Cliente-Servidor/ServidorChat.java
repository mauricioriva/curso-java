
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServidorChat{

	public static void main(String[] args) throws Exception {
		
		System.out.println("El servidor esta corriendo...");
		ServerSocket listener = new ServerSocket(9898);
		while (true) {
			new ConectorClientes(listener.accept()).start();
		}


	}

	private static class ConectorClientes extends Thread{

		private Socket socket;

		public ConectorClientes(Socket socket){
			this.socket = socket;
			System.out.println("IP Cliente: " + socket.getInetAddress());
		}

		public void run(){
			
			BufferedReader in;
			PrintWriter out;
			Scanner sc = new Scanner(System.in);
			String ipEntrada = "";
			String ipSalida = "";

			try{
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				ipSalida = socket.getLocalAddress().toString();
				ipEntrada = socket.getInetAddress().toString().substring(9);
				out.println("Se conecto con: " + ipSalida);//Out imprimie en la pantala del cliente
				//System.out.println es para imprimir en la pantalla del servidor

				while (true) {
					String mensaje = in.readLine();
					if (mensaje == null || mensaje.isEmpty()) {
						break;
					}
					System.out.println(ipEntrada + "dice: " + mensaje);
					out.println(sc.nextLine());
				}

			}catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}finally{
				try{
					socket.close();
				}catch (IOException ioe) {
					System.out.println("Conexion cerrada con maquina #" + ipEntrada);
				}
			}
		}
	}
}