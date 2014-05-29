

package simulacro;

import java.util.Scanner;

public class Ejercicio3b {

	
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
			String anterior="";
		for(int i=0;i<3;i++){
			
			String actual=versos[(int)(Math.random()*(total-1))];
			System.out.println("anterior"+anterior);
			String[] usados=new String[3];
			//pongo do ... while 
				for(int j=0;j<3;j++){
					if(actual.equals(usados[j])){
					actual=versos[(int)(Math.random()*(total-1))];
					}
				}
			usados[i]=actual;
			System.out.println(usados[i]);
			anterior=actual;}
		System.out.println("¿Otro Haiku?[S/n]");
		respuesta=teclado.next();
		}while(respuesta.equals("S"));
	}

}
