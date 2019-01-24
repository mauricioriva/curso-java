//Devuelve true o false
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicados{

    public static void main(String[] args) {
        
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Numeros pares: ");
        evaluar(listaNumeros, (n) -> n%2 == 0);

        System.out.println("Numeros impares: ");
        evaluar(listaNumeros, (n) -> n%2 == 1);

        System.out.println("Numeros mayores a 5: ");
        evaluar(listaNumeros, (n) -> n > 5);

    }

    public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado){
        for (Integer n : listaNumeros) {
            if (predicado.test(n)) {
                System.out.println(n + " ");
            }
        }
        System.out.println();
    }

}