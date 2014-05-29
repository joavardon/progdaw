 /*Escribe un m�todo que reciba una matriz de enteros con la creaci�n ya hecha 
 y que dicho m�todo se encargue, �nicamente, de cargar dicha matriz con datos 
 que se van a insertar a traves del teclado
 y as� devolver dicha informaci�n al m�todo que le llam�.*/
package vectoresymatrices;

import java.util.Scanner;


public class Enteros {
	
	public static int[][]EnterosMetodo(int[][] e){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<e.length;i++){
			for(int j=0;j<e[i].length;j++){
				System.out.println("Introduce entero: ");
				int ent=teclado.nextInt();
				e[i][j]=ent;}
		}
		
		return e;
		
	}
	public static void main(String[] args) {
		int[][] enteros=new int[2][3];
		int[][]enteros2=EnterosMetodo(enteros);
		System.out.println(enteros2.length);
		for(int i=0;i<enteros2.length;i++){
			for(int j=0;j<enteros2[i].length;j++){
				System.out.print(	enteros2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
