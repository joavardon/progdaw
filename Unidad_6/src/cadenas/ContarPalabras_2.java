/*ejercicio3.Dada una frase, que puede contener caracteres, espacios en blanco, puntos y comas, 
contar las palabras que contiene. Por ejemplo "El perro de San Roque. Fin." devuelve 6.*/
package cadenas;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ContarPalabras_2 {
	public static String introduceCadena(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		return cadena;
		
	}
	public static int contarPalabras(String frase){
		/*
		int j=0;
		StringTokenizer tokens = new StringTokenizer(frase);

		while(tokens.hasMoreTokens()){
			tokens.nextToken();
			j++;}
		return j;
*/
		int j = 0;


		String [] campos = frase.split("\\s+");

		while(j<campos.length){
		j++;

		}
		return j;
}


	public static void main(String[] args) {
		String cadena=introduceCadena();
		System.out.println(contarPalabras(cadena));

	}

}
