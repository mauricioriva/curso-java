
public class EstudianteDerecho extends Estudiante{
	
	private String traje;

	public EstudianteDerecho(String libro, String nombre, String facultad, int edad, String traje){
		super(libro,nombre,facultad,edad);
		this.traje = traje;
	}

	//Sobreescritura de método
	@Override
	public void estudiar(){
		System.out.println("¡Estoy leyendo la constitución!");
	}

	public String getTraje(){
		return this.traje;
	}

	/*
	Notaciones:
		@Override: para hacerle saber al compilador que se esta sobrescribiendo el método
	*/
	
}