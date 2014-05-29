/*Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo 
(aquel divisible por 100), salvo que este último sea divisible por 400 
http://es.wikipedia.org/wiki/Año_bisiesto. 
Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.*/

package ejerciciosCondicionales;

import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige un año: ");
		int año=teclado.nextInt();
		
		if((año%4==0 && año%100!=0) || (año%4==0 && año%100==0 && año%400==0) ){
			System.out.println("ES BISIESTO");
		}
		else{
			System.out.println("NO ES BISIESTO");
		}
	}

}
