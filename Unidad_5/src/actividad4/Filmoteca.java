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
				System.out.println("*******MEN� COLECCI�N CINE*******");
				System.out.println("1.Insertar pel�culas");
				System.out.println("2. Borrar pel�culas");
				System.out.println("3. Modificar datos de las pel�culas");
				System.out.println("4. Visualizar informaci�n de las pel�culas");
				System.out.println("5. Salir");
				Scanner teclado=new Scanner(System.in);
				System.out.println("Elige una opci�n: ");
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
					System.out.println("ERROR al elegir OPCI�N"+ex);
					error=true;
				}
			}while(opc!=5 || error==true);
		
	}
}