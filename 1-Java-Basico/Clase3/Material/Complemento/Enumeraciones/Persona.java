public class Persona{
	private String nombre;
	private int edad;
	private Genero genero;

	public Persona(String nombre, int edad, Genero genero){
		this.nombre= nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String toString(){
		return nombre + " edad: "+edad+
			" genero: "+genero.obtenerNombre();
	}
}