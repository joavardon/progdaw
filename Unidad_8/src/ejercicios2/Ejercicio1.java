/*
 * Crear un programa que pida una serie de nombres. 
 * Después de cada nombre deberá preguntarse si quiere o no insertar otro nombre. 
 * Finalmente se imprimirán los nombres en el mismo orden en el que se introdujeron 
 * y también en oden inverso. 
 * Nota: prueba a realizarlo usando ListIterator, que tiene los métodos previousIndex() y previous().
 */
package ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		char respuesta = 's';
		Scanner teclado=new Scanner(System.in);
		ArrayList<String>nombres=new ArrayList<String>();
		while(respuesta=='s'){
		System.out.println("Introduce un nombre");
		String n=teclado.next();
		nombres.add(n);
		System.out.println("Desea introducir otro nombre(s/n): ");
		String r=teclado.next();
		respuesta=r.charAt(0);
		}
		ListIterator<String>ite=nombres.listIterator();
		 while(ite.hasNext()){
             System.out.println(ite.next());   
           }
      System.out.println("**************************");
		 while(ite.hasPrevious()){
             System.out.println(ite.previous());  
           }
      
	}

}
