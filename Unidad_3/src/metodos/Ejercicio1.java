/*Escribir un m�todo que convierta de euros a d�lares. 
Recibir� un n�mero decimal correspondiente a la cantidad en euros 
y devolver� la cantidad correspondiente en dolares.
Escribir el c�digo en el main necesario para probarlo.*/
package metodos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Ingrese una cantidad en euros: ");
		float euros=teclado.nextFloat();
		System.out.println(euros+" euros son "+eurosADolares(euros)+" dolares");
	}
	
	public static float eurosADolares(float euros){
		float conversion=(float) 1.38;
		float dolares=euros*conversion;
		return dolares;
		
	}

}
