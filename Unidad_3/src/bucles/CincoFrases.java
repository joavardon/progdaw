//Escribe un programa que pida cinco frases y las visualice.
package bucles;

import java.util.Scanner;

public class CincoFrases {

	
	public static void main(String[] args) {
		String respuesta;

		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.println("Escribe una frase: ");
			String frase=teclado.nextLine();
			System.out.println(frase);
		}	
	

	}

}
