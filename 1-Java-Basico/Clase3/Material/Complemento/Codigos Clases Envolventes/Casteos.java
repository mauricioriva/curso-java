public class Casteos{

    public static void imprimirInteger(Integer i){
        System.out.println(i);
    }

    public static void imprimirInt(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        // casteos de strings a datos primitivos a traves de clases envolventes
        String num1 = "4.5634";
        double numero = Double.parseDouble(num1); //tambien existe en Float

        String num2 = "234234";
        int entero = Integer.parseInt(num2); //tambien existen en Long, Short, Byte

        String booleano = "true";
        boolean bool = Boolean.valueOf(booleano);

        System.out.println("IMPRESION DE CASTEOS");
        System.out.println(num1+ " a "+numero);
        System.out.println(num2+ " a "+entero);
        System.out.println(booleano+ " a "+bool);
        System.out.println("\n");

        // Autoboxing
        System.out.println("UNBOXING Y AUTOBOXING");
        Character c = 'c'; //AUTOBOXING
        boolean b = new Boolean("true"); // UNBOXING
        System.out.println(c);
        System.out.println(b);
        imprimirInteger(34); // AUTOBOXING
        imprimirInt(new Integer(34)); // UNBOXING
    }
}
