/*
 *Crear la clase ArrayOrdenado. ArrayOrdenado almacena un array de números enteros que siempre está ordenado.
 * La clase tendrá:
- Un constructor, al que le pasamos un array de enteros que se almacenará internamente ordenado. Le pasamos copia:numeros=Arrays.copyOf(vector, vector.length);
- Un constructor, al que le pasamos un valor y crea un ArrayOrdenado de ese tamaño.Todo a ceros.
- getElemento(int x) devuelve el valor del elemento en la posición x.
- setElemento(int x, int elto) cambia el elemento en la posición x por el elemento elto. Obviamente, como es 
un array ordenado, si el número tiene otro orden se colocará automáticamente en otra posición.
- toString()para pasar a string el array
 */
package repaso;

import java.util.Arrays;


public class Ejercicio3 {

	
	public static void main(String[] args) {
		
		ArrayOrdenado x=new ArrayOrdenado(100);
		
		for(int i=0;i<100;i++) {
			x.setElemento(i,(int)(Math.random()*100+1));
		}
		System.out.println(x.toString());
		System.out.println();
		System.out.println(x);
		
		int[] num={4,6,7,3,4,5,7,8,9,0,0,1,3,2,4,5,6,7};
		ArrayOrdenado y=new ArrayOrdenado(num);
		for(int i=0;i<num.length;i++) {
			y.setElemento(i,num.length);
		}
		System.out.println(y.toString());
	}

}
