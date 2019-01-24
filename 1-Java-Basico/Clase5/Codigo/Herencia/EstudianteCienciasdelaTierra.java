
public class EstudianteCienciasdelaTierra extends Estudiante{
	
	//Todos tienen una brujula (static)
	//Debido a que se inicializo todos tienen la misma brujula
	private static String brujula = "Tengo una brujula";

	public EstudianteCienciasdelaTierra(String libro, String nombre, String facultad, int edad){
		super(libro,nombre,facultad,edad);
	}

	public static void practicaCampo(){
		System.out.println("¡Estoy de práctica de campo!");
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

}