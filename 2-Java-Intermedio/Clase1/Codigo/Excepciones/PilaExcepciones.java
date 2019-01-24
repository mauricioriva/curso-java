
public class PilaExcepciones{
	
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

	public static void main(String[] args) {
		try{
			//UE.metodo1(); Para que aparezca desde la clase UE
			metodo1();
		}catch (Exception e) {
			System.err.println(e.getMessage());
			StackTraceElement elementosRastreo [] = e.getStackTrace(); 
			System.out.println("Rastreo de la pila Stack Trace de la excepcion: ");
			System.out.println("Clase\t\tArchivo\t\t\tLinea\tMetodo");
			for (StackTraceElement ste : elementosRastreo) {
				System.out.printf("%s\t",ste.getClassName());
				System.out.printf("%s\t",ste.getFileName());
				System.out.printf("%s\t",ste.getLineNumber());
				System.out.printf("%s\n",ste.getMethodName());
			}
		}
	}


}