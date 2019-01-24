public class ClaseInteger{
    public static void main(String[] args) {
        // Constantes
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        String quinceEnHexadecimal = Integer.toHexString(15);
        String quinceEnOctal = Integer.toOctalString(15);
        String quinceEnBinario = Integer.toBinaryString(15);

        System.out.println("Maximo valor = "+ max);
        System.out.println("Maximo valor = "+ min);
        System.out.println("15 en hexadecimal = "+quinceEnHexadecimal);
        System.out.println("15 en octal = "+quinceEnOctal);
        System.out.println("15 en binario = "+quinceEnBinario);

    }
}