package actividad4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Filmoteca {
	
	public static void main(String[] args) {
		ArrayList<Pelicula> filmoteca=new ArrayList<Pelicula>();
		menu(filmoteca);
	}
	static void menu(ArrayList<Pelicula> f){
		int opc=-1;
		boolean error=false;
		do{
		
			try{
				System.out.println("*******MENÚ COLECCIÓN CINE*******");
				System.out.println("1.Insertar películas");
				System.out.println("2. Borrar películas");
				System.out.println("3. Modificar datos de las películas");
				System.out.println("4. Visualizar información de las películas");
				System.out.println("5. Salir");
				Scanner teclado=new Scanner(System.in);
				System.out.println("Elige una opción: ");
				opc=teclado.nextInt();
				switch(opc){
				case 1:
					Pelicula.insertar(f);
					break;
				case 2:
					Pelicula.borrar(f);
					break;
				case 3:
					Pelicula.modificar(f);
					break;
				case 4:
					Pelicula.visionar(f);
					break;
				case 5:
					error=false;
					System.out.println("Fin del programa");
				}
				}catch(InputMismatchException ex){
					System.out.println("ERROR al elegir OPCIÓN"+ex);
					error=true;
				}
			}while(opc!=5 || error==true);
		
	}
}