import java.util.ArrayList;

public class DataBase {

	static ArrayList<Materia> materias;

	public DataBase(){
		this.materias = asigna();
	}

	public ArrayList<Materia> getMaterias(){
		return materias;
	}

	public static Grupo asignaGrupo1(){
		
		Alumno a1 = new Alumno("Pedro Rodriguez","3001");
		Alumno a2 = new Alumno("Angelica Rosales", "3002");
		
		Profesor profesor = new Profesor("Veronica Arriola","50001");
		
		String n = "101";
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);

		Grupo g = new Grupo(listaAlumnos,profesor,n);

		return g;
	}

	public static Grupo asignaGrupo2(){
		
		Alumno a1 = new Alumno("Arturo Borja", "3003");
		Alumno a2 = new Alumno("Humberto Carranza", "3004");
		
		Profesor profesor = new Profesor("Juan Carlos Balleza","50002");
		
		String n = "102";
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);

		Grupo g = new Grupo(listaAlumnos,profesor,n);

		return g;
	}

	public static Grupo asignaGrupo3(){
		
		Alumno a1 = new Alumno("Emilia Hernandez","3005");
		Alumno a2 = new Alumno("Antonio Lopez", "3006");
		Alumno a3 = new Alumno("Pedro Rodriguez","3001");
	
		Profesor profesor = new Profesor("Roberto Mujica","50003");

		String materia = "Biologia";
		String n = "103";

		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);

		Grupo g = new Grupo(listaAlumnos,profesor,n);

		return g;
	}

	public static Grupo asignaGrupo4(){
		
		Alumno a1 = new Alumno("Brayan Hernandez","3005");
		Alumno a2 = new Alumno("Antonio Lopez", "3006");
		Alumno a3 = new Alumno("Ana Guevara","3001");
		Alumno a4 = new Alumno("Brayan Hernandez","3005");
		Alumno a5 = new Alumno("Antonio Lopez", "3006");
		Alumno a6 = new Alumno("Ana Guevara","3001");
		Alumno a7 = new Alumno("Brayan Hernandez","3005");
		Alumno a8 = new Alumno("Antonio Lopez", "3006");
		Alumno a9 = new Alumno("Ana Guevara","3001");
		Alumno a10 = new Alumno("Brayan Hernandez","3005");
		Alumno a11 = new Alumno("Antonio Lopez", "3006");
		Alumno a12= new Alumno("Ana Guevara","3001");
		Alumno a13= new Alumno("Brayan Hernandez","3005");
		Alumno a14= new Alumno("Antonio Lopez", "3006");
		Alumno a15= new Alumno("Ana Guevara","3001");
		Alumno a16= new Alumno("Brayan Hernandez","3005");
		Alumno a17= new Alumno("Antonio Lopez", "3006");
		Alumno a18= new Alumno("Ana Guevara","3001");
		Alumno a19= new Alumno("Brayan Hernandez","3005");
		Alumno a20= new Alumno("Antonio Lopez", "3006");
		Alumno a21= new Alumno("Ana Guevara","3001");
		Alumno a22= new Alumno("Brayan Hernandez","3005");
		Alumno a23= new Alumno("Antonio Lopez", "3006");
		Alumno a24= new Alumno("Ana Guevara","3001");
		Alumno a25= new Alumno("Brayan Hernandez","3005");
		Alumno a26= new Alumno("Antonio Lopez", "3006");
		Alumno a27= new Alumno("Ana Guevara","3001");
		Alumno a28= new Alumno("Brayan Hernandez","3005");
		Alumno a29= new Alumno("Antonio Lopez", "3006");
		Alumno a30= new Alumno("Ana Guevara","3001");
		Alumno a31= new Alumno("Brayan Hernandez","3005");
		Alumno a32= new Alumno("Antonio Lopez", "3006");
		Alumno a33= new Alumno("Ana Guevara","3001");
		Alumno a34= new Alumno("Brayan Hernandez","3005");
		Alumno a35= new Alumno("Antonio Lopez", "3006");
		Alumno a36= new Alumno("Ana Guevara","3001");
		Alumno a37 = new Alumno("Brayan Hernandez","3005");
		Alumno a38 = new Alumno("Antonio Lopez", "3006");

		Profesor profesor = new Profesor("Raul Martinez","50009");

		String materia = "Español";
		String n = "107";

		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);
		listaAlumnos.add(a4);
		listaAlumnos.add(a5);
		listaAlumnos.add(a6);
		listaAlumnos.add(a7);
		listaAlumnos.add(a8);
		listaAlumnos.add(a9);
		listaAlumnos.add(a10);
		listaAlumnos.add(a11);
		listaAlumnos.add(a12);
		listaAlumnos.add(a13);
		listaAlumnos.add(a14);
		listaAlumnos.add(a15);
		listaAlumnos.add(a16);
		listaAlumnos.add(a17);
		listaAlumnos.add(a18);
		listaAlumnos.add(a19);
		listaAlumnos.add(a20);
		listaAlumnos.add(a21);
		listaAlumnos.add(a22);
		listaAlumnos.add(a23);
		listaAlumnos.add(a24);
		listaAlumnos.add(a25);
		listaAlumnos.add(a26);
		listaAlumnos.add(a27);
		listaAlumnos.add(a28);
		listaAlumnos.add(a29);
		listaAlumnos.add(a30);
		listaAlumnos.add(a31);
		listaAlumnos.add(a32);
		listaAlumnos.add(a33);
		listaAlumnos.add(a34);
		listaAlumnos.add(a35);
		listaAlumnos.add(a36);
		listaAlumnos.add(a37);
		listaAlumnos.add(a38);

		Grupo g = new Grupo(listaAlumnos,profesor,n);

		return g;
	}

	public static ArrayList<Materia> asigna(){

		Grupo g1 = asignaGrupo1();
		Grupo g2 = asignaGrupo2();
		Grupo g3 = asignaGrupo3();
		Grupo g4 = asignaGrupo4();

		ArrayList<Grupo> grupos = new ArrayList<Grupo>();

		grupos.add(g1);
		grupos.add(g2);

		ArrayList<Grupo> grupos1 = new ArrayList<Grupo>();

		grupos1.add(g3);

		ArrayList<Grupo> grupos2 = new ArrayList<Grupo>();

		grupos2.add(g4);

		String materia = "Historia";

		String numMateria = "404";

		String materia2 = "Biologia";

		String numMateria2 = "405";

		String materia3 = "Español";

		String numMateria3 = "406";

		Materia ug1 = new Materia(grupos,materia,numMateria);

		Materia ug2 = new Materia(grupos1,materia2,numMateria2);

		Materia ug3 = new Materia(grupos2,materia3,numMateria3);

		ArrayList<Materia> list = new ArrayList<Materia>();

		list.add(ug1);
		list.add(ug2);
		list.add(ug3);

		return list;

	}

	public String toString(){
		String res = "\n";

		for (int i = 0 ; i < materias.size() ; i++ ) {
			res = res + materias.get(i);
		}

		return res;

	}

}