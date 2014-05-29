package simulacro;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.print("Números a leer: ");
		float numero=teclado.nextInt();
		int positivos = 0;
		int negativos = 0;
		float media;
		float total=0;
		for(int i=0;i<10;i++){
			System.out.println("Escribe 10 números: ");
			float numeros=teclado.nextInt();
			if(numeros>0){
				positivos++;
			}
			if (numeros<0){
				negativos++;
			}
			total=total+numeros;
		}
		System.out.println("Positivos: "+positivos);
		System.out.println("Negativos: "+negativos);
		System.out.println("Media: "+total/numero);
		}
		
}
