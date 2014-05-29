package ejemplosGraphics2;

import java.awt.Point;
import graphics2.*;

public class ejemplo2 {


	public static void main(String[] args) {
		
		Rectangle cuadrado;
			
			cuadrado=new Rectangle (100,100,300,300);
			cuadrado.setThickness(20f);//ancho
			cuadrado.setColor(Color.RED);
			cuadrado.draw();
			Ellipse circulo;

			circulo=new Ellipse (150,150,35,35);
			circulo.setThickness(20f);//ancho
			circulo.setColor(Color.BLUE);
			
			
			Canvas c;
			c=Canvas.getInstance();
			c.waitMouseClick();
			
			Text texto=new Text(10,10,"-");
			texto.draw();
			circulo.fill();
			/*
			while(true){
				Point pulsation=c.waitMouseClick();
				circulo.undraw();
				texto.setText(pulsation.x+"-"+pulsation.y);
				circulo.translate(pulsation.x-circulo.getX()-circulo.getWidth()/2,pulsation.y-circulo.getY()-circulo.getHeight()/2 );
				System.out.println("Has pulsado en: "+pulsation.x+"-"+pulsation.y);
				}
			*/
			while(true){
				Point pulsation=c.waitMouseClick();
				circulo.undraw();
				texto.setText(pulsation.x+"-"+pulsation.y);
				circulo=new Ellipse(pulsation.x-30,pulsation.y-30,60,60);
				circulo.setColor(Color.BLUE);
				circulo.fill();
				System.out.println("Has pulsado en: "+pulsation.x+"-"+pulsation.y);
				}
			
			
			
			
		}


}
