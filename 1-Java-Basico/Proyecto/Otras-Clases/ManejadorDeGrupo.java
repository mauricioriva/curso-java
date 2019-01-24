
public class ManejadorDeGrupo{
	
	Grupo grupo;
	Alumno alumno;
	Profesor profesor;

	public ManejadorDeGrupo(Grupo grupo, Profesor profesor){
		this.grupo = grupo;
		//this.alumno = alumno;
		this.profesor = profesor;
	}

	public String toString(){
		return grupo + profesor;
	}

}