package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploCincoFrases {

	public static void main(String[] args) {
		String[] cadena;
		cadena=new String [5];
		
		for(int i=0;i<5;i++){
			Scanner teclado = new Scanner (System.in);
	        System.out.println("Introduce una frase: ");
			cadena[i]=teclado.nextLine();
			}
		

		for(int i=0;i<5;i++){
			System.out.println(cadena[i]);}	
		}
}
