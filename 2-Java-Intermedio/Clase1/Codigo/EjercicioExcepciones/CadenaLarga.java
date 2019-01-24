
public class CadenaLarga extends Exception{
	
	public CadenaLarga(){
		super("Mensaje de Cadena Corta");
	}

	public CadenaLarga(String mensaje){
		super(mensaje);
	}

}