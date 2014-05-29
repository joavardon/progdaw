/*
 * Ejercicio 2. Escribe un programa que pida la estatura de una serie de alumnos, 
 * de tantos como indique el usuario del programa. Posteriormente, el programa ordenará 
 * dichos datos de forma ascendente. 
 * Una vez ordenados, el programa visualizará los datos en el orden que se insertaron y 
 * ordenados de forma ascendente.
 */
package ordenacion_busquedas;

import java.util.Arrays;
import java.util.Scanner;

public class Estatura {
	static Scanner teclado=new Scanner(System.in);
	int[] alturasAlumnos;
	static int[] alturas(int n){
		int[]alturas=new int[n];
		for(int i=0; i<alturas.length;i++){
			System.out.println("Escribe la altura del alumno: ");
			int altura=teclado.nextInt();
			alturas[i]=altura;
		}
		return alturas;
	}
	static void imprimir(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("¿La altura de cuántos alumnos quieres pedir: ?");
		int num=teclado.nextInt();
		int[] alturasAlumnos=alturas(num);
		int[]alturasOrdenadas=Arrays.copyOf(alturasAlumnos, num);
		Arrays.sort(alturasOrdenadas);
		System.out.println("Alturas en orden de inserción: ");
		imprimir(alturasAlumnos);
		System.out.println();
		System.out.println("Alturas en orden de altura ascendente: ");
		imprimir(alturasOrdenadas);
		
	}

}
