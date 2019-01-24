import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicados {
 
	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
 
		System.out.println("Números pares:");
		evaluar(listaNumeros, (n)-> n%2 == 0 );
 
		System.out.println("Números impares:");
		evaluar(listaNumeros, (n)-> n%2 == 1 );
 
		System.out.println("Números mayores a 5:");
		evaluar(listaNumeros, (n)-> n > 5 );
 
	}
	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for(Integer n: listaNumeros)  {
			//si n se cumple entonces imprime el numero
			if(predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}