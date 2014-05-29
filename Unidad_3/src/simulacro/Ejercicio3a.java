package simulacro;

import java.util.Scanner;

public class Ejercicio3a {

	
	public static void main(String[] args) {
		System.out.println("Bienvenido a Haiku Generator.");
		System.out.println("Comenzaremos recopilando versos(escribe * para terminar");
		
		String verso="";
		int maximo=40;
		int total=0;
		String versos[]=new String[maximo-1];
		int numverso=0;
		versos[numverso]=verso;
		Scanner teclado=new Scanner(System.in);
		
		while(!verso.equals("*")) {
				System.out.println("Dame un verso: ");
				verso=teclado.nextLine();
				versos[numverso]=verso;
				numverso++;
				total++;
				};
		
		System.out.println("Versos leidos"+" ("+(total-1)+"):");
		for(int i=0;i<total-1;i++){
			System.out.println(versos[i]);
		}
		System.out.println();
		System.out.println("Haiku");
		System.out.println("**********");
		String respuesta;
		do{
		for(int i=0;i<3;i++){
			System.out.println(versos[(int)(Math.random()*(total-1))]);
		}
		System.out.println("¿Otro Haiku?[S/n]");
		respuesta=teclado.next();
		}while(respuesta.equals("S"));
	}

}
