//Imprimir la tablas de multiplicar que el usuario elija.
package bucles;

import java.util.Scanner;

public class TablasMultiplicar {


	public static void main(String[] args) {
		
		System.out.println("Elige una tabla de multipliacar: ");
		Scanner teclado=new Scanner(System.in);
		int tabla=teclado.nextInt();
		System.out.println("Has elegido la tabla del "+tabla);
		int numero=1;
		while(numero<11){
			System.out.println(numero+" * "+tabla+" = "+numero*tabla);
			numero++;
		}
	}

}
