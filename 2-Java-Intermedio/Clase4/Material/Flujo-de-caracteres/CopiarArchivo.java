import java.io.*;

public class CopiarArchivo{

    public static void main(String[] args) {
        File fLeer = new File("archivo.txt");
        File fEscribir = new File("copia.txt");

        try {
            FileReader fr = new FileReader(fLeer);  //Hereda de Reader
            BufferedReader in = new BufferedReader(fr); //recibe un Reader

            FileWriter fw = new FileWriter(fEscribir);  //Hereda de Writer
            BufferedWriter bf = new BufferedWriter(fw); //recibe un Writer

            String linea;
            while((linea = in.readLine()) != null) {
                bf.write(linea); //Escribimos cadena
                bf.newLine(); // Salto de linea de acuerdo al SO
            }

            in.close();
            fr.close();

            bf.close();
            fw.close();

            System.out.println("Copiado con exito");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}