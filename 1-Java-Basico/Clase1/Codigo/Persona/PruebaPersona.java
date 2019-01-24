
public class PruebaPersona{
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();

		//No se puede porque es private
		//persona1.nombre = "Juan";
		//System.out.println(persona1.nombre);

		persona1.setNombre("Pedro");
		System.out.println(persona1.getNombre());

	}

}