import java.util.function.Consumer;

public class Consumidor{

    public static void main(String[] args) {
        
        Consumer<Persona> persona = (p) -> System.out.println("Hola, " + p.getNombre());
        persona.accept(new Persona("Jorge","Ramirez","Japon"));
        
    }

}