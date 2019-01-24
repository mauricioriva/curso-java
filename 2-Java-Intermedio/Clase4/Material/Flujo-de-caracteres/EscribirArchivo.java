import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo{

    public static void main(String[] args) {
        File f = new File("archivo.txt");
        try {
            FileWriter fw = new FileWriter(f);  //Hereda de Writer
            BufferedWriter bf = new BufferedWriter(fw); //recibe un Writer
            
            //Escribir un caracter
            char caracter = 'm';
            int aCaracter = (int)caracter;
            bf.write(aCaracter);

            //Escribir Strings
            String cadenas[]={"hola", "estoy", "en", "un", "archivo"};
            for(String cadena : cadenas) {
                bf.write(cadena); //Escribimos cadena
                bf.newLine(); // Salto de linea de acuerdo al SO
            }
            
            bf.close();
            fw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}