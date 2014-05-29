/*
 * Ejercicio 1. Escribe un programa que genere los seis números aleatorios de la lotería primitiva.
 *  No puede haber números repetidos.
 */
package ordenacion_busquedas;

import java.util.Scanner;

public class Loteria {

	static int[] loteria(int[] loteria){
		int c=0;
		boolean esta = false;
		do{
			
			int numero=(int)(Math.random()*49+1);
				for(int i=0;i<loteria.length;i++){
						if(loteria[i]==numero){
							esta=true;
							break;
							}
				}
				
				if(esta==false){
					loteria[c]=numero;
					c++;
				}
				esta=false;
		}while(c<6);
		return loteria;
	}
	static void imprimir(int[]l){
		for(int i=0;i<l.length;i++){
			System.out.println(l[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]loteria=new int[6];
		imprimir(loteria(loteria));
		
	}

}
