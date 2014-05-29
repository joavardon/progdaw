/*Crea un programa (clase Filmoteca) que permita: 
 * insertar, modificar, eliminar, buscar o visualizar una pel�cula.*/
package actividad4_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Filmoteca {
	public static Pelis[]mispelis=new Pelis[5];
	public static int contador=0;
	public static Scanner teclado=new Scanner(System.in);
	Filmoteca(){
		
	}

	public static void insertar(){
				teclado.nextLine();
				System.out.println("T�tulo: ");
				String titulo=teclado.nextLine();
				System.out.println("Fecha de estreno: : ");
				String fecha=teclado.nextLine();
				System.out.println("Formato: : ");
				String formato=teclado.nextLine();
				System.out.println("�Cuantos actores a introducir: ?");
				int numact=teclado.nextInt();
				teclado.nextLine();
				String[] actores = new String[numact];
				for(int i=0;i<numact;i++){
					System.out.println("quien es el actor "+(i+1)+" :");
					actores[i]=teclado.nextLine();
				}
				
				System.out.println("�Cuantos directores a introducir: ?");
				
				int numdir=teclado.nextInt();
				teclado.nextLine();
				String[]directores = new String[numdir];
				for(int i=0;i<numdir;i++){
					System.out.println("quien es el director "+(i+1)+" :");
					directores[i]=teclado.nextLine();
				}
		mispelis[contador]=new Pelis(titulo,actores,directores,fecha,formato);
		contador++;
	
	}
	
public static void buscar(){
	boolean encontrada = false;
	System.out.println("Introduzca el titulo de la película: ");
	String buscada = teclado.next();
	do{
		for(int i=0;i<contador;i++){
			if(mispelis[i].getTitulo().equalsIgnoreCase(buscada)){
				encontrada=true;
				System.out.println("Esta en la colecci�n");
				
				}
			else{
				encontrada=true;
				System.out.println("No esta en la colecci�n");
			}
		}
		}
	while(!encontrada);
}
public static void modificar(){
	System.out.println("Pelicula a modificar: ");
	teclado.nextLine();
	String buscada=teclado.nextLine();
	for(int i=0;i<contador;i++){
		if(mispelis[i].getTitulo().equalsIgnoreCase(buscada)){
			System.out.println("�que elemento quieres modificar?: ");
			String elemento=teclado.nextLine();
			if(elemento.equalsIgnoreCase("titulo")){
				System.out.println("nuevo titulo: ");
				String titulo=teclado.next();
				mispelis[i].setTitulo(titulo);
				
			}
			else if(elemento.equalsIgnoreCase("fechaestreno")){
				System.out.println("nueva fecha: ");
				String fecha=teclado.next();
				mispelis[i].setFechaestreno(fecha);
			}
			else if(elemento.equalsIgnoreCase("formato")){
				System.out.println("nuevo formato: ");
				String formato=teclado.next();
				mispelis[i].setFormato(formato);
			}
			else if(elemento.equalsIgnoreCase("actores")){
				String[] actores = new String[mispelis[i].getActores().length];

				for (int j = 0; j < mispelis[i].getActores().length; ++j) {

					System.out.println("Actor actual: "
							+ mispelis[i].getActores()[j]);
					System.out.println("Introduzca nuevo nombre: ");
					actores[j] = teclado.next();
					
				}
				mispelis[i].setActores(actores);
			}
			else if(elemento.equalsIgnoreCase("directores")){
				String[] directores = new String[mispelis[i].getDirectores().length];

				for (int j = 0; j < mispelis[i].getDirectores().length; ++j) {

					System.out.println("Director actual: "+ mispelis[i].getDirectores()[j]);
					System.out.println("Introduzca nuevo nombre: ");
					directores[j] = teclado.next();

				}
				mispelis[i].setDirectores(directores);
			}

			
		}
	}
}

public static void eliminar(){
	System.out.println("Introduce la posición de la pelicula a eliminar:");
	Scanner teclado = new Scanner(System.in);

	try {
		int posicion = teclado.nextInt();
		if (posicion <= contador && posicion>0 ) {
			for (int i = posicion - 1; i < contador - 1; i++) {
				mispelis[i] = mispelis[i + 1];
			}
			mispelis[contador - 1] = null;
			contador--;
			System.out.println("El libro ha sido eliminado");
		} else {
			System.out
					.println("Error: Esta indicando una posición que se encuentra vacia.");
		}
	
	} catch (InputMismatchException e) {
		System.err
				.println("Error: Debe introducir un valor númerico comprendido"
						+ " entre las posiciones disponibles.");
		teclado.nextLine();
	}
	
}
public static void visualizar(){
	if (contador == 0)
		System.out.println("No hay películas en la filmoteca.");
	else {

		boolean encontrada = false;

		System.out.println("Introduzca el título de la película: ");
		String titulo = teclado.next();

		do {

			for (int i = 0; i < contador ; ++i) {

				if (mispelis[i].getTitulo().equalsIgnoreCase(titulo)) {

					encontrada = true;
					System.out.println(mispelis[i].visualizar()+"Titulo: "+mispelis[i].getTitulo()+"\n"+"Estreno: "+mispelis[i].getFechaestreno()+"\n"+"Formato: "+mispelis[i].getFormato());
					System.out.println(i);
				} else {
					encontrada = true;
					System.out.println("Pelicula no encontrada.");
				}
			}
			
		} while (!encontrada);//si es true para
	}
}	
public static void menu() {
	
	boolean finalizar = false;

	System.out.println("==== BIENVENIDO A FILMOTECA 1.0 ====");

	do {

		System.out.println("Elija una opción:");
		System.out.println("1.Añadir una película");
		System.out.println("2.Modificar una película");
		System.out.println("3.Eliminar una película");
		System.out.println("4.Buscar una película");
		System.out.println("5.Visualizar una película");
		System.out.println("6.Salir");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			insertar();
			break;
		case 2:
			modificar();
			break;
		case 3:
			eliminar();
			break;
		case 4:
			buscar();
			break;
		case 5:
			visualizar();
			break;
		case 6:
			break;
		}

		System.out.print("Desea realizar alguna otra operación[s/n]");
		String respuesta = teclado.next();
		if (respuesta.equalsIgnoreCase("n"))
			finalizar = true;

	} while (!finalizar);

	System.out
			.println("---------Gracias por utilizar FILMOTECA 1.0-----------");
}


	public Pelis[] getMispelis() {
		return mispelis;
	}

	public static void setMispelis(Pelis[] mispelis) {
		Filmoteca.mispelis = mispelis;
	}

	

}
