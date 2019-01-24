
public class SucursalOxxo{
	
	String direccion;
	String rfc;
	private double ganancias;
	int nEmpleados, nMercancias;
	//No se puede modificar y se tiene que declarar con final
	final int precio = 50;
	static int contador = 0;

	public SucursalOxxo(String direccion, String rfc, int nEmpleados){
		this.direccion = direccion;
		this.rfc = rfc;
		this.ganancias = 0;
		this.nEmpleados = nEmpleados;
		this.nMercancias = 100;
		contador++;
	}

	public void vender(int elementosVendidos){
		ganancias = elementosVendidos*precio;
		nMercancias = elementosVendidos;
	}

	public double getGanancias(){
		return ganancias;
	}

	public String toString(){
		String cadena = "Direccion: " + direccion + "\tRFC: " + rfc + "\tEmpleados: " + nEmpleados + "\t";
		return cadena;
	}

	

}