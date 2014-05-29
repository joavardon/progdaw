package actividad4;

import java.util.Scanner;

import actividad4.BibliotecaPersonal;
import actividad4.Libro;

public class BibliotecaPersonal {

	private Libro[] libros;
	private int num_libros;
	
	public BibliotecaPersonal(int max_libros) {
		libros=new Libro[max_libros];
		
		num_libros = 0;
	}
	
	public void añadirLibro(String nombre, String autor, String isbn) {
		Libro nuevoLibro;
		
		nuevoLibro = new Libro(nombre,autor,isbn);
		
		libros[num_libros] = nuevoLibro;
		num_libros++;
	}
	
	public void añadirLibro(Libro nuevo) {
		libros[num_libros] = nuevo;
		num_libros++;
	}
	
	public String toString() {
		String cadena;
		
		cadena = "BibliotecaPersona: " + num_libros + " ejemplares\n";
		for(int i=0;i<num_libros;i++) {
			cadena = cadena + libros[i] + "\n"; 
		}
		
		return cadena;
	}
	
	public Libro getLibro(int orden) { 
		return libros[orden];
	}
	
	public int getNumLibros() {
		return num_libros;
	}

	
	private int mostrarMenu(){
		System.out.println("************Biblioteca Personal**************");
		System.out.println("1. Listar libros");
		System.out.println("2. Añadir libro");
		System.out.println("3. Eliminar libro");
		System.out.println("4. Salir");
		System.out.println(" Opción: ");
		Scanner teclado=new Scanner(System.in);
		
		return teclado.nextInt();
	}
	
	public void listarLibros() {
		System.out.println("Biblioteca ("+num_libros+" ejemplares)");
		for(int i=0;i<this.getNumLibros();i++)
			System.out.println(this.getLibro(i).toString());
	}
	
	public void eliminarLibro(){
		System.out.println("¿Qué posicion quieres eliminar?");
		Scanner teclado=new Scanner(System.in);
		int posicion=teclado.nextInt();
	
		if(posicion<=num_libros && posicion>0){
				if(num_libros>1){
				libros[posicion-1]=libros[num_libros-1];
				libros[num_libros-1]=null;//si no lo pongo me seguirá poniendo el ultimo elemento
				//System.out.println(libros[num_libros-1]);
				num_libros--;}
		else{
		System.out.println("Error");
		}
				
	}
		
	}
	
	public static void main(String[] args) {
		BibliotecaPersonal mibiblioteca;
		int respuesta;
		
		mibiblioteca=new BibliotecaPersonal(100);
		
		respuesta=mibiblioteca.mostrarMenu();
		while (respuesta<=3){
			switch (respuesta) {
				case 1:
					//System.out.println(mibiblioteca);
					mibiblioteca.listarLibros();
					break;
				case 2:
					Libro l = crearNuevoLibro();
					mibiblioteca.añadirLibro(l);					
					break;
				case 3:
					mibiblioteca.eliminarLibro();
			}
			
			
			respuesta = mibiblioteca.mostrarMenu();
		}
	}
	
	public static Libro crearNuevoLibro() {
		Libro libronuevo;
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dime el nombre:");
		String nombre=teclado.nextLine();
		System.out.print("Dime el autor:");
		String autor=teclado.nextLine();
		System.out.print("Dime el isbn:");
		String isbn=teclado.nextLine();
		
		libronuevo = new Libro(nombre,autor,isbn);
		
		return libronuevo;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	
	
	
}
