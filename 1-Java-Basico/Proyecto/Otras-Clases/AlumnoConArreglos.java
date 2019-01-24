import java.util.ArrayList;

public class AlumnoConArreglos{
	
	String [] alumnos;
	String materia;

	public Alumno(String materia){
		if(materia == "historia"){
			this.alumnos = alumnosHistoria(materia);
			this.materia = materia;
		} else if(materia == "español"){
			this.alumnos = alumnosEspañol(materia);
			this.materia = materia;
		}else if(materia == "biologia"){
			this.alumnos = alumnosBiologia(materia);
			this.materia = materia;
		} else {
			this.alumnos = alumnos;
			this.materia = materia;
		}
		
	}

	public static String [] alumnosHistoria(String materia){

		String [] nombres = new String[40];

		nombres[0] = "Eduardo Torres";
		nombres[1] = "Ximena Cortez";

		return nombres;
	}

	public static String [] alumnosEspañol(String materia){

		String [] nombres = new String[40];

		nombres[0] = "Carlos Ramon Fuentes";
		nombres[1] = "Romina Perez Robles";

		return nombres;
	}

	public static String [] alumnosBiologia(String materia){

		String [] nombres = new String[5];

		nombres[0] = "Arturo Garcia";
		nombres[1] = "Emiliano Guevara";

		return nombres;
	}

	public String agregaAlumno(String nombre){
		String nuevoNombre;
		for(int i = 0; i < alumnos.length; i++){
			if(alumnos[i] == null){
				alumnos[i] = nombre;
				return nombre;
			}
		}
		return nombre;
	}

	public String toString(){
		String res = materia + ":\n";
		for (int i = 0 ; i < alumnos.length ; i++ ) {
			if(alumnos[i] != null) res = res + (i + 1) + ") " + alumnos[i] + "\n";
		}
		return res;
	}

	public static void main(String[] args) {
		
		Alumno listaAlumnos = new Alumno("historia");

		listaAlumnos.agregaAlumno("Mauricio Perez");
		
		System.out.println(listaAlumnos);

	}

}