import java.io.*;

public class Flushear{
 public static void main(String[] args) {
 	try{
	 	OutputStream flujoSalida = new FileOutputStream("test.txt");
	 	InputStream flujoEntrada = new FileInputStream("test.txt");


	 	flujoSalida.write('A');

	 	//flujoSalida.flush();

	 	flujoSalida.write('B');

	 	System.out.println("" + flujoEntrada.available());

	 	flujoSalida.close();

	 	flujoEntrada.close();
 	}catch(IOException ioe){
 		ioe.printStackTrace();
 	}

 }





}