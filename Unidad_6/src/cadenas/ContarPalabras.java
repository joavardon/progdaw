/*ejercicio3.Dada una frase, que puede contener caracteres, espacios en blanco, puntos y comas, 
contar las palabras que contiene. Por ejemplo "El perro de San Roque. Fin." devuelve 6.*/

package cadenas;

import java.util.Scanner;

public class ContarPalabras {
	public static String introduceCadena(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		return cadena;
		
	}
	public static int contarPalabras(String frase){
		int numPalabras = 0;

		for(int i=1;i<frase.length();i++){
			if((frase.charAt(i)==' '||frase.charAt(i)=='.'||frase.charAt(i)==',')
					&& (!(frase.charAt(i-1)==' ') || (frase.charAt(i-1)=='.')|| (frase.charAt(i-1)==','))){
						numPalabras++;
					}
			}
		
		if (frase.length()>0 && Character.isLetterOrDigit(frase.charAt(frase.length())){
			
		}
	
		return numPalabras;
	}
	public static void main(String[] args) {
		String cadena=introduceCadena();
		System.out.println(contarPalabras(cadena));
	}

}
