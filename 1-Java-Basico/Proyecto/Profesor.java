import java.util.ArrayList;

public class Profesor{
	
	private String nombre;
	private String nomina;

	public Profesor(String nombre, String nomina){
		this.nombre = nombre;
		this.nomina = nomina;
	}

	public String getNombre(){
		return nombre;
	}

	public String getNomina(){
		return nomina;
	}

	public String toString(){
		String res = nombre; //+ " " + nomina
		return res;
	}

}