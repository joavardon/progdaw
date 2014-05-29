package actividad4_8;

import java.util.Scanner;

public class PruebaMenu {

	
	public static void main(String[] args) {
		Pelicula[] mispelis=new Pelicula[10];
		Scanner teclado=new Scanner(System.in);
		Filmoteca nuevaFilmoteca=new Filmoteca(0,mispelis,teclado);
		Menu mimenu;
		
		mimenu = new Menu("Menu Filmoteca");
		
		mimenu.añadirOpcion("Crear Pelicula");
		mimenu.añadirOpcion("Listar Filmoteca");
		mimenu.añadirOpcion("Eliminar Pelicula");
		mimenu.añadirOpcion("Salir");
		
		int resultado= mimenu.mostrarMenu();
		prueba(resultado,mimenu,nuevaFilmoteca);
	}
public static  void prueba(int r, Menu menu, Filmoteca f){
		
		do{
		
		switch(r){
		
		case 1: 
				Filmoteca.añadir();
				r=menu.mostrarMenu();
				break;
		case 2: listar();
				r=menu.mostrarMenu();
				break;
		case 3: Filmoteca.eliminar();
				r=menu.mostrarMenu();
				break;
		}
		}while(r!=4);
		
	}

public static void listar(){
	if (Filmoteca.contadorPeliculas == 0)
		System.out.println("No hay pelÃ­culas en la filmoteca.");
	else {
		for (int i = 0; i <= Filmoteca.contadorPeliculas - 1; ++i) {
			System.out.println(Filmoteca.peliculas[i].visualizar());}
	}
}

}
