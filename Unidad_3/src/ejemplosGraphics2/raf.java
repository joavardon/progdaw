package ejemplosGraphics2;

import graphics2.*;
public class raf {


	public static void main(String[] args) {
		
		
		Ellipse circulo;

		circulo=new Ellipse (50,50,300,300);
		circulo.setThickness(20f);//ancho
		circulo.setColor(Color.BLUE);
		circulo.fill();
		
		Ellipse circulo1;

		circulo1=new Ellipse (100,100,200,200);
		circulo1.setThickness(20f);//ancho
		circulo1.setColor(Color.WHITE);
		circulo1.fill();

		Ellipse circulo2;

		circulo2=new Ellipse (150,150,100,100);
		circulo2.setThickness(20f);//ancho
		circulo2.setColor(Color.RED);
		circulo2.fill();

		
		
	}

}
