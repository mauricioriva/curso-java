public class PruebaAnimales{
	public static void main(String[] args) {
		Animal a1;
		Animal a2;
		Animal a3;

		a1 = new Leon();
		a2 = new Tigre();
		a3 = new Vaca();

		a1.dormir();
		a2.dormir();
		a3.dormir();
		System.out.println();
		a1.comer();
		a2.comer();
		a3.comer();
		System.out.println();
		a1.hacerSonido();
		a2.hacerSonido();
		a3.hacerSonido();

	}
}