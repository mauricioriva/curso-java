import java.io.*;
import java.util.Scanner;

public class Auto implements Serializable{

    String compañia;
    int modelo;
    double longitud;
    boolean electrico;

    public Auto(String compañia, int modelo, double longitud, boolean electrico){
        this.compañia = compañia;
        this.modelo = modelo;
        this.longitud = longitud;
        this.electrico = electrico;
    }

    public static Auto leerObjeto(String direccionArchivo){

        File file = new File(direccionArchivo);

        try {

            if (file.exists()) {
                System.out.println("Se encontro el archivo para leer");
            } else{
                return null;
            }

            Scanner sc = new Scanner(file);

                sc.next();
                String compañia = sc.nextLine();
                sc.next();
                int modelo = sc.nextInt();
                sc.nextLine();
                sc.next();
                double longitud = sc.nextDouble();
                sc.nextLine();
                sc.next();
                boolean electrico = sc.nextBoolean();
                sc.close();

                Auto car = new Auto(compañia,modelo,longitud,electrico);
                
                return car;
                
        } catch (IOException ioe) {
            return null;
        }
          
    }

    public boolean escribirObjeto(String direccionArchivo){

        File file = new File(direccionArchivo);
        
        try {
            
            if(file.createNewFile()){
				System.out.println("Se creo un archivo para escribir");
			}else {
				System.out.println("Se encontro el archivo para escribir");
            }
            
            FileWriter writer = new FileWriter(file);
            
            Auto car = new Auto(this.compañia,this.modelo,this.longitud,this.electrico);

            writer.write(car.toString());
            writer.close();

            return true;

        } catch (IOException ioe) {
            return false;
        }

    }

    public String toString(){
        String res = "";
        res = "Compañia: " + this.compañia + "\nModelo: " + this.modelo +
            "\nTamaño: " + this.longitud + "\nElectrico: " + this.electrico;
        return res;

    }

    public static void main(String[] args) {
        
        Auto car = new Auto("Nissan",2011,3.5,false);
        car.escribirObjeto("./auto.txt");

        Auto car2 = leerObjeto("./auto.txt");
        System.out.println(car2);

    }

}