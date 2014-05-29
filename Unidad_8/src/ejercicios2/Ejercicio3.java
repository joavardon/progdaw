/*
 * Crea una función llamada corta que tome una lista y la modifique, eliminando 
 * el primer y último elemento. Después escribe una función llamada centro que, 
 * pasada una lista por parámetro, 
 * devuelva una nueva lista que contenga todos menos los elementos primero y último.
 */
package ejercicios2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio3 {
	public static ArrayList<Integer> corta(ArrayList<Integer>lista){
		int p=lista.get(0);
		int u=lista.get(lista.size()-1);
		ListIterator<Integer>ite=lista.listIterator();
		while(ite.hasNext()){
			int n=ite.next();
			if(n==p ||n==u){
				ite.remove();
			}
		}
		/*
		for(int i=0;i<lista.size();i++){
			if(lista.get(i)==p ||lista.get(i)==u){
				lista.remove(lista.get(i));
				i--;
			}
		}*/
		return lista;
	}
	public static ArrayList<Integer> centro(ArrayList<Integer>lista){
		lista.remove(lista.get(0));
		lista.remove(lista.get(lista.size()-1));
		return lista;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(0);
		lista.add(0);
		lista.add(3);
		lista.add(3);
		lista.add(0);
		lista.add(1);
		lista.add(0);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(2);
		lista.add(3);
		lista.add(3);
		corta(lista);
		System.out.println(lista);
		centro(lista);
		System.out.println(lista);
		
	}

}
