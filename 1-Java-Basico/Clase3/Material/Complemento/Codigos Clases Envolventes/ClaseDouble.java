public class ClaseDouble{

    public static void main(String[] args) {

        //Constantes defininas
        Double maximo = Double.MAX_VALUE;
        Double minimo = Double.MIN_VALUE;
        Double noUnNumero = Double.NaN; // Not a number
        Double infinitoNegativo = Double.NEGATIVE_INFINITY;
        Double infinitoPositivo = Double.POSITIVE_INFINITY;

        //Funciones definidas
        System.out.println(Double.isInfinite(5.0/0));
        System.out.println(Double.isNaN(5.0 % 0));
        ;
    }
}