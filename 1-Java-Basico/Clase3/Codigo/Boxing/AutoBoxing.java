
public class AutoBoxing{
	
	public static void funcion(Integer i){
		System.out.println("Dentro de la funcion: " + i);
	}

	public static void mutabilidad(Integer i){
		i = i + 1;
	}

	public static void main(String[] args) {
		int i = 5;
		funcion(i);

		Integer entero = i;
		System.out.println("Asignacion: " + entero);

		mutabilidad(i);
		System.out.println("Al final: " + i);

	}

}