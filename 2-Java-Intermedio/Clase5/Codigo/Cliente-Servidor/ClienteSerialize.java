
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteSerialize{
	
	public static void main(String[] args) throws IOException{
		
		Disco d1 = new Disco("WUP","MC",1999,14);
		//IF reducido (condicion)?then:else
		String ip = (args.length != 0)?args[0]:(new Scanner(System.in)).nextLine();
		System.out.println(ip);
		Socket s = new Socket(ip,9898);
		ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
		out.writeObject(d1);
		out.close();

	}
}