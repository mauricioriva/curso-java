import java.util.ArrayList;

public class Alumno{

	private String nombre;
	private String matricula;

	public Alumno(String nombre, String matricula){
		this.nombre = nombre;
		this.matricula = matricula;
	}

	public String getNombre(){
		return nombre;
	}

	public String getMatricula(){
		return matricula;
	}

	public String toString(){
		String res = nombre + " " + "\t" + matricula;
		return res;
	}

}