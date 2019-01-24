@FunctionalInterface
public interface IFuncionLambda {
	//método abstracto para sumar 2 números, que lo implementará el programador a partir de una expresión Lambda
	public void suma(int a, int b);	

	public default String sume()
	{
		return "Acabas de sumar :v";
	}
}