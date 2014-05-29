 /*Mediante el uso de arrays pide al usuario un número 
 y muestra por pantalla si este es palíndromo o no. 
 Debes pedir el número completo, no digito a digito.*/
package ejercicios_arrays;

import java.util.Scanner;

public class Ejercicio3 {
	
	
	public static boolean palindromo(int n){//había que hacerlo con array de enteros,no con cadena
		String cadena = "";
		cadena= Integer.toString(n);
		System.out.println(cadena);
		int ultimo=cadena.length()-1;
		int mitad=(cadena.length()/2);
		boolean palindromo=true;
			for(int j=0;j<mitad;j++){
					
				if(cadena.charAt(j)!=cadena.charAt(ultimo)){
					palindromo=false;
					break;
				}
				ultimo=(cadena.length()-1)-(j+1);
				palindromo=true;
			}
			return palindromo;
	}
	
		public static void main(String[] args) {
		int[] numeros=new int[3];
		for(int i=0;i<numeros.length;i++){
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce los numeros: ");
		int numero=teclado.nextInt();
		numeros[i]=numero;
		boolean valor=palindromo(numeros[i]);
			if(valor==false){
				System.out.println(" no es palindromo");
			}
			else {
				System.out.println(" sí es palindromo");
			}
		}
	}
}

