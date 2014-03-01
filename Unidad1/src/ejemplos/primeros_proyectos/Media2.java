package ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Media2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float numero1, numero2;
		float media;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		numero1=input.nextFloat();
		System.out.println("Numero 2: ");
		numero2=input.nextFloat();
	
		media=(numero1+numero2)/2;
		System.out.println("La media es "+media);
		input.close();

	}

}
