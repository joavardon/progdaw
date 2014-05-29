package examen;

import java.util.Scanner;

public class PruebaCine {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cine micine=new Cine("Micine",3);
		Cine.menuPrincipal(micine);
		teclado.close();
		
		
		
		
	}
	/*public  static void menu(Cine c){
		int opcion ;
		Scanner teclado;
		boolean seguir;
		do{
			teclado=new Scanner(System.in);
			opcion=0;
			seguir=false;
			try{
			
			System.out.println("MENU");
			System.out.println("0. Salir");
			System.out.println("1. Crear película");
			System.out.println("2. Eliminar película");
			System.out.println("3. Ver disponibles");
			System.out.println("Elige una opcion: ");
			opcion=teclado.nextInt();
			if(opcion<0 ||opcion>3){
				seguir=true;
			}
			}
			catch(Exception e){
				System.out.println("Meter numero, caracter incorrecto");
				seguir=true;
				}
			//si la opcion es correcta hago el switch
			switch(opcion){
			case 1:
				//creo una pelicula parametro para addPelicula
				c.addPelicula(c.creaPelicula());
				break;
			case 2:
				//digo el nombre que es el p para delPelicula
				teclado=new Scanner(System.in);
				System.out.println("Nombre de la pelicula: ");
				String nombre=teclado.nextLine();
				c.delPelicula(nombre);
				break;
			case 3:
				//muuestro las peliculas del array que creo con getPeliculas
				c.mostrarPelis(c.getPeliculas());
				break;
				}
			//System.out.println("El tamaño actual de nuestra cartelera es: "+c.tamañoActual);
		}while(opcion!=0 || seguir==true);
		
		
	}*/
	
}
