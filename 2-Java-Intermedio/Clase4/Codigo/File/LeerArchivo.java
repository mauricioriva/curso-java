import java.io.*;

public class LeerArchivo{
	
	public static void main(String[] args) {
		File f = new File("archivo.txt");

		try{

			FileReader fr = new FileReader(f); //FileReader hereda de Reader
			BufferedReader bf = new BufferedReader(fr);

			String linea;
			while ((linea = bf.readLine()) != null) {
				System.out.println(linea);
			}

			bf.close();
			fr.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}