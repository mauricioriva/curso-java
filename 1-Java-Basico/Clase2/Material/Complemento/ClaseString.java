public class ClaseString{

    public static void main(String[] args) {
        //Creacion de Strings
        String cadena1 = "Hola";
        String cadena2 = "Hola"; // Forma correcta
        String cadena3 = new String("Hola");  // Forma incorrecta
        
        String cadena4 = cadena1 + cadena2;
        // tamaño

        //Metodos Estaticos
        /*
            %s - cadenas
            %d - entero
            %lf - flotantes
            %c - caracter
        */
        System.out.println("FUNCIONES ESTATICAS");
        int entero = 40;
        String textoFormato = String.format("cadena: %s Entero: %d Flotante: lf", cadena1, entero, Math.PI);
        //casteo de cualquier cosa a string
        String valorDecimal = String.valueOf(Math.PI); 
        // tambien valido   valorDecimal = Math.PI + ""
        System.out.println(textoFormato);
        System.out.println(valorDecimal);
        System.out.println("\n");

        //Funciones que regresan booleano
        System.out.println("FUNCIONES QUE REGRESAN BOOLEANO");
        String comparar = "ho";
        System.out.println("cadena1 == cadena3 "+cadena1 == cadena3);
        System.out.println("cadena1 equals cadena3 "+cadena1.equals(cadena3));
        System.out.println("cadena1 contiene o "+cadena1.contains("o"));
        System.out.println("cadena1 empieza con "+cadena1.startsWith(comparar));
        System.out.println("cadena1 termina con "+cadena1.endsWith(comparar));
        System.out.println("\n");

        //relacionado con el indice
        System.out.println("FUNCIONES RELACIONADAS CON EL INDICE");
        String analizar = "mama";
        char c = analizar.charAt(1);
        int indice1 = analizar.indexOf("ma");
        int indice2 = analizar.lastIndexOf("ma");

        System.out.println("Caracter en la posicion 1 "+c);
        System.out.println("indice del primer \"ma\" en mama = "+indice1);
        System.out.println("indice del ultimo \"ma\" en mama = "+indice2);
        System.out.println("\n");

        // divisiones
        System.out.println("FUNCIONES RELACIONADAS CON DIVIDIR CADENAS");
        String palabra = "anita lava la tina";
        int indicePrincipio = 1;
        int indiceFinal = 6;
        String palabrita = palabra.substring(indicePrincipio, indiceFinal);
        System.out.println("la palabra "+palabra+" del indice "+indice1
                            +" al indice "+indice2+ " es "+palabrita);
        //split la veo el miercoles por el uso de arreglos

        System.out.println("");

        // limpieza
        System.out.println("FUNCIONES RELACIONADAS CON LA LIMPIEZA DE CADENAS");
        String cadenaSucia = "       soY una CADENa sucIa xdddd   ";
        String cadenaSinCosasALosLados = cadenaSucia.trim();
        String cadenaTodasMayusculas = cadenaSinCosasALosLados.toUpperCase();
        String cadenaTodoAMinusculas = cadenaSinCosasALosLados.toLowerCase();
        String cadenaLimpia = cadenaTodoAMinusculas.replace("sucia", "limpia");
        System.out.println(cadenaSucia);
        System.out.println(cadenaSinCosasALosLados);
        System.out.println(cadenaTodasMayusculas);
        System.out.println(cadenaTodoAMinusculas);
        System.out.println(cadenaLimpia);
    }
}