package examen;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número de filas: ");
		int numero=teclado.nextInt();
		
		int cont=numero;
		for(int i=0;i<numero;i++){
			
			for(int j=0;j<cont;j++){
					System.out.print("@");
					
				}
		
			System.out.println();
			cont--;
					}
		
		int cont1=numero;
		for(int i=numero;i<0;i++){
			
			for(int j=numero;j<cont1;j++){
					System.out.print("@");
					
				}
		
			System.out.println();
			cont1--;
					}
		int elim=numero-1;
		int elim2=numero-1;
		
		for (int k=0;k<numero;k++){
			for(int j=0;j<numero;j++){
				
				if (j<=elim && j>=elim2){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
				
			}
			System.out.println();
			elim++;
			elim2--;
		}
		

	}

}
