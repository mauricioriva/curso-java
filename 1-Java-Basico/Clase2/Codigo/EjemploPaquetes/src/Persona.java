package mundo;

public class Persona{
	
	String nombre;
	int edad;
	boolean genero;

	public Persona(String nombre, int edad, boolean genero){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String toString(){
		String regreso = "Nombre: " + nombre + "\tedad: " + edad + "\tgenero: ";

		if(genero){
			regreso = regreso + "Masculino";
		} else{
			regreso = regreso + "Femenino";
		}

		return regreso;
	}
}