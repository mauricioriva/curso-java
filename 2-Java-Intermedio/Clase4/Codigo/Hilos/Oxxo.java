
public class Oxxo{

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("ana",4);
		Cliente c2 = new Cliente("bob",5);
		Cliente c3 = new Cliente("ale",3);
		Cliente c4 = new Cliente("paco",2);
		Cliente c5 = new Cliente("andrea",6);
		Cliente c6 = new Cliente("dylan",3);

		Cajero patricia = new Cajero("patricia");
		Cajero masiosare = new Cajero("masiosare");
		Cajero calamardo = new Cajero("calamardo");

		patricia.cola.offer(c1); //Offer() metodo de linkedlist
		patricia.cola.offer(c2);
		masiosare.cola.offer(c3);
		masiosare.cola.offer(c4);
		calamardo.cola.offer(c5);
		calamardo.cola.offer(c6);

		long startTime = System.currentTimeMillis();
		patricia.start();
		masiosare.start();
		calamardo.start();
		try{
			patricia.join();
			masiosare.join();
			calamardo.join();
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}

		System.out.println("El tiempo de ejecucion fue: " + (System.currentTimeMillis() - startTime) / 1000);

	}

}