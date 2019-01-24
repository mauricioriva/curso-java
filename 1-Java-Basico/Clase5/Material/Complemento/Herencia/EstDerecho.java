public class EstDerecho extends Estudiante{
	public String trajecito;

	public EstDerecho(String libro, String nombre,
				      String facultad, int edad,String trajecito){
		super(libro,nombre,facultad,edad);
		this.trajecito = trajecito;
	}

	@Override
	public void estudiar(){
		System.out.println("¡Estoy leyendo la constitución!");
	}

	public String getTraje(){
		return this.trajecito;
	}

}

