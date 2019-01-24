import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorChat{

    public static void main(String[] args) throws Exception{
        System.out.println("El servidor está corriendo...");
        ServerSocket listener;
        try{
            listener = new ServerSocket(9898);
            while (true){
                new ConectorClientes(listener.accept()).start();
            }
        }catch(Exception e){}
    }

    private static class ConectorClientes extends Thread{
        private Socket socket;

        public ConectorClientes(Socket socket){
            this.socket = socket;
            System.out.println("IP Cliente: "+socket.getInetAddress());
        }

        
        public void run(){
            BufferedReader in;
            PrintWriter out;
            Scanner scanner = new Scanner(System.in); 
            String ip = "";
            try{
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                ip = socket.getLocalAddress().toString();
                out.println("Se conecto con: "+ip);

                while (true){
                    String input = in.readLine();
                    if (input == null || input.isEmpty()){
                        break;
                    }
                    System.out.println(input);
                    out.println(scanner.nextLine());
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }finally{
                try{ socket.close(); }catch (IOException e){}
                System.out.println("Conexion cerrada desde: "+ip);
            }
        }
    }
}