public class ClaseStringBuilder{

    public static void llenarStringBuilder(StringBuilder sb){
        // anadir elementos
        sb.append("hola ");
        sb.append("soy ");
        sb.append("pato");
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        llenarStringBuilder(sb); // Probamos su mutabilidad
        System.out.println(sb);

        // Convertir a string
        String cadena = sb.toString();

        sb.delete(0, 5); // borra incluye ambos indices
        System.out.println("Borrando del 0 al 5 "+sb);

        sb.insert(0, "Adios "); //en que posicion y que
        System.out.println("Insertando adios en la posicion 0 "+sb);

        sb.reverse();
        System.out.println("Al reves");
        
    }
}