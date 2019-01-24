import java.util.ArrayList;

public class UsoControlRemoto{
	
	public static void main(String[] args) {
		
/* 	EJEMPLO 1
		//POLIMORFISMO
		Encendible e1 = new Television();
		Computadora c1 = new Computadora();

		ControlRemoto cr = new ControlRemoto(e1,c1);

		cr.oprimirBoton1();
		cr.oprimirBoton2();

		Encendible e1 = new Television();
		Computadora c1 = new Computadora();
		Lampara l1 = new Lampara();
		Lampara l2 = new Lampara();

		ArrayList<ControlRemoto> lcr = new ArrayList<ControlRemoto>();
		lcr.add(new ControlRemoto(e1,c1));
		lcr.add(new ControlRemoto(l1,l2));
*/

		Encendible le[] = new Encendible[4];
		le[0] = new Computadora();
		le[1] = new Television();
		le[2] = new Lampara();
		le[3] = new Lampara();

		ArrayList<ControlRemoto> lcr = new ArrayList<ControlRemoto>();
		lcr.add(new ControlRemoto(le[0],le[1]));
		lcr.add(new ControlRemoto(le[2],le[3]));

		lcr.get(0).oprimirBoton1();
		lcr.get(0).oprimirBoton2();
		lcr.get(1).oprimirBoton1();
		lcr.get(1).oprimirBoton2();

	}

}