/*Defina un m�todo llamado hipotenusa que calcule la longitud de 
la hipotenusa de un tri�ngulo rect�ngulo,
cuando se proporcionen las longitudes de los otros dos lados. 
(Utilice los datos de ejemplo de la fi gura 6.26.) El m�todo
debe tomar dos argumentos de tipo double y devolver la hipotenusa como un valor double.
Incorpore este m�todo en
una aplicaci�n que lea los valores para lado1 y lado2, y que realice el c�lculo con el m�todo hipotenusa. 
Determine
la longitud de la hipotenusa para cada uno de los tri�ngulos de la fi gura 6.26.*/
package metodos;

import java.util.Scanner;

public class Ejercicio_615 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dame un cateto: ");
		double lado1=teclado.nextDouble();
		System.out.println("Dame otro cateto: ");
		double lado2=teclado.nextDouble();
		hipotenusa(lado1,lado2);
		
	}

	public static  void hipotenusa(double lado1,double lado2){
		double hip=Math.sqrt((Math.pow(lado1,2))+(Math.pow(lado2,2)));
		System.out.println("la hipotenusa es "+hip);
	}
}
