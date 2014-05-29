 /*Escribe un método que reciba una matriz de enteros con la creación ya hecha 
 y que dicho método se encargue, únicamente, de cargar dicha matriz con datos 
 que se van a insertar a traves del teclado
 y así devolver dicha información al método que le llamó.*/
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
