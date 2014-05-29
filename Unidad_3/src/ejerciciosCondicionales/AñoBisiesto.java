/*Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo 
(aquel divisible por 100), salvo que este �ltimo sea divisible por 400 
http://es.wikipedia.org/wiki/A�o_bisiesto. 
Haz un programa que pida un a�o y muestre un mensaje de si es o no bisiesto.*/

package ejerciciosCondicionales;

import java.util.Scanner;

public class A�oBisiesto {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige un a�o: ");
		int a�o=teclado.nextInt();
		
		if((a�o%4==0 && a�o%100!=0) || (a�o%4==0 && a�o%100==0 && a�o%400==0) ){
			System.out.println("ES BISIESTO");
		}
		else{
			System.out.println("NO ES BISIESTO");
		}
	}

}
