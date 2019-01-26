import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente{

    String ip;
    Socket s;

    public static void imprimeMenu() {
        System.out.println("\n---> Manejador Remoto de Archivos <---");
        System.out.println("1: Crea un nuevo archivo");
        System.out.println("2: Lee el contenido de un archivo");
        System.out.println("3: Elige un archivo para agregar texto");
        System.out.println("4: Elige un archivo para borrar su contenido");
        System.out.println("5: Desconectar del servidor\n");
    }

    public static void menu(String ip, Socket s){
        boolean continuar = true;
        while (continuar) {
            imprimeMenu();
            System.out.print("-> ");
            int opcion = leeEntero();
            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static int leeEntero(){
        int numero = 0;
        try {
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();            
        } catch (Exception e) {
            System.err.println("Error al leer el numero.");
        }
        return numero;
    }

    public static String leeCadena(){
        String wrd = "";
        try {
            Scanner sc = new Scanner(System.in);
            wrd = sc.nextLine();
        } catch (Exception e) {
            System.err.println("Error al leer el texto");
        }
        return wrd;
    }

    public static void main(String[] args) {
        try {
            System.out.print("\nIngresa tu ip: ");
            String ip = leeCadena();
            Socket s = new Socket(ip, 9898);
            System.out.println("\nConexion establecida con el servidor.\n");
            menu(ip,s);
        } catch (Exception e) {
            System.err.println("Error al conectarse con el servidor.");
        }
        
    }

}