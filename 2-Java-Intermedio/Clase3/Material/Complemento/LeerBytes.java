import java.io.*;

public class LeerBytes{
	public static void main(String[] args) {
		InputStream flujoEntrada = null;
		BufferedInputStream bufferEntrada = null;

		try{
			flujoEntrada = new FileInputStream("./test.txt");
			bufferEntrada = new BufferedInputStream(flujoEntrada);

			while(bufferEntrada.available() > 0){
				char c = (char)bufferEntrada.read();
				System.out.println("N bytes: " + bufferEntrada.available());
				System.out.println("Caracter: " + c);

			}

		}catch (IOException ioe) {
			ioe.printStackTrace();
		
		}finally{

			try{
				flujoEntrada.close();
				bufferEntrada.close();
			}catch(Exception e){

			}



		}

	}


}