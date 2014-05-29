/*Escriba un método llamado minimo3 que devuelva el menor de tres números de punto flotante. Use el método
Math.min para implementar minimo3. Incorpore el método en una aplicación que reciba como entrada 
tres valores por parte del usuario, determine el valor menor y muestre el resultado.*/
package metodos;

import java.util.Scanner;

public class Ejercicio_623 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige un numero: ");
		float num1=teclado.nextFloat();
		System.out.println("Elige un numero: ");
		float num2=teclado.nextFloat();
		System.out.println("Elige un numero: ");
		float num3=teclado.nextFloat();
		System.out.println("El menor es "+minimo3(num1, num2, num3));
	}
	
	/*public static double minimo3(double n1, double n2, double n3){
		
		double minimo2=Math.min(n1,n2);
		double minimo3=Math.min(minimo2, n3);
		return minimo3;
	}*/
	public static float minimo3(float n1, float n2, float n3){
		float minimo;
		minimo=Math.min((Math.min(n1,n2)),n3);
		return minimo;
	}
}
