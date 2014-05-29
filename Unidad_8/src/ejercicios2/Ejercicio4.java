/*
 * Escribe una función llamada tiene_duplicados que tome una lista y devuelva true 
 * si existe algún elemento que aparece más de una vez. 
 * No debe modificarse la lista original.
 */
package ejercicios2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio4 {
	public static boolean tiene_duplicados(ArrayList<Integer>lista){
		boolean rep=false;
		ListIterator<Integer>ite=lista.listIterator();
		Collections.sort(lista); 
		for(int i=1;i<lista.size() && !rep;i++)
			if (lista.get(i-1).equals(lista.get(i)))
				rep=true;
		//si ordenarla se considera modificarla usaria el codigo de abajo
		/*
		int contador=1;
		while(ite.hasNext() && !rep){
			int n=ite.next();
			for(int i=contador;i<lista.size()&&(!rep);i++){
				if(lista.get(i)==n){
					rep=true;
				}
			}
			contador++;
		}*/
		return rep;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		System.out.println(tiene_duplicados(lista));
			
		
	}

}
