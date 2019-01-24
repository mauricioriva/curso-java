import java.util.function.Function;

public class Cadena
{
	public static void main (String[] args)
	{
	Function<String, Integer> tamanioCadena = str -> str.length();
	String cadena = "Lambdas tipo funciones";
	System.out.println("Número de caracteres es : " + tamanioCadena.apply(cadena));
	}
}