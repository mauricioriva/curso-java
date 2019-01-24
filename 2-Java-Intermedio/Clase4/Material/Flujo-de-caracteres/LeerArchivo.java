import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeerArchivo{

    public static void main(String[] args) {
        File f = new File("archivo.txt");
        try {
            FileReader fr = new FileReader(f);  //Hereda de Reader
            BufferedReader in = new BufferedReader(fr); //recibe un Reader
            
            //Leer un caracter
            char caracter = (char)in.read();

            //Leer todos los caracteres
            String l;
            while((l = in.readLine()) != null) {
                System.out.println(l);
            }
            
            in.close();
            fr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}