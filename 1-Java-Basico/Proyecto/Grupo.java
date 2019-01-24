import java.util.ArrayList;

public class Grupo{

	private ArrayList<Alumno> alumnos;
	private Profesor profesor;
	private String numeroDeGrupo;
	
	public Grupo(ArrayList<Alumno> alumnos, Profesor profesor, String numeroDeGrupo){
		this.alumnos = alumnos;
		this.profesor = profesor;
		this.numeroDeGrupo = numeroDeGrupo;
	}

	public ArrayList<Alumno> getListaAlumnos(){
		return alumnos;
	}

	public Profesor getProfesor(){
		return profesor;
	}

	public void agregaAlumno(Alumno alumno){
		alumnos.add(alumno);
	}

	public String getNumeroDeGrupo(){
		return numeroDeGrupo;
	}

	public String buscaMatricula(String matricula){
		boolean encontrado = false;
		for (int i = 0; i < alumnos.size() ; i++ ) {
			if(alumnos.get(i).getMatricula() == matricula){
				encontrado = true;
				return alumnos.get(i).getNombre();
			}
		}
		return null;
	}

	public boolean cupo(){
		if(alumnos.size() > 40){
			return false;
		} else {
			return true;
		}
	}

	public String toString(){
		String res = "\tGrupo " + numeroDeGrupo + 
				 "\n\tProfesor: " + profesor + "\n" 
				 + "\tAlumnos inscritos: " + this.alumnos.size() + "\n";

		return res;
	}

	public void imprimeSinAlumnos(String materia,String claveMateria){
		String res = "\tMateria: " + materia + " " + claveMateria + " -- Grupo " + numeroDeGrupo 
				+ "\n\tAlumnos inscritos: " + this.alumnos.size();
		System.out.println(res);
	}

	public void imprimeAlumnos(){
		String res = "\n\tNombre\t\t\tMatricula\n";

		for (int i = 0 ; i < alumnos.size() ; i++ ) {
			res = res + "\t" +(i + 1) + ") " + alumnos.get(i) + "\n";
		}

		System.out.println(res);
	}

}