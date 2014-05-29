package examen;

import java.util.Scanner;

public class Ejercicio_4_2 {
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a Menu Generator");
		System.out.println("Comenzaremos recopilando opciones (escribe * para terminar)");
		String[] opciones=new String[10];
		int c=0;
		String oe="";
		do{
			System.out.println("Dame una opcion: ");
			oe=teclado.next();
			if(!oe.equalsIgnoreCase("*")){
			opciones[c]=oe;
			c++;}
		}while(!oe.equalsIgnoreCase("*"));
		System.out.println("* Menu *");
		for(int i=0;i<c;i++ ){
			System.out.println((i+1)+". "+opciones[i]);
		}
		opciones[c]="Salir";
		System.out.println((c+1)+". "+opciones[c]);
		boolean encontrada = false;
		do{
			System.out.println("Opción elegida: ");
			String elegida=teclado.next();
			for(int j=0;j<=c;j++){
					if(opciones[j].equalsIgnoreCase(elegida)){
						System.out.println("Ha elegido la opción: "+(j+1));
						encontrada=true;
					}
				}
			if(!encontrada){
				System.out.println("no esta ese valor");
			}
			
		}while(!encontrada);

	}

}
