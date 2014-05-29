/*
 *  Crear un programa que lea 10 números enteros y
finalmente visualice el número de positivos, negativos y cero
 */
package simulando_simulacro;

import java.util.Scanner;



public class Ejercicio1 {
	static void cuentaNumeros(int[]m){
		int negativos = 0,positivos = 0, ceros=0;
		for(int i=0;i<m.length;i++){
			if(m[i]<0){
				negativos++;
			}
			else if (m[i]>0){
				positivos++;
			}
			else{
				ceros++;
			}
		}
		System.out.println("Hay "+positivos+" numeros positivos");
		System.out.println("Hay "+negativos+" numeros negativos");
		System.out.println("Hay "+ceros+" ceros");
	}
	static int[]elegirNumeros(int[]m){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce diez numeros: ");
		for(int i=0;i<m.length;i++){
			m[i]=teclado.nextInt();
		}
		return m;
	}
	public static void main(String[] args) {
		int[] numeros=new int[10];
		elegirNumeros(numeros);
		cuentaNumeros(numeros);
	}

}
