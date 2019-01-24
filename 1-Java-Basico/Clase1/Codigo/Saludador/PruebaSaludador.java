
public class PruebaSaludador {

	public static void main(String[] args) {
		//Los objetos son persona1 y persona2
		//Los objetos almacenan instancias (new Saludador...)
		Saludador persona1 = new Saludador("Mau");
		Saludador persona2 = new Saludador("Pedro",30,true);
		Saludador persona3 = new Saludador("Sofia",25,false);

		persona1.saludar();

		persona2.saludar();

		persona3.saludar();

	}

}