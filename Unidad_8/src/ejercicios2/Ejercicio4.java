/*
 * Escribe una funci�n llamada tiene_duplicados que tome una lista y devuelva true 
 * si existe alg�n elemento que aparece m�s de una vez. 
 * No debe modificarse la lista original.
 */
package ejercicios2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Ejercicio4 {
	public static boolean tiene_duplicados(ArrayList<Integer>lista){
		boolean rep=false;
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
	public static boolean tiene_duplicados2(ArrayList<Integer> lista) {
		boolean respuesta = false;
		List<Integer> aux = new ArrayList<Integer>(lista);
		
		ListIterator<Integer> iterador1 = aux.listIterator();
		while(iterador1.hasNext()){
			Object elemento = iterador1.next();
			iterador1.remove();
			if(aux.contains(elemento)){
				respuesta = true;
				break;
			}
		}
		
		return respuesta;
	}

	public static boolean tiene_duplicados3(ArrayList<Integer> lista) {
		Set<Integer> lista2 = new HashSet<Integer>();
		lista2.addAll(lista);

		if (lista.size() != lista2.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(7);
		lista.add(3);
		lista.add(4);
		lista.add(1);
		System.out.println(tiene_duplicados(lista));
		System.out.println(tiene_duplicados2(lista));
		System.out.println(tiene_duplicados3(lista));
			
		
	}

}
