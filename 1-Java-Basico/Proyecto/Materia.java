import java.util.ArrayList;

public class Materia{

	private ArrayList<Grupo> listaGrupos;
	private String materia;
	private String numMateria;

	public Materia(ArrayList<Grupo> listaGrupos, String materia, String numMateria){
		this.listaGrupos = listaGrupos;
		this.materia = materia;
		this.numMateria = numMateria;
	}

	public String getMateria(){
		return materia;
	}

	public String getNumMateria(){
		return numMateria;
	}

	public ArrayList<Grupo> getListaGrupos(){
		return listaGrupos;
	}

	public String toString(){

		String pot = "<--------------------------------->\n";

		String res = pot + "Materia: " + materia + " " + numMateria 
					+ "\n" + "Numero de Grupos: " + listaGrupos.size() + "\n\n";

		for (int i = 0; i < listaGrupos.size() ; i++ ) {
			res = res + listaGrupos.get(i) + "\n";
		}

		return res;
	}

}