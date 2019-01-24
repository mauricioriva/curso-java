
public class UsoEstudiante{
	
	public static void main(String[] args) {
		
		//Esta llamando al constructor de Estudiante
		EstudianteCienciasdelaTierra tony = new EstudianteCienciasdelaTierra("Tarbuck","Toño","Ingenieria",22);
		EstudianteCienciasdelaTierra tony2 = new EstudianteCienciasdelaTierra("Tarbuck","Toño","Ingenieria",22);
		
		//tony3 y tony estan en el mismo bloque de memoria
		EstudianteCienciasdelaTierra tony3 = tony; //clone() crea un nuevo objeto independiente del otro

		EstudianteDerecho hilda = new EstudianteDerecho("Constitucion","Hilda","Derecho",21,"Mi traje es azul");
		
	}

	/*
		//Esta usando el toString definido en Estudiante
		System.out.println(tony.toString());
		EstudianteCienciasdelaTierra.practicaCampo();
		tony.estudiar();

		System.out.println();

		System.out.println(hilda.toString());
		hilda.estudiar();
		System.out.println(hilda.getTraje());


		System.out.println(tony.equals(tony2)); //true solo porque los sobreescribimos

		System.out.println(tony);
		tony3.setNombre("Tony 3");
		System.out.println(tony3);

	*/

}