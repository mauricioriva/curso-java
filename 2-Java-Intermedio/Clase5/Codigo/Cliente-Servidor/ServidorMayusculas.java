
import java.io.*;
import java.net.*;

public class ServidorMayusculas{

	public static void main(String[] args) {
		
		ServerSocket listener;
		int nCliente = 0;
		System.out.println("El servidor esta corriendo...");

		try{
			listener = new ServerSocket(9898);
			while (true) {
				new Mayusculas(listener.accept(), nCliente++).start();
			}

		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}


	}

	private static class Mayusculas extends Thread{

		private Socket socket;
		private int nCliente;

		public Mayusculas(Socket socket, int nCliente){
			this.socket = socket;
			this.nCliente = nCliente;
			System.out.println("Nuevo cliente #" + nCliente + ", conexion en " + socket.getInetAddress());
		}

		public void run(){
			try{
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				out.println("Te has conectado, eres el cliente #" + nCliente);

				while (true) {
					String mensaje = in.readLine();
					if (mensaje == null || mensaje.isEmpty()) {
						break;
					}
					System.out.println(mensaje);
					out.println(mensaje.toUpperCase());
				}
			}catch (IOException ioe) {
				System.out.println("Error con el cliente #" + nCliente);
				System.out.println(ioe.getMessage());
			}finally{
				try{
					socket.close();
				}catch (IOException ioe) {
					System.out.println("Se cerro la conexion con el cliente #" + nCliente);
				}
			}
		}


	}
}