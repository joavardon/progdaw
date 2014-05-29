package ejercicioinicial;

import java.util.Scanner;

public class DiaSemana {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un número del 1 al 7: ");
		int numero=teclado.nextInt();
		switch(numero){
		case 1:
			System.out.println("Lunes");
			break;
		
	case 2:
		System.out.println("Martes");
		break;
	case 3:
		System.out.println("miercoles");
		break;
	case 4:
		System.out.println("jueves");
		break;
	case 5:
		System.out.println("viernes");
		break;
	case 6:
		System.out.println("sabado");
		break;
	case 7:
		System.out.println("domingo");
		break;
		}
	
	}
}
