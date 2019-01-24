import java.io.*;
import java.util.ArrayList;

public class Auto implements Serializable {

    String compañia;
    int modelo;
    double longitud;
    boolean electrico;

    public Auto(String compañia, int modelo, double longitud, boolean electrico) {
        this.compañia = compañia;
        this.modelo = modelo;
        this.longitud = longitud;
        this.electrico = electrico;
    }

    public static ArrayList<Auto> obtenerInfo(String path) {
        
        File archivo = new File(path);
		try{
			if (archivo.exists()) {
				System.out.println("Existe el archivo");
			} else {
				System.out.println("El archivo no existe");
                return null;
            }

            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);

            ArrayList<Auto> autos = new ArrayList<Auto>();

            String registro = bf.readLine();

            while ((registro = bf.readLine()) != null) {
                
                String[] arreglo = registro.split(",",4);

                String compañia = arreglo[0];
                int modelo = Integer.parseInt(arreglo[1]);
                double longitud = Double.parseDouble(arreglo[2]);
                boolean electrico = Boolean.parseBoolean(arreglo[3]);

                Auto car = new Auto(compañia,modelo,longitud,electrico);

                autos.add(car);
            }

            bf.close();
            fr.close();

            return autos;

        }catch(IOException ioe){
            ioe.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {

        ArrayList<Auto> lista = obtenerInfo("./autos.csv");
        System.out.println(lista);
        System.out.println(lista.size());

    }

}