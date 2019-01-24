public class TestLambdas {
 
	public static void main(String[] args) {
 
		int x = 10;
		int y = 5;
		
		//se implementa el método de la interfaz con una expresión lambda
		IFuncionLambda iflambda = (a, b) -> {
			System.out.println(a + b);
		};
		//se utiliza el método con la implementación y se le envía los valores de x e y
		iflambda.suma(x, y);
		System.out.println(iflambda.sume());
	}
}