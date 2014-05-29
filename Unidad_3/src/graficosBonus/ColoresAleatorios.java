package graficosBonus;

import graphics.Color;
import graphics.Ellipse;

public class ColoresAleatorios {

	public static void main(String[] args) throws InterruptedException {
		
		Color[] colores;
		colores=new Color[5];
		colores[0]=new Color(255,0,0);
		colores[1]=Color.CYAN;
		colores[2]=Color.GREEN;
		colores[3]=Color.YELLOW;
		colores[4]=new Color(125,255,0);
		
		Ellipse circulo=new Ellipse(100,100,300,300);
		while(true){
			
			circulo.setColor(colores[(int)(Math.random()*5)]);//elige color de forma aleatoria 
			circulo.fill();
			Thread.sleep(500);
		}
		
	}

}
