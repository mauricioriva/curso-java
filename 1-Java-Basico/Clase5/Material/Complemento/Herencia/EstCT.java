public class EstCT extends Estudiante{
	public static String brujula = "Tengo una brujúla";

	public EstCT(String libro, String nombre,
				 String facultad, int edad){
		super(libro,nombre,facultad,edad);
	}

	/*
		this objeto actual
			this.metodo() -> metodo
			this.atributo -> atributo
			this(parametros) -> llamada a constructor (desde un constructor)

		super referencia al objeto padre
			super.metodo() -> metodo del padre
			super.atributo -> atributo del padre
			super(parametros) -> llamada al constructor padre (desde mi constructor)
 	*/

	public static void practicaDeCampo(){
		System.out.println("¡Estoy de práctica de campo!");
	}
}