package examen;

import graphics.Color;
import graphics.Rectangle;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int lado;
		do{
		System.out.println("Dame el lado del cuadrado ([100,200)]:");
		lado=teclado.nextInt();
		}while(lado<100 || lado>200);
		
		System.out.println("Dame los valores del color (R,G,B):");
		int[] colores=new int [3];
		int c=0;
		int color;
		do{
			color=teclado.nextInt();
			if(color>0 && color<=255){
			
			colores[c]=color;
			c++;}

		}while(c<3);
		
		Color col=new Color(colores[0],colores[1],colores[2]);
		Rectangle cuadrado=new Rectangle(250,250,lado,lado);
		cuadrado.setColor(col);
		cuadrado.fill();
		
		}
		
		
	
}
