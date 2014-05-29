/*Pide un número del 1 al 7. Imprime si es laborable o festivo. 
Puedes realizar el ejercicio con sentencias if y otra versión con switch.*/
package ejercicioinicial;

import java.util.Scanner;

public class LaborableFestivo {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un número del 1 al 7: ");
		int numero=teclado.nextInt();
		switch(numero){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Laborable");
			break;
		case 6:
		case 7:
			System.out.println("Festivo");
		}

	}

}
