
public class AlbertoApellido extends Thread{
	
	public String apellido;

	public AlbertoApellido(String apellido){
		this.apellido = apellido;
	}

	public void run(){
		int i = 1;
		while(true){
			System.out.println(i + ") " + this.apellido);
			i++;
		}
	}

	public static void main(String[] args) {
		AlbertoApellido salinas = new AlbertoApellido("Salinas");
		AlbertoApellido guevara = new AlbertoApellido("Guevara");

		salinas.setPriority(8);
		guevara.setPriority(3);
		salinas.start();
		guevara.start();
	}

}