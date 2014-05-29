package ejemplosGraphics2;
import java.awt.Point;
import graphics2.*;
public class pelota {

		public static void main(String[] args) throws InterruptedException {
			
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
				
				while(true){
					Point pulsation=c.getMousePosition();
					circulo.undraw();
					texto.setText(pulsation.x+"-"+pulsation.y);
					circulo=new Ellipse(pulsation.x-30,pulsation.y-30,60,60);
					circulo.setColor(Color.BLUE);
					circulo.fill();
					//System.out.println("Has pulsado en: "+pulsation.x+"-"+pulsation.y);
					Thread.sleep(100);
					}
					
	}
}
