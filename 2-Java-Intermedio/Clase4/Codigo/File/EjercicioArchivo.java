import java.io.*;

public class EjercicioArchivo{
	
	public static void main(String[] args) { //mockaroo
		
		File archivo = new File("archivo.txt");
		try{
			if (archivo.exists()) {
				System.out.println("Existe el archivo");
			} else {
				System.out.println("El archivo no existe, se creará uno con el nombre de: " + archivo.getName());
				archivo.createNewFile();
				FileWriter fw = new FileWriter(archivo); //FileWriter hereda de Writer
				BufferedWriter bf = new BufferedWriter(fw);

				String cadenas[] = {"hola","estoy","en","un","archivo"};

				for (String cadena : cadenas ) {
					bf.write(cadena);
					bf.newLine();
				}

				bf.close();
				fw.close();
			}

			
			FileReader fr = new FileReader(archivo); //FileReader hereda de Reader
			BufferedReader bf = new BufferedReader(fr);

			String linea;

			File archivo2 = new File("archivo2.txt");
			FileWriter fw2 = new FileWriter(archivo2); //FileWriter hereda de Writer
			BufferedWriter bf2 = new BufferedWriter(fw2);

			while ((linea = bf.readLine()) != null) {
				bf2.write(linea);
				bf2.newLine();

			}

			bf2.close();
			fw2.close();

			bf.close();
			fr.close();

		}catch (IOException ioe) {
			ioe.printStackTrace();
		}

//public static ArrayList<Herramientas> leerCsv(String direccion_archivo)

	}

}