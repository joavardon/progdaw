/*Crea una colecci�n con los primeros X n�meros de la serie de Fibonacci, 
donde X es un n�mero que pedir�s al usuario. Despu�s pregunta n�meros 
y di si est� en esa serie o no. 
El programa terminar� cuando el usuario introduzca un 0.*/
package ejerciciosPracticar;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		int[] serie={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("EScribe un numero: ");
		int numero=teclado.nextInt();
		
	
		int numeros = 0;
		boolean seguir=true;
		boolean esta=false;
		
		do{
			System.out.println("�Est� en la serie el n�mero: ? ");
			numeros=teclado.nextInt();
			
			
			for(int i=0;i<numero && seguir==true  ;i++){
				
				if (numeros==serie[i]){
					System.out.println("esta");
					esta=true;
					seguir=false;
					}
				else{
					esta=false;
				}
				
			}
			if(!esta){
				System.out.println("no est� ");
			}
			}while( seguir=true && numeros!=0 );
			
		
		
		
		
	}

}
