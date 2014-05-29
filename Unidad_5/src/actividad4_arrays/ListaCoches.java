/* Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.

La clase Coche tendr� los atributos privados modelo, matr�cula, marca y color. 
Crea los constructores que estimes necesarios, los get/set necesarios y el m�todo toString().

La clase ListaCoches contendr� el array de coches y los m�todos necesarios para hacer 
un programa principal que pueda hacer lo siguiente:

    Devolver el coche que se encuentra en una posici�n dada. Si la posici�n aportada no 
    es v�lida devolver� null.
    Devolver la posici�n del coche cuya matr�cula coincide con una dada. En caso de no 
    encontrar esta devolver� -1.
    Devuelve la lista de coches que son de una marca determinada.*/

package actividad4_arrays;

import java.util.Scanner;

public class ListaCoches {
	static Coche[]listacoches=new Coche[4];
	static Scanner teclado=new Scanner(System.in);
	
	public static Coche posicion(){
		System.out.println("�Que posicion?: ");
		int posicion=teclado.nextInt();
		if(posicion>listacoches.length || posicion<=0){
			return null;
		}
		for(int i=0;i<listacoches.length;i++){
			if(i==posicion-1){
				return listacoches[i];
			}
		}
		return null;
		
	}
	
	public static int matricula(){
		System.out.println("�La posicion de que coche con que matricula quieres?: ");
		String matricula=teclado.next();
		
		for(int i=0;i<listacoches.length;i++){
			if(listacoches[i].getMatricula().equalsIgnoreCase(matricula)){
				return i+1;
			}
		}
		return -1;
		
	}
	public static void marca(){
		System.out.println("�Los coches de que marca quieres?: ");
		String marca=teclado.next();
		String coches="";
		for(int i=0;i<listacoches.length;i++){
			if(listacoches[i].getMarca().equalsIgnoreCase(marca)){
				coches=coches+" coche "+(i+1)+": "+listacoches[i].toString();
			}
		}
		System.out.println(coches);
	}
}
