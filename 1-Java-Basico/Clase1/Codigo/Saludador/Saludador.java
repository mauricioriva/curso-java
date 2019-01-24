
public class Saludador {
	//atributo
	String nombre;
	int edad;
	boolean sexo;

	public Saludador(String nombre){
		this.nombre = nombre;
		this.edad = 20;
		this.sexo = true;
	}

	public Saludador(String nombre, int edad, boolean sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public void saludar(){
		System.out.println("Hola, soy " + nombre);
		System.out.println("Tengo " + edad + " años");
		if (sexo == true) {
			System.out.println("Soy Hombre\n");
		} else {
			System.out.println("Soy Mujer\n");
		}
	}

}