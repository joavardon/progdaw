/*
 * La llamada Paradoja del Cumpleaños consiste en que:

Si hay 23 pesonas en una clase, ¿cuál es la probabilidad de 
que algunas personas cumpla años el mismo día?.

Estima la probabilidad generando ejemplos aleatorios de 23 cumpleaños 
y comprobando si coincidenhe (utiliza la función del ejercicio anterior).

 */
package ejercicios2;

import java.util.ArrayList;

public class Ejercicio5 {

	
	public static void main(String[] args) {
		ArrayList<Integer>lista=new ArrayList<Integer>();
		double coinciden=0;
		boolean dupli;
		for(int cont=0;cont<1000000;cont++){
			for(int i=0;i<23;i++){
				int c=(int) (Math.random()*365);
				lista.add(c);
			}
			dupli=Ejercicio4.tiene_duplicados(lista);
			if(dupli==true){
				coinciden++;//cada vez que hay repetidos sumo uno a coinciden, si no hubiera repes sigue valiendo lo mismo
			}
			lista.removeAll(lista);//vacio la lista de elementos para que no tenga elementos al comenzar el bucle
			dupli=false;//pongo a false al comienzo del bucle
		}
		System.out.printf("%s %.2f","la probabilidad es : ", coinciden/10000);//coinciden*100/100000
	}

}
