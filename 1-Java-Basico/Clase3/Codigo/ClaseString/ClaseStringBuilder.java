
public class ClaseStringBuilder{
	
	public static void mutable(StringBuilder sb){
		sb.append("hola ");
		sb.append("mundo");
	}


	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("Antes de funcion: " + sb);
		mutable(sb);
		System.out.println("Despues de funcion: " + sb);

		sb.delete(0,4);
		System.out.println("Borrando del 0 al 4: " + sb);

		sb.insert(0, "adios");
		System.out.println("Insertando adios: " + sb);

		sb.reverse();
		System.out.println("Cadena volteada: " + sb);

		String cadena = sb.toString();
		System.out.println(sb);

	}

}