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
		
		for(int i=0;i<numero;i++){
			for(int j=0;j<=i;j++){
				System.out.print("@");
			}
			System.out.println();
		}
			

		for(int i=0;i<numero;i++){
			//filai
			for(int j=numero-i;j>0;j--){
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int i=0;i<numero;i++){
			//filai
			for(int j=0;j<numero-i;j++){
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int i=0;i<numero;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<numero-i;j++){
				System.out.print("@");
			}
			System.out.println();
		}
		//se coge el primero y se le añaden blancos delante y blancos entre los asteriscos
		for(int i=0;i<numero;i++){
			for(int j=0;j<numero-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		
	}

}
