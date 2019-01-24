import java.awt.*;
import java.awt.event.*;

class CerrarVentana extends WindowAdapter{
	//Manejamos el evento close window
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

}

class Ventana extends Frame{
	//Instanciar el evento y hacer un listener
	public Ventana(){
		CerrarVentana cv = new CerrarVentana();
		//Se crean componentes 
		addWindowListener(cv);
		Button btn = new Button();
		btn.setLabel("Soy un boton");
		Label lbl = new Label("Hola soy una etiqueta");
		//this.add(elemento,posicion)
		this.add(btn);
		this.add(lbl);
		this.setSize(500,500);
		btn.setSize(100,100);
		this.setTitle("Ejemplo Ventana");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ventana mainFrame = new Ventana();
	}
	
}