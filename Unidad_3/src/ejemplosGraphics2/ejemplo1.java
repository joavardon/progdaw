package ejemplosGraphics2;
import java.awt.Point;

import graphics2.*;
public class ejemplo1 {


	public static void main(String[] args) {
		Rectangle cuadrado;
		
		cuadrado=new Rectangle (100,100,300,300);
		cuadrado.setThickness(20f);//ancho
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		Ellipse circulo;

		circulo=new Ellipse (150,150,200,200);
		circulo.setThickness(20f);//ancho
		circulo.setColor(Color.BLUE);
		circulo.fill();
		
		Canvas c;
		c=Canvas.getInstance();
		c.waitMouseClick();
		
		
		//Canvas.getInstance().waitMouseClick();
		circulo.undraw();
		while(true){
		Point pulsation=c.waitMouseClick();
		System.out.println("Has pulsado en: "+pulsation.x+"-"+pulsation.y);
		}
	}

}
