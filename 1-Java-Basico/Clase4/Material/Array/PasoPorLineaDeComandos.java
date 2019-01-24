public class PasoPorLineaDeComandos{
//Este código imprime los argumentos que se pasen por línea de comandos, sea el número de argumentos que sean :3
	public static void main(String[] args) {
		for(String parametro : args){
			System.out.println(parametro);
		}
	}
}
