package examen;

import java.util.Scanner;

public class PruebaCine2 {

	
	public static void main(String[] args) {
		//Scanner teclado=new Scanner(System.in);
		MenuClase menu = new MenuClase();
		Cine micine=new Cine("Micine",3);
		
		menu.a�adirOpcion("A�adir pelis");
		menu.a�adirOpcion("Eliminar pelis");
		menu.a�adirOpcion("Ver cartelera");
		menu.a�adirSalir("Salir");

		while (menu.obtenerOpcionElegidaUsuario() != 0) {

			System.out.println("Se ha introducido la opción: "
					+ menu.getOpcion() + "\n");
		
		
		switch(menu.getOpcion()){
	
		case 1:
			//creo una pelicula parametro para addPelicula
			micine.addPelicula(micine.creaPelicula());
			break;
		case 2:
			//digo el nombre que es el p para delPelicula
			Scanner teclado=new Scanner(System.in);
			System.out.println("Nombre de la pelicula: ");
			String nombre=teclado.nextLine();
			micine.delPelicula(nombre);
			break;
		case 3:
			//muuestro las peliculas del array que creo con getPeliculas
			micine.mostrarPelis(micine.getPeliculas());
			break;
			}
		}
	}
}


