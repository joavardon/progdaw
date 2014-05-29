 /*Escribe un método que se encargue de crear y cargar un vector 
  * con números decimales (con datos que se insertan por el teclado). 
 El método devolverá dicho vector.*/
package vectoresymatrices;

import java.util.Scanner;

public class VectorDecimales {
	public static float[] vector(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantos decimales?: ");
		int numdec=teclado.nextInt();
		float[] decimal=new float[numdec];
		for(int i=0;i<decimal.length;i++){
			System.out.println("decimal: ");
			
			decimal[i]=teclado.nextFloat();
		}
		
		
		return decimal;	
	}
	public static void main(String[] args) {
		float[] decimal=vector();
		for(int i=0;i<decimal.length;i++){
			System.out.println(decimal[i]);
		}

	}

}
