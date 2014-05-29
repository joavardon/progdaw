package ejemplos;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BibliotecaPersonal {

	private Libro[] libros;
	private int num_libros;

	public BibliotecaPersonal(int max_libros) {
		libros = new Libro[max_libros];

		num_libros = 0;
	}

	public void a馻dirLibro(String nombre, String autor, String isbn) {
		Libro nuevoLibro;

		nuevoLibro = new Libro(nombre, autor, isbn);

		libros[num_libros] = nuevoLibro;
		num_libros++;
		System.out.println("El libro ha sido a帽adido correctamente.");
	}

	public void a馻dirLibro(Libro nuevo) {
		libros[num_libros] = nuevo;
		num_libros++;
		System.out.println("El libro ha sido a帽adido correctamente.");
	}

	public void borrarLibro() {
		System.out.println("Introduce la posici贸n del libro a eliminar:");
		Scanner teclado = new Scanner(System.in);

		try {
			int posicion = teclado.nextInt();
			if (posicion <= num_libros && posicion>0) {
				for (int i = posicion - 1; i < num_libros - 1; i++) {
					libros[i] = libros[i + 1];
				}
				libros[num_libros - 1] = null;
				num_libros--;
				System.out.println("El libro ha sido eliminado");
			} else {
				System.out
						.println("Error: Esta indicando una posici贸n que se encuentra vacia.");
			}

		} catch (InputMismatchException e) {
			System.err
					.println("Error: Debe introducir un valor n煤merico comprendido"
							+ " entre las posiciones disponibles.");
			teclado.nextLine();
		}

	}
	
	public void borrarLibroDesordenado() {
		System.out.println("Introduce la posici贸n del libro a eliminar:");
		Scanner teclado = new Scanner(System.in);

		try {
			int posicion = teclado.nextInt();
			if (posicion <= num_libros && posicion>0) {
				if (num_libros > 1) libros[posicion-1] = libros[num_libros - 1];
				libros[num_libros - 1] = null;
				num_libros--;
				System.out.println("El libro ha sido eliminado");
			} else {
				System.out
						.println("Error: Esta indicando una posici贸n que se encuentra vacia.");
			}

		} catch (InputMismatchException e) {
			System.err
					.println("Error: Debe introducir un valor n煤merico comprendido"
							+ " entre las posiciones disponibles.");
			teclado.nextLine();
		}

	}

	public String toString() {
		String cadena;

		cadena = "BibliotecaPersonal: " + num_libros + " ejemplares";
		for (int i = 0; i < num_libros; i++) {
			cadena = cadena + libros[i].toString() + "\n";
		}

		return cadena;
	}

	public Libro getLibro(int orden) {
		return libros[orden];
	}

	public int getNumLibros() {
		return num_libros;
	}

	public void listarLibros() {
		System.out.println("Biblioteca (" + num_libros + " ejemplares)");
		for (int i = 0; i < getNumLibros(); i++) {
			System.out.println("Posici贸n: " + (i + 1) + "\t"
					+ this.getLibro(i).toString());
		}
	}

	private int mostrarMenu() {
		System.out.println("Biblioteca Personal");
		System.out.println("1. Listar libros");
		System.out.println("2. A帽adir libro");
		System.out.println("3. Borrar libro");
		System.out.println("4. Salir");

		Scanner teclado = new Scanner(System.in);
int respuesta = 0;
		boolean continuarCiclo = false;
		do {
			try {
				System.out.println("-->Elija una Opci贸n: ");
				respuesta = teclado.nextInt();
				continuarCiclo = false;
			} catch (InputMismatchException e) {
				System.err
						.println("Error: Debe introducir un valor n煤merico comprendido"
								+ " entre las opciones disponibles.");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		return respuesta;
	}

	public static void main(String[] args) {

		BibliotecaPersonal miBiblioteca;
		miBiblioteca = new BibliotecaPersonal(100);

		int respuesta;

		do {
			System.out.println("\n* Mi Biblioteca: *");
			for (int k = 0; k < 20; k++)
				System.out.print("*");
			System.out.println();
			do {
				respuesta = miBiblioteca.mostrarMenu();
			} while (respuesta<1 || respuesta>4);

			switch (respuesta) {
			case 1:
				// System.out.println(miBiblioteca);
				miBiblioteca.listarLibros();
				break;
			case 2:
				Libro l = crearNuevoLibro();
				miBiblioteca.a馻dirLibro(l);
				break;
			case 3:
				//miBiblioteca.borrarLibro();
				miBiblioteca.borrarLibroDesordenado();
				break;
			case 4:
				System.out.println("FIN DEL PROGRAMA: Biblioteca Personal.");
			}
		} while (respuesta != 4);

	}

	public static Libro crearNuevoLibro() {
		Libro libroNuevo;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Dime el autor:");
		String autor = teclado.nextLine();
		System.out.println("Dime el isbn:");
		String isbn = teclado.nextLine();

		libroNuevo = new Libro(nombre, autor, isbn);

		return libroNuevo;
	}

}

