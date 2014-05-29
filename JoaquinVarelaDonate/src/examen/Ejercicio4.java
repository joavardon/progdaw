package examen;

import java.util.Scanner;

public class Ejercicio4 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
	
		int opcion_cogida;
			System.out.println("Bienvenido a Menú Generator");
			
			System.out.println("Comenzaremos recopilando opciones(escribe * para terminar)");
			
			String[] opciones=new String[10];
			String opcion_elegida="";
			
			for(int i=0;!opcion_elegida.equals("*");i++){
				System.out.println("Dame una opción: ");
				opcion_elegida=teclado.next();
				opciones[i]=opcion_elegida;}
				
			
			do{
			System.out.println("*  Menu *");
			System.out.println("*************");
			System.out.println("1.Abrir");
			System.out.println("2.Crear");
			System.out.println("3.Salir");
			
			opcion_cogida=teclado.nextInt();
			
			switch(opcion_cogida){
				case 1:
					System.out.println("Opción elegida: "+opciones[opcion_cogida-1]);
					System.out.println("Ha elegido la opción: "+opcion_cogida);
					break;
				
				case 2:
					System.out.println("Opción elegida: "+opciones[opcion_cogida-1]);
					System.out.println("Ha elegido la opción: "+opcion_cogida);
					break;
				case 3:
					System.out.println("Opción elegida: salir ");
					System.out.println("Ha elegido la opción: "+opcion_cogida);
					break;}
			}while(opcion_cogida!=3);
		
	}

}
