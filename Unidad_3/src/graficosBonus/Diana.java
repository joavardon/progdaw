package graficosBonus;

import graphics.Color;
import graphics.Ellipse;

public class Diana {


	public static void main(String[] args) {
		Color[]colores;
		int centro_x,centro_y;
		colores = new Color[5];
		int distancia;
		int anterior;
		colores[0]=new Color(255,0,0);
		colores[1]=Color.CYAN;
		colores[2]=Color.DARK_GRAY;
		colores[3]=Color.YELLOW;
		colores[4]=Color.BLACK;
		
		distancia=15;
		centro_x=200;
		centro_y=200;
		
		anterior=-1;
		
		//poner colores alos circulos concentricos sin que se repita el color entre uno y el siguiente.
		for(int i=10;i>0;i--){
			Ellipse circulo;
			int actual;
			circulo=new Ellipse(centro_x-i*distancia/*(200-15*i)*/,centro_y-i*distancia,distancia*i*2,distancia*i*2);
			do{
				actual=
			}while(anterior==actual);
			
			circulo.setColor(colores[actual]);
			circulo.fill();
			anterior=actual;
		}

	}

}
