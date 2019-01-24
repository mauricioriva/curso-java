import java.util.*;

public class ClaseMap{

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		System.out.println(mapa);
		mapa.put("mauricio", 7);
		mapa.put("derek", 8);
		mapa.put("mauricio1", 13);
		System.out.println(mapa);

		//claves
		Set<String> claves = mapa.keySet();
		System.out.println("Las claves son: "+claves);

		//valores
		Collection<Integer> valores = mapa.values();
		System.out.println("Los valores son "+valores);

		int computadora = mapa.get("derek");
		System.out.println("derek esta en la compu "+computadora);

		boolean seEncuentraPato = mapa.containsKey("pato");
		System.out.println("Se encuentra pato? "+seEncuentraPato);

		boolean seEncuentraLaMaquina9 = mapa.containsValue(3);
		System.out.println("Se enuentra la maquina 9? "+seEncuentraLaMaquina9);
	}

	public static String buscarNombre(HashMap<String, Integer> mapa, 
										int computadora){
		for(String nombre : mapa.keySet()){
			if(mapa.get(nombre) == computadora){
				return nombre;
			}
		}
		return null;
	}
}