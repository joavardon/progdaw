//pedir el numero de nombres, leerlos de teclado y mostrarlos por orden alfabetico
package cadenas;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		System.out.println("¿cuantos nombre quieres pedir?: ");
		int numNombres=teclado.nextInt();
		String[]nombres=new String[numNombres];
		/*
		for(int i=0;i<nombres.length;i++){
			System.out.println("Escribe un nombre: ");
			nombres[i]=teclado.next();
		}
		*/
		//meto los nombres en el array
		for(int i=0;i<nombres.length;i++){
			System.out.println("Escribe un nombre: ");
			nombres[i]=teclado.next();
			
		}
		
		//comparo cada nombre del array con todos los nombres del array y en caso de ser menores los pongo antes
		for(int i=0;i<nombres.length;i++){
				for(int j=0;j<nombres.length;j++){
				if(nombres[i].toLowerCase().compareTo(nombres[j].toLowerCase())<0){
					String aux=nombres[i];
					nombres[i]=nombres[j];
					nombres[j]=aux;
				}
			}		
		}
		//Arrays.sort(nombres);
		for(int i=0;i<nombres.length;i++){
			System.out.print(nombres[i]+" ");
		}
	}

	

}
