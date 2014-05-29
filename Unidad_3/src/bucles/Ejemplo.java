//pide 3 numeros y que de la media
package bucles;

import java.util.Scanner;

public class Ejemplo {
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float suma=0;
		float resultado = 0;
		for (float i=1;i<=3;i++){
			 
			 System.out.println("Escribe numero: ");
			 float numero=teclado.nextInt();
			 suma+=numero;
			 resultado=suma/i;
			 
		}
		System.out.println("media es: "+resultado);
		
	}

}
