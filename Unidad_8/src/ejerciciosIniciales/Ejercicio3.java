/*
 * Crear una coleccion con los primeros X numeros de la serie
de fibonacci, donde x es el nuemro que pediras al usuario.
Despues pregunta numeros y di si esta o no en la coleccion
El programa terminará cuando el usuario introduzca un  0.


 */
package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Que primeros numeros de la serie quieres: ");
		int num=teclado.nextInt();
		ArrayList<Integer>serie=new ArrayList<Integer>();
		int n=1;
		for(int i=0;i<num;i++){
			if(i==0 ||i==1){
				serie.add(n);
			}
			else{
			n=n+serie.get(i-2);//n es igual al anterior (serie.get(i-1)o n que es el valor del ultimo añadido )+ el anterior del anterior
			serie.add(n);}
		}
		ListIterator<Integer>ite=serie.listIterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
			
		}
	}

}
