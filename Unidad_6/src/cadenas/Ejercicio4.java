// Escribe un programa que pida una cadena. Posteriormente, el programa dejará
// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
// el fin de informar, para cada carácter, si la cadena lo contiene y en qué
// posición está el primero.
package cadenas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("escribe una cadena: ");
		String cadena=teclado.nextLine();
		char caracter;
		do{
			System.out.println("Introduce un caracter: ");
			String car=teclado.next();
			caracter=car.charAt(0);
			boolean esta=false;
			for(int i=0;i<cadena.length();i++){
				if(cadena.charAt(i)==caracter){
					//System.out.println("contiene primero el caracter "+caracter+" en la posicion "+i);
					esta=true;
					//break;
				}
			}
			if(esta==true){
				System.out.println("contiene primero el caracter "+caracter+" en la posicion "+cadena.indexOf(caracter));
			}
			else if(esta==false && caracter!='*'){
				System.out.println("no esta");
			}
			else if(caracter=='*'){
				System.out.println("FIN");
			}
		}while(caracter!='*');

	}

}
