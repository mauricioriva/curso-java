import java.util.PriorityQueue;

public class Colecciones{
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<String>();

        pq.add("hola");
        pq.add("soy");
        pq.add("groot");

        System.out.println("Coleccion: " + pq);

        pq.remove("soy");

        System.out.println("Quita elemento \"soy\": " + pq);

        String cabeza = pq.peek();

        System.out.println("Cabeza de la coleccion: " + cabeza);

    }

}