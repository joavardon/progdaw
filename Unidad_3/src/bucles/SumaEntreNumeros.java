/*Escribe un programa que pida dos números con el fin de visualizar la suma 
de todos los números que hay entre ambos números (incluidos dichos números). 
Si el primer número que inserte el usuaruio es mayor que el segundo, 
se volverán a pedir otros dos números hasta que 
el primer número insertado sea menor o igual que el segundo.*/
package bucles;

import java.util.Scanner;

public class SumaEntreNumeros {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		do{
		System.out.println("Escribe un numero: ");
		num1=teclado.nextInt();
		System.out.println("Escribe otro numero: ");
		num2=teclado.nextInt();}
		while(num2<num1);
		
		
		int suma=0;
		
		for(int i=num1;i<=num2;i++){
			suma=suma+i;}
		System.out.println("La suma es: "+suma);
	
	}
}

