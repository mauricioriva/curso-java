
public class UsoExcepciones{
	
	public static void main(String[] args) {
		
		try{
		
			lanzarExcepcion();
		
		}catch (Exception e) {
			
			System.err.println(e.getMessage());

		}finally{
			System.out.println("Se ejecuto el metodo main");
		}

	}

	public static void lanzarExcepcion() throws Exception{
		try{
			Exception excepcion = new Exception();
			System.out.println("Lanzando Excepcion");
			throw excepcion;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			throw new Exception("Otro mensaje de error");
		}finally{
			System.out.println("Se ejecuto el metodo lanzarExcepcion");
		}
	}

}