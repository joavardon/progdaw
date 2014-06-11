package repaso;

import java.util.ArrayList;


public class PruebaViajes {

	public static void main(String[] args) {
		ArrayList<Parada>paradasRuta=new ArrayList<Parada>();
		ParadaLibre paradasRuta1=new ParadaLibre("Toledo","16:00","16:30");
		ParadaGuiada paradasRuta2=new ParadaGuiada("Talavera","18:30","20:30","visTalavera",30);
		ParadaGuiada paradasRuta3=new ParadaGuiada("Oropesa","21:15","01:00","visOropesa",50);
		paradasRuta.add(paradasRuta1);
		paradasRuta.add(paradasRuta2);
		paradasRuta.add(paradasRuta3);
		Viaje miViaje=new Viaje(1,"viaje por toledo", "15:15", "03:15", paradasRuta);
		ParadaGuiada paradasRuta4=new ParadaGuiada("Torrijos","01:45","03:00","visTorrijos",100);
		miViaje.añadirParada(paradasRuta4);
		System.out.println(miViaje.toString());
		System.out.println("El coste total es: "+miViaje.coste());
		miViaje.quitarParada(paradasRuta3);
		System.out.println(miViaje.toString());
		System.out.println("El coste total es: "+miViaje.coste());

	}

}
