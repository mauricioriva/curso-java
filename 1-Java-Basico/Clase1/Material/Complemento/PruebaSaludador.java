public class PruebaSaludador{

	public static void main(String[] args){

		
		Saludador persona1 = new Saludador("Eduardo");
		Saludador persona2 = new Saludador("Juan",30,true);
		Saludador persona3 = new Saludador("Ana",23,false);

		persona1.saludar();
		persona2.saludar();
		persona3.saludar();

		Saludador2.saludar();

		
		/*
		int a=4;

		System.out.println(++a);
		System.out.println(a++);
		*/

	}

}