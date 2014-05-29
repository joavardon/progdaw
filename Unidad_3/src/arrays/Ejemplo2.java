//pide diez numeros y los imprimes al reves con array

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo2 {

	
	public static void main(String[] args) {
		int[] enteros;
		//int[] enteros1;
		enteros=new int [10];
		//enteros1=new int[10];
		for(int i=0;i<10;i++){
			Scanner teclado = new Scanner (System.in);
	        System.out.println("Introduce un numero: ");
			enteros[i]=teclado.nextInt();}
		System.out.println();
		System.out.println(Arrays.toString(enteros));
		for(int i=9;i>=0;i--){
			System.out.print(enteros[i]+" ");}
		
		System.out.println();
		System.out.println(Arrays.toString(enteros));
		/*
		for(int j=9;j>=0;j--){
			Scanner teclado = new Scanner (System.in);
	        System.out.println("Introduce un numero: ");
			enteros[j]=teclado.nextInt();}
		for(int j=0;j<10;j++){
			System.out.print(enteros[j]+" ");}
		System.out.println();
		System.out.println(Arrays.toString(enteros));*/
	}	
}
