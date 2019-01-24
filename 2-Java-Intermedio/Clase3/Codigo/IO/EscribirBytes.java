import java.io.*;

public class EscribirBytes{
	
	public static void main(String[] args) {
		
		BufferedOutputStream bufferSalida = null;
		ByteArrayOutputStream arrByte = new ByteArrayOutputStream();

		try{

			bufferSalida = new BufferedOutputStream(arrByte);

			byte [] bytes = {1,2,3,4,5};

			//write(#bytes, inicio, tamaño)
			bufferSalida.write(bytes, 0, 5);

			bufferSalida.flush();

			for (byte b : arrByte.toByteArray()) {
				System.out.print(b);
			}

			System.out.println();

		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	

}