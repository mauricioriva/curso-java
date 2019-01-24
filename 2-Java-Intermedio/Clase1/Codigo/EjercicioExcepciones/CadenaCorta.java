
public class CadenaCorta extends Exception{
	
	public CadenaCorta(){
		super("Mensaje de Cadena Corta");
	}

	public CadenaCorta(String mensaje){
		super(mensaje);
	}


}