/*
 * crea coleccion de tipo array list que cargue 10 nuenorps 
 * por teclado, despues recorrer la coleccion,
y devolvera la cantidad de numeros positivos, ceros, negativos.
 */
package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			System.out.println("Introduce un numero: ");
			int num=teclado.nextInt();
			numeros.add(num);
			//numeros.add(teclado.nextInt());
		}
		
		Iterator <Integer> ite=numeros.iterator();
		int p=0;
		int n=0;
		int c=0;
		while(ite.hasNext()){
			int valor=ite.next();
			//System.out.println(valor);
			if( valor>0){
				p++;
			}
			else if( valor<0){
				n++;
			}
			else{
				c++;
				
			}
		}
		System.out.println("pos: "+p);
		System.out.println("neg: "+n);
		System.out.println("ceros: "+c);
		System.out.println();
		//asi se recorreria un array list con un for
		for(int i=0;i<numeros.size();i++){
			System.out.print(numeros.get(i));
		}
		int positivos=0,negativos=0;
		for(int i=0;i<10;i++){
			if(numeros.get(i)>0)positivos++;
			else if (numeros.get(i)<0)negativos++;
		}
		System.out.println("Positivos: "+positivos);
		System.out.println("negativos: "+negativos);
		System.out.println("ceros: "+(10-positivos-negativos));

	}

}
