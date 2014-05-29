package actividad4_8;

import java.util.Scanner;
import actividad4_8.Pelicula;
public class Menu  {
	Scanner teclado=new Scanner(System.in); ; 
	String nombre;
	String[]opciones=new String[4];
	int cont=0;
	
	Menu(String n){
		nombre=n;
	}
	
	public String añadirOpcion(String o){
		String opcion="";
		if(cont<opciones.length+1){
			opciones[cont]=(cont+1)+". "+o;
			opcion=opciones[cont];
			cont++;
		}
		
		return opcion;
	}
	public int mostrarMenu(){
		teclado=new Scanner(System.in); 
		System.out.println(nombre);
		for(int i=0; i<opciones.length;i++){
			System.out.println(opciones[i]);
		}
		System.out.println("Elige una opcion");
		int opcion=teclado.nextInt();
		
		return opcion;
	}
}