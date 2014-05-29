// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejará que el usuario inserte cinco subcadenas con el fin de informar
		// si la primera cadena empieza o termina por cada una de las cindo subcadenas
/*cadena:
"Escribe rpograma"
Subcadenas:
"uno"
"dos"
"escribe"
no comienza ni termina por uno
comienza por escribe*/
package cadenas;

import java.util.Scanner;

public class Ejercicio2 {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("escribe una cadena: ");
		String cadena=teclado.nextLine();
		String[]subcadenas=new String[5];
		
		for(int i=0;i<5;i++){
			
			System.out.println("inserte cadena: ");
			subcadenas[i]=teclado.next();
			boolean comienza,termina;
			comienza=cadena.startsWith(subcadenas[i]);
			termina=cadena.endsWith(subcadenas[i]);
			if(comienza && termina){
				System.out.println("comienza y termina por "+subcadenas[i]);
			}
			else if(comienza && !termina){
				System.out.println("comienza por "+subcadenas[i]);
			}
			else if(!comienza && termina){
				System.out.println("termina por "+subcadenas[i]);
			}
			else{
				System.out.println("ni empieza ni termina por "+subcadenas[i]);
			}
		}

	}

}
