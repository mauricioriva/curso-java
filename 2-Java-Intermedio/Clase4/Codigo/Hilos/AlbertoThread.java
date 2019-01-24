
public class AlbertoThread extends Thread{
	
	public int balance = 10000;

	public static void main(String[] args) {
		
		AlbertoThread beto = new AlbertoThread();
		AlbertoThread beto1 = new AlbertoThread();
		AlbertoThread beto2 = new AlbertoThread();

		beto.start();
		beto1.start();
		beto2.start();

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