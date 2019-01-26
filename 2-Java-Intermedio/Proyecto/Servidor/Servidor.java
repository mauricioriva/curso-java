import java.io.*;
import java.net.*;

public class Servidor{

    public static void main(String[] args) {
        
        ServerSocket listener;
        int nCliente = 0;
        System.out.println("El servidor esta corriendo...");

        try {
            listener = new ServerSocket(9898);
            while (true) {
                int i = 5;
                listener.accept()
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

    private static class Archivo extends Thread{

        private Socket socket;
        private int nCliente;

        public Archivo(Socket socket, int nCliente){
            this.socket = socket;
            this.nCliente = nCliente;
            System.out.println("Nuevo cliente #" + nCliente + ", conexion en " + socket.getInetAddress());
        }

        public void run(){
            
        }

    }

}