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
                listener.accept();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}