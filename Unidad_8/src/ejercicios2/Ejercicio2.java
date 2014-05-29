/*Escribe una función que tome una lista de números y devuelva la suma acumulativa;
 *  esto es, una nueva lista donde cada elemento contiene la suma de todos los elementos 
 *  anteriores en la lista original. 
Por ejemplo, la suma acumulativa de [1,2,3] es [1,3,6].*/
package ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
	public static  ArrayList<Integer> sumaNumeros(ArrayList<Integer>lista){
		ArrayList<Integer>lista2=new ArrayList<Integer>();
		int suma=0;
		for(int i=0;i<lista.size();i++){
			suma=suma+lista.get(i);
			lista2.add(suma);
		}
		return lista2;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		ArrayList<Integer>resultado=sumaNumeros(lista);
		for(int i=0;i<resultado.size();i++){
			System.out.println(resultado.get(i));
		}
		System.out.println(resultado);
	}

}
