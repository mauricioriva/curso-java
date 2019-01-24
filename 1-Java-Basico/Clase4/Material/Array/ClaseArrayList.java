import java.util.ArrayList;
import java.util.Iterator;
//Documentación completa: https://docs.oracle.com/javase/9/docs/api/java/util/ArrayList.html
public class ClaseArrayList{
	public static void main(String[] args) {
		//Un ArrayList ofrece ventajas frente a un objeto de Arrays
		//Es dinámico, ofrece métodos para insertar y
		//eliminar elementos de una lista.
		ArrayList<String> nombres = new ArrayList();
		System.out.println("Justo ahora, el ArrayList nombres existe, pero está vacío!!!");
		System.out.println("El arreglo tiene "+nombres.size()+" elementos"); //El método size nos dice cuántos elementos contiene el ArrayList
		
		//Mediante el método add, se añaden elementos al ArrayList
		//Cuando se le pasa un solo argumento, se añade al final de la lista
		nombres.add("Diego");
		nombres.add("Patricio");
		nombres.add("Eduardo");
		System.out.println("El arreglo ahora tiene "+nombres.size()+" elementos:");
		System.out.println(nombres.toString());//El método toString funciona igual que con los Arrays
		
		//Si sobrecargamos el método add, podemos pasarle dos argumentos: lista.add(indice, elemento a insertar)
		nombres.add(1,"Alfonsina");
		System.out.println("El arreglo ahora tiene "+nombres.size()+" elementos:");
		System.out.println(nombres.toString());
		
		//Uso del método get()
		//Sirve para obtener el elemento que se especifique como argumento (mediante su índice)
		System.out.println("La cadena que corresponde al índice 2 es: "+nombres.get(2));
		
		//Método indexOf: Sirve para obtener el índice de la'primer coincidencia del elemento especificado como argumento
		//De no contener dicho elemento, el método regresa un -1 
		System.out.println("El índice que le corresponde a Alfonsina es el: "+nombres.indexOf("Alfonsina"));

		//También, es posible usar iteradores: un iterador es un objeto que nos permite recorrer una lista.
		//Los métodos hasNext() y next() son métodos que usaremos con tal objetivo.
		Iterator<String> iTeRaDor = nombres.iterator();
		System.out.println("Los elementos de la lista impresos en pantalla mediante un iterador, son:");
		while(iTeRaDor.hasNext()){
			System.out.println(iTeRaDor.next());
		}

		//Método set(): Sirve para sustituir elementos en un ArrayList, especificando la posición en la que lo queremos hacer
		System.out.println("Alfonsina no es instructora del curso, por lo que hemos sustituido su nombre:");
		int indiceDeAlfonsina = nombres.indexOf("Alfonsina");
		nombres.set(indiceDeAlfonsina,"Le Tongué");
		System.out.println(nombres.toString());


		//Método remove(): Sirve para quitar un elemento de la posición especificada, puede especificarse mediante su índice
		System.out.println("¡Le Tongué tampoco es instructor del curso! Hay que eliminar su nombre:");
		nombres.remove(indiceDeAlfonsina);
		System.out.println(nombres.toString());

		//Método removeAll(): Sirve para eliminar todos los elementos presentes en la lista especificada.
		System.out.println("Vaciando la lista...");
		nombres.removeAll(nombres);
		System.out.println("¡Lista vacía!");
		System.out.println(nombres.toString());

	}
}
