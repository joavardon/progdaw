/*Escribe un programa que pida dos n�meros con el fin de visualizar la suma 
de todos los n�meros que hay entre ambos n�meros (incluidos dichos n�meros). 
Si el primer n�mero que inserte el usuaruio es mayor que el segundo, 
se volver�n a pedir otros dos n�meros hasta que 
el primer n�mero insertado sea menor o igual que el segundo.*/
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

