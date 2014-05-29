/*Queremos guardar en la memoria del ordenador el número de alumnos matriculados (por módulos) en el ciclo de DAW. Sabemos que los alumnos matriculados por cada módulo son:

    21 alumnos matriculados en Sistemas Informáticos.
    17 alumnos matriculados en Base de Datos.
    30 alumnos matriculados en Programación.
    14 alumnos matriculados en Lengaje de Marcas.
    12 alumnos matriculados en Entornos de Desarrollo.
    25 alumnos matriculados en Acceso a Datos.*/

package vectoresymatrices;


import java.util.Scanner;

public class CicloDAW {

	
	public static void main(String[] args) {
		int[] matriculados={21,17,30,14,12,25};
		int[][]nummatriculados={{matriculados[0]},{matriculados[1]},{matriculados[2]},{matriculados[3]},{matriculados[4]},{matriculados[5]}};
		String [][]modulos={{"Sistemas informáticos"},{"Base de datos"},{"Programacion"},{"Lenguaje de marcas"},{"Entornos de desarrollo"},{"Acceso a datos"}};
		for(int i=0;i<nummatriculados.length;i++){
			for(int j=0;j<1;j++){
				System.out.println("Para el modulo "+modulos[i][j]+" hay "+nummatriculados[i][j]);
			}
		}
			
		}	
	
}
