package metodos;

import java.util.Scanner;

public class Ejemplo2 {


	public static void main(String[] args) {
		
		//System.out.print(aleatorio());
		//numeroAleatorio();
		/*
		for(int i=0;1<10;i++){
			for(int j=0;j<10;j++)
					numeroAleatorio();}
			System.out.println();
			}
			
		}*/
		Scanner teclado=new Scanner(System.in);
		int tamaño=teclado.nextInt();
		for(int i=0;i<tamaño;i++){
			lineaAleatorios(tamaño);	
		}
		
	}
/*
	public static int aleatorio(){
		int numero=(int)(Math.random()*9);
		return numero;
	}
*/	
	
	public static void lineaAleatorios(int tam){
		for(int j=0;j<tam;j++){
			numeroAleatorio();}
		System.out.println();
			
	}
	public static void numeroAleatorio(){
		int numero;
		numero=(int)(Math.random()*10);
		System.out.print(numero);
	}
}
