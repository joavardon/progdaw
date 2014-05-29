//metodo que devuelve numero aleatorio entre un rango que pongamos
package metodos;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		//(int)(Math.random()*((max-min)+1))+min;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe el numero minimo");
		int minimo=teclado.nextInt();
		System.out.println("Escribe el numero maximo");
		int maximo=teclado.nextInt();
		//int numeroAleatorio=devolverAleatorio(minimo,maximo);
		//System.out.println(numeroAleatorio);
		
		 for(int i=0;i<10000;i++){
			 int aleatorio=devolverAleatorio(minimo, maximo);
			 if(aleatorio<minimo || aleatorio>maximo)
				 System.out.print("getAleatorio Se ha ido de rango");
			
		 }		 
	}
		
		public static int devolverAleatorio(int min,int max){
			int numero=(int)(Math.random()*((max-min)+1))+min;
			return numero;//cuando ejecuta el return se termina el metodo y vuelve al main a devolver el valor que le hayamos dicho
		}	
	
	
}
