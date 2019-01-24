
public class Alberto implements Runnable{
	
	public static int balance = 10000;

	public static void main(String[] args) {
		
		Alberto beto = new Alberto();
		Alberto beto1 = new Alberto();
		Alberto beto2 = new Alberto();

		Thread betoThread = new Thread(beto);
		betoThread.start();

		Thread betoThread1 = new Thread(beto1);
		betoThread1.start();

		Thread betoThread2 = new Thread(beto2);
		betoThread2.start();
		
	}

	public void run(){
		while(Alberto.balance > 0){
			//balance -= 100;
			//System.out.println("El balance actual es: " + balance);
			retirarDinero();
		}
	}

	private synchronized void retirarDinero(){
		if(Alberto.balance > 0){
			Alberto.balance -= 100;
			System.out.println("El balance actual es: " + balance);
		}else {
			System.out.println("Balance insuficiente :(");
		}
		
	}

}