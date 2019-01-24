import java.util.function.Supplier;

public class Proveedor{

    public static void main(String[] args) {
        
        Supplier<Persona> suppler = Proveedor :: llenarPersona;
        
        Persona per = suppler.get();

        System.out.println(per.getNombre());

    }

    private static Persona llenarPersona() {
        
        return new Persona("Pablo","andrade","Roma");

    }

}