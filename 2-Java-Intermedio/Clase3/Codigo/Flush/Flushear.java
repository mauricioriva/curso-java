import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Flushear{

	public static void main(String[] args) {
		
		try{
			OutputStream flujoSalida = new FileOutputStream("test.txt");
			InputStream flujoEntrada = new FileInputStream("test.txt");

			flujoSalida.write('A');

			flujoSalida.flush();

			flujoSalida.write('B');

			System.out.println("" + flujoEntrada.available());

			flujoSalida.close();

			flujoEntrada.close();
		
		}catch (IOException e) {
			System.out.println("Error1");	
		}
		

	}

}