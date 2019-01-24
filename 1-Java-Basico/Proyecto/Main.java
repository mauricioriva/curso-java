import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	
	public static void imprimeMenu(){
		System.out.println("<- Sistema Escolar ->");
		System.out.println("1: Alumno");
		System.out.println("2: Profesor");
		System.out.println("3: Salir");
	}

	public static void imprimeMenuAlumno(){
		System.out.println("\n1: Ver Grupos");
		System.out.println("2: Inscribirse a un grupo");
		System.out.println("3: Ver grupos inscritos");
		System.out.println("4: Regresar al menu anterior");
	}

	public static void imprimeMenuProfesor(){
		System.out.println("\n1: Ver grupos asignados");
		System.out.println("2: Listar Alumnos");
		System.out.println("3: Regresar al menu anterior");
	}

	public static int pideNumero(){
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}

	public static String pideCadena(){
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		return cadena;
	}

	public static void menu(){
		DataBase db = new DataBase();
		boolean continuar = true;
		while(continuar){
			imprimeMenu();
			System.out.print("-> ");
			int opcion = pideNumero();
			switch (opcion) {
				case 1:
					System.out.print("Escribe tu matricula: ");
					String matricula = pideCadena();
					Alumno alumnoUsuario = obtenAlumno(db,matricula);
					if (alumnoUsuario == null) {
						System.out.println("¡Alumno no encontrado!");
						break;
					} else{
						String nombreUsuario = alumnoUsuario.getNombre();
						System.out.print("<-- Bienvenid@: " + nombreUsuario + " -->");
					}

					boolean seguir = true;
					while(seguir){
						imprimeMenuAlumno();
						System.out.print("-> ");
						int opcionAlumno = pideNumero();
						switch (opcionAlumno) {
							case 1:
								System.out.println(db);
								break;

							case 2:
								System.out.print("\nIngresa la clave de la materia: ");
								String claveMate = pideCadena();
								System.out.print("\nIngresa el numero de grupo: ");
								String numGrupo = pideCadena();
								boolean bob = inscribirseGrupo(db,alumnoUsuario,claveMate,numGrupo);
								if (bob) {
									System.out.println("\nAgregado al grupo con exito!");
								} else {
									System.out.println("\nNo se pudo agregar al grupo!");
								}
								break;

							case 3:
								System.out.println("\nGrupos inscritos del alumno: " + alumnoUsuario.getNombre() + "\n");
								gruposInscritosA(db,alumnoUsuario);
								break;

							case 4:
								seguir = false;
								break;

							default:
								System.out.println("No es un numero valido. Vuelve a intentarlo\n");
						}
					}
					break;

				case 2:
					System.out.print("Escribe tu numero de nomina: ");
					String numeroNomina = pideCadena();
					Profesor profesorUsuario = obtenProfesor(db,numeroNomina);
					if(profesorUsuario == null){
						System.out.println("¡Profesor no encontrado!");
						break;
					} else {
					String nombreProfe = profesorUsuario.getNombre();
					System.out.print("<-- Bienvenid@: " + nombreProfe + " -->");
					}

					boolean sigue = true;
					while(sigue){
						imprimeMenuProfesor();
						System.out.print("-> ");
						int opcionProfesor = pideNumero();
						switch (opcionProfesor) {
							case 1:
								System.out.println("\nTus grupos asignados:\n");
								gruposInscritosP(db,profesorUsuario);
								break;

							case 2:
								System.out.print("Ingresa la clave de la materia: ");
								String claveMateria = pideCadena();
								System.out.print("\nIngresa el numero de grupo: ");
								String numGrupo = pideCadena();
								gruposInscritosP2(db,claveMateria,numGrupo);
								break;

							case 3:
								sigue = false;
								break;

							default:
								System.out.println("No es un numero valido. Vuelve a intentarlo\n");
						}
					}
					break;

				case 3:
					continuar = false;
					break;

				default:
					System.out.println("No es un numero valido. Vuelve a intentarlo");
			}
		}
	}

	public static void gruposInscritosA(DataBase database, Alumno b){
		String matriculaAlumno = b.getMatricula();
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				ArrayList<Alumno> alumnos = g.getListaAlumnos();
				for (int k = 0 ; k < alumnos.size() ; k++ ) {
					Alumno a = alumnos.get(k);
					String matriculaVariante = a.getMatricula();
					if(matriculaAlumno.equals(matriculaVariante)){
						String res = "\tMateria: " + m.getMateria() + " "
									+ m.getNumMateria() + "\n" + g;
						System.out.println(res);
					}
				}
			}
		}
	}

	public static void gruposInscritosP(DataBase database, Profesor p){
		String nominaProfesor = p.getNomina();
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				Profesor aux = g.getProfesor();
				if(aux.getNomina().equals(nominaProfesor)){
					g.imprimeSinAlumnos(m.getMateria(),m.getNumMateria());
				}
			}
		}
	}

	public static void gruposInscritosP2(DataBase database, String claveMateria, String numGrupo){
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				String bob = m.getNumMateria();
				String pat = g.getNumeroDeGrupo();
				if(bob.equals(claveMateria) && pat.equals(numGrupo)){
					g.imprimeAlumnos();
				}
			}
		}
	}

	public static Alumno obtenAlumno(DataBase database, String matriculaAlumno){
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				ArrayList<Alumno> alumnos = g.getListaAlumnos();
				for (int k = 0 ; k < alumnos.size() ; k++ ) {
					Alumno a = alumnos.get(k);
					String matriculaVariante = a.getMatricula();
					if(matriculaAlumno.equals(matriculaVariante)){
						return a;
					}
				}
			}
		}
		return null;
	}

	public static Profesor obtenProfesor(DataBase database, String nominaProfesor){
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				Profesor p = g.getProfesor();
				if(nominaProfesor.equals(p.getNomina())) return p;
			}
		}
		return null;
	}

	public static boolean inscribirseGrupo(DataBase database, Alumno b, String claveMateria, String numeroGrupo){
		ArrayList<Materia> materia = database.getMaterias();
		for (int i = 0 ; i < materia.size() ; i++ ) {
			Materia m = materia.get(i);
			ArrayList<Grupo> grupo = m.getListaGrupos();
			for (int j = 0 ; j < grupo.size() ; j++ ) {
				Grupo g = grupo.get(j);
				ArrayList<Alumno> list = g.getListaAlumnos();
				if(list.size() > 39) return false;
				if(numeroGrupo.equals(g.getNumeroDeGrupo()) && m.getNumMateria().equals(claveMateria)){
					g.agregaAlumno(b);
					return true;	
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		menu();
	}

}