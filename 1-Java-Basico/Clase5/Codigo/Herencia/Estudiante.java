
public class Estudiante{
	
	private String libro;
	private String nombre;
	private String facultad;
	private int edad;

	public Estudiante(String libro, String nombre, String facultad, int edad){
		this.libro = libro;
		this.nombre = nombre;
		this.facultad = facultad;
		this.edad = edad;
	}

	public String toString(){
		return "Hola, soy un estudiante. El libro que uso es: " + this.libro + 
				"\nEstudio en la facultad de: " + this.facultad +
				"\nMe llamo: " + this.nombre + " y tengo " + this.edad + " años.";
	}

	public void estudiar(){
		System.out.println("¡Estoy estudiando!");
	}

	//Upcasting, es la posibilidad de convertirse en un tipo de dato padre

	public boolean equals(Object o){
		
		if(!(o instanceof Estudiante)){
			return false;
		}
	
		Estudiante otro = (Estudiante)o; //Downcasting
		return this.libro.equals(otro.libro) && this.nombre.equals(otro.nombre)
				 && this.facultad.equals(otro.facultad);
	}

	public void setNombre(String nuevoNombre){
		this.nombre = nuevoNombre;
	}

}