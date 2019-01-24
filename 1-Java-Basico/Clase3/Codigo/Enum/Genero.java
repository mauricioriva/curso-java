
public enum Genero{
	
	MASCULINO,
	FEMENINO;

	//Cuando no se usa static se deben crear instancias.
	public String obtenerNombre(){
		return this.name().toLowerCase();
	}

}