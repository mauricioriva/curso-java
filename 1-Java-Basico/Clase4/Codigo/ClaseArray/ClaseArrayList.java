import java.util.ArrayList;

public class ClaseArrayList{
	
	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();

		nombres.add("Diego");
		nombres.add("Patricio");
		nombres.add("Eduardo");

		System.out.println("Numero de elementos: " + nombres.size());

		nombres.add(3,"Alfonsina");

		System.out.println(nombres);

		System.out.println("La cadena que corresponde al indice 2 es: " + nombres.get(2));
		System.out.println("El indice que el corresponde a Alfonsina es el: " + nombres.indexOf("Alfonsina"));
		System.out.println("Alfonsina no es instructora, por lo que hemos sustituido su nombre.");

		nombres.set(nombres.indexOf("Alfonsina"),"Le Tongue");
		System.out.println(nombres);
		System.out.println("Le Tongue tampoco es instructor!!!, hay que eliminarlo");
		nombres.remove(nombres.indexOf("Le Tongue"));
		//nombres.remove(1);

		System.out.println(nombres);
		System.out.println("Vamos a vaciar la lista...");
		nombres.removeAll(nombres);
		System.out.println("Lista vacia! " + nombres);

	}
	
}