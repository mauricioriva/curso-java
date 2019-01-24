
public final class MathSimplificada{

	private MathSimplificada(){

	}

	public static void diferentesRedondeos(double valor){
		System.out.println("El numero a redondear = " + valor);
		
		//Redondeo hacia abajo
		int porFloor = (int)Math.floor(valor);
		
		//Redondeo hacia arriba
		int porCeil = (int)Math.ceil(valor);
		
		//Redondeo mas cercano
		int porRound = (int)Math.round(valor);
		
		//Quita los decimales
		int porCast = (int) valor;

		System.out.println("Redondeo por floor: " + porFloor);
		System.out.println("Redondeo por ceil: " + porCeil);
		System.out.println("Redondeo por round: " + porRound);
		System.out.println("Redondeo por cast: " + porCast);

	}

	//intervalo [0,1) -> (a,b)
	public static int aleatorio(int a, int b){
		return (int)(Math.random()*(b-a+1)+a);
	}
}