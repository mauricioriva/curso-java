
public class UE{
	
	public static void metodo1() throws Exception{
		metodo2();
	}

	public static void metodo2() throws Exception{
		metodo3();
	}

	public static void metodo3() throws Exception{
		Exception e = new Exception("Excepcion del metodo 3");
		throw e;
	}

	

}