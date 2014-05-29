package ejercicios;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		
		caja = new Rectangle(10,10,60,100);
		caja.draw();
		
		palo = new Rectangle(30,120,5,100);
		palo.draw();
		
		palo.fill();
		
		verde=new Ellipse(35,80,20,20);
		verde.setColor(new Color(0,200,0));
		ambar=new Ellipse(35,55,20,20);
		ambar.setColor(new Color(255,255,0));
		rojo=new Ellipse(35,30,20,20);
		rojo.setColor(new Color(255,0,0));

		verde.fill();
		ambar.fill();
		rojo.fill();
	}

}