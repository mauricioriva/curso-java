public class ControlRemoto{

	private Encendible e1, e2;

	public ControlRemoto(Encendible e1, Encendible e2){
		this.e1 = e1;
		this.e2 = e2;
	}

	public void oprimirBoton1(){
		e1.encender();
	}

	public void oprimirBoton2(){
		e2.encender();
	}

}