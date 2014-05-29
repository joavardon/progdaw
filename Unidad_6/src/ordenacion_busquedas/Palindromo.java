/*
 * Ejercicio 3. Utilizando las funciones del paquete Arrays,
 *  pide al usuario un número y muestra por pantalla si este es palíndromo.
 */
package ordenacion_busquedas;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		//eligo numero entero
		System.out.println("Elige un numero: ");
		int n=teclado.nextInt();
		//lo paso a cadena para poder sacar su longitud de caracteres
		String num=Integer.toString(n);
		//creo array de caracteres con mmisma longitud que la cadena
		char[] numero=new char[num.length()];
		//asigno a cada valor del array el correspondiente de la cadena 
		int c=0;
		for(int j=0;j<num.length();j++){
			numero[c]=num.charAt(j);
			c++;
		}
		//hago una copia del array de caracteres
		char[]copiaNum=Arrays.copyOf(numero, num.length());
		//doy la vuelta al array de caracteres original
		c=0;
		for(int j=num.length()-1;j>=0;j--){
			numero[c]=num.charAt(j);
			c++;
		}
		//comparo el original, al que he dado la vuelta con a la copia, y dependiendo de su valor booleano serán o no palindromos
		if(Arrays.equals(numero, copiaNum)==true){
			System.out.println("Es palindromo");
		}
		else{
			System.out.println("No es palindromo");
		}
		
	}

}
