/*
 * Escribe una función que tome una lista de números y devuelva la suma acumulativa;
 *  esto es, una nueva lista donde cada elemento contiene la suma de todos 
 *  los elementos anteriores en la lista original. 
 * Por ejemplo, la suma acumulativa de [1,2,3] es [1,3,6].
 */
package repaso;

import java.util.ArrayList;
import java.util.List;


public class SumaAcumulativa {
	public static ArrayList<Integer> sumaAcum(ArrayList<Integer>l){
		ArrayList<Integer>nueva=new ArrayList<Integer>();
		int c=0;
		while(c<l.size()){
			int suma=0;
			for(int i=0;i<=c;i++){
				suma=suma+l.get(i);
			}
			nueva.add(suma);
			c++;
			}
		return nueva;
		
	}
	public static ArrayList<Integer> sumaAcumulativa(List<Integer> numeros) {

		ArrayList<Integer> resultado=new ArrayList<Integer>();
		
		resultado.add(numeros.get(0));
		for(int i=1;i<numeros.size();i++){
			resultado.add(resultado.get(i-1) + numeros.get(i));
		}
		
		return resultado;
	}

	public static ArrayList<Integer> sumaAcumulativaIterador(List<Integer> numeros) {

		ArrayList<Integer> resultado=new ArrayList<Integer>();
		int suma=0;
		
		for(Integer i:numeros) {
			suma+=i;
			resultado.add(suma);
		}
		
		return resultado;
	}
public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		ArrayList<Integer>listaSuma=sumaAcum(lista);
		System.out.println(listaSuma);
	}

}
