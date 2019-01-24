import java.util.LinkedList;

public class Cajero extends Thread{

	private static int cajeros = 1;
	public String nombre;
	public int noCaja;
	public LinkedList<Cliente> cola = new LinkedList<Cliente>();

	public Cajero(String nombre){
		this.nombre = nombre;
		this.noCaja = cajeros++;
	}

	public void run(){
		for (Cliente temporal : cola ) {
			
			System.out.println(this.nombre + " esta atendiendo al cliente " + temporal.nombre +
					" en la caja: " + this.noCaja);

			for (int i = 0; i < temporal.productos ; i++ ) {
				this.pasarProducto();
			}

		}
	}

	private void pasarProducto(){
		try{
			Thread.sleep(750);
		}catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}


}