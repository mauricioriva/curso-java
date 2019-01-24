public class Empleado implements java.io.Serializable{

	public String nombre;
	public String direccion;
	public int numero;

	public void enviarMail(){
		System.out.println(nombre + " ha enviado un correo.");
	}


}