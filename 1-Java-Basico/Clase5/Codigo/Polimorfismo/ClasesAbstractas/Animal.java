
public abstract class Animal{

	//Una clase abstracta tiene como minimo un metodo abstracto

	//Garantizas que cualquier animal que herede de la clase tenga que hacer un sonido
	public abstract void hacerSonido();

	public abstract void comer();

	public void dormir(){
		System.out.println("Estoy durmiendo");
	}

}