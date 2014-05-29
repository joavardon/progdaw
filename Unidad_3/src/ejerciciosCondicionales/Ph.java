/*Escribe un programa que pida el ph de una solución 
y muestre el mensaje de si la solución es ácida (ph < 7.0)
o peligrósamente ácida: ph < 3.0).*/

package ejerciciosCondicionales;

import java.util.Scanner;

public class Ph {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime el Ph: ");
		float ph=teclado.nextFloat();
		if (ph<7.0 && ph>=3.0){
			System.out.println("Es acida");
		}
		else if (ph<3.0){
			System.out.println("Es peligrosamente acida");
		}
		
	}

}
