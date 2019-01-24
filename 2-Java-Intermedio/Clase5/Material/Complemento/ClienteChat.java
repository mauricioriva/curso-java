import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteChat{
    public static void main(String[] args) throws Exception{
        System.out.println("Introduce la IP del servidor: ");
        String ipServidor = (new Scanner(System.in)).nextLine();
        Socket socket = new Socket(ipServidor, 9898);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println(in.readLine());

        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.println("Escribe el mensajes");

        while (true) {
            
            message = scanner.nextLine();
            if (message == null || message.isEmpty()){
                break;
            }
            out.println(message);
            System.out.println(in.readLine());
        }
    }
}