public class ClaseBoolean{

    public static void main(String[] args) {
        // Valores de true y false
        Boolean positivo = Boolean.TRUE;
        Boolean negativo = Boolean.FALSE;

        // COMPUERTAS LOGICAS
        System.out.println("true and false = "+ Boolean.logicalAnd(positivo, negativo));
        System.out.println("true and true = "+ Boolean.logicalAnd(positivo, positivo));
        System.out.println("true and false = "+Boolean.logicalOr(positivo, negativo));
        System.out.println("true and true = "+Boolean.logicalOr(positivo, positivo));
        System.out.println("true and false = "+Boolean.logicalXor(positivo, negativo));
        System.out.println("true and true = "+Boolean.logicalXor(positivo, positivo));
    }
}