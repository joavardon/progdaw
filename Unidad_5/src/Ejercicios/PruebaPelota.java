package Ejercicios;

import graphics2.Rectangle;

public class PruebaPelota {


	public static void main(String[] args) throws InterruptedException {
		Pelota p = new Pelota();
		p.setLimites(10,10,430,430);
		(new Rectangle(10,10,430,430)).draw();
		//p.setPaso(5);
		p.dibuja();
		
		while(true){
			p.mueve();
		}
		

	}

}
