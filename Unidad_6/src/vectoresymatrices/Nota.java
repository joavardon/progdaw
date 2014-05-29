/*
 * Declara y crea un tipo de variable que sea capaz de contener la nota que han obtenido 4 alumnos 
 * en los diferentes módulos en los que están matriculados. 
 * Sabemos que el primer alumno está matriculado en 4 módulos;
 * el segundo, en 7 módulos; el tercero, en 3 módulos, yel cuarto, en 2 módulos.
 */
package vectoresymatrices;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		int[] nummod = {4,7,3,2};
		int[]alumnos=new int[4];
		int[][]notas=new int[4][7];//7 porque es el valor maximo de modulos que tenemos
			
		for(int i=0;i<alumnos.length;i++){
			
				for(int j =0;j<7;j++){
					if(j<nummod[i]){
					Scanner teclado=new Scanner(System.in);
					System.out.println("Nota para el alumno "+(i+1)+" en la asignatura "+(j+1)+" :");
					int nota=teclado.nextInt();
					notas[i][j]=nota;}
					else{
						break;
					}
				}
		}
			
		for(int i=0;i<alumnos.length;i++){
			
			for(int j =0;j<7;j++){
				if(j<nummod[i]){
				System.out.println("La nota del alumno "+i+" en la asignatura "+j+" es "+notas[i][j]);}
				else{
					break;
				}
			}
		}
	}
}
