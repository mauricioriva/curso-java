import java.util.*;

public class ClaseMap{

	public static void main(String[] args) {
		//K: Clase que proporciona objetos inmutables
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
		System.out.println(mapa);

		mapa.put("mauricio",7);
		mapa.put("derek",8);
		mapa.put("mauricio1",13);

		System.out.println(mapa);
		//Claves
		Set<String> claves = mapa.keySet();
		System.out.println("Las claves son: " + claves);

		//Valores
		Collection<Integer> valores = mapa.values();
		System.out.println(valores);

		int computadora = mapa.get("derek");
		System.out.println("derek esta en la compu: " + computadora);

		boolean seEncuentraPato = mapa.containsKey("pato");
		System.out.println("Se encuentra pato?: " + seEncuentraPato);

		boolean seEncuentraMaquina9 = mapa.containsValue(9);
		System.out.println("Se encuentra la maquina 9?: " + seEncuentraMaquina9);

		String res = buscarNombre(mapa,8);
		System.out.println(res);
	}

	public static String buscarNombre(HashMap<String, Integer> mapa, int computadora){
		for (String nombrePersona : mapa.keySet() ) {			
			if (mapa.get(nombrePersona).equals(computadora)) {
				return nombrePersona;
			}
		}
		
		return null;

	}

}