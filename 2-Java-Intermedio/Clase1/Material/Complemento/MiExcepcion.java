public class MiExcepcion extends Exception{

	public MiExcepcion(){
		super("Mensaje de MiExcepcion");
	}

	public MiExcepcion(String mensaje){
		super(mensaje);
	}

}