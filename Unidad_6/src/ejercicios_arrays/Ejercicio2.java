/*Crea un programa que almacene los meses del año (los nombres de cada mes). 
Se pedirá al usuario el número de mes y se visualizará su nombre.*/
package ejercicios_arrays;

import java.util.Scanner;

public class Ejercicio2 {
	
	
   
	public  enum meses {
	    Enero(1),Febrero(2),Marzo(3),Abril(4),Mayo(5),Junio(6),Julio(7),Agosto(8),Septiembre(9),
	    Octubre(10),Noviembre(11),Diciembre(12);
	    private final int nummes; 
		meses(int nummes){
			this.nummes = nummes;}
		public int getNummes(){
			return nummes;}
		}
	

		public static void main(String[] args) {
			
			Scanner teclado=new Scanner(System.in);
			System.out.println("Elige un mes: ");
			int mes=teclado.nextInt();
			
			switch(mes){
			case 1:
				System.out.println(meses.Enero.getNummes());
				break;
			
			case 2:
				System.out.println(meses.Febrero);
				break;
			
			case 3:
				System.out.println(meses.Marzo);
				break;
			
			case 4:
				System.out.println(meses.Abril);
				break;
			
			case 5:
				System.out.println(meses.Mayo);
				break;
			case 6:
				System.out.println(meses.Junio);
				break;
			
			case 7:
				System.out.println(meses.Julio);
				break;
		
			case 8:
				System.out.println(meses.Agosto);
				break;
			
			case 9:
				System.out.println(meses.Septiembre);
				break;
			
			case 10:
				System.out.println(meses.Octubre);
				break;
			
			case 11:
				System.out.println(meses.Noviembre);
				break;
			
			case 12:
				System.out.println(meses.Diciembre);
			}
		}
}