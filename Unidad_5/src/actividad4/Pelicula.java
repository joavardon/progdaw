/*Imagina que quieres crear un programa que te permita organizar tus películas. 
Crearemos una clase Película donde recogemos toda la información relacionada con un film. 
Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres), 
fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: insertar,
modificar, eliminar, buscar o visualizar una película.*/
package actividad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pelicula {
	
	private String titulo;
	private static  ArrayList<String> actores;
	private static  ArrayList<String>  directores;
	private int fecha_estreno;
	private String formato;
	Pelicula(){
		
	}
	Pelicula(String tit, ArrayList<String> act, ArrayList<String> dir,int fecha,String form){
		this.titulo=tit;
		Pelicula.actores=act;
		Pelicula.directores=dir;
		this.fecha_estreno=fecha;
		this.formato=form;
		
	}
	//metodos
	static  void insertar(ArrayList<Pelicula> p){
		ArrayList<Pelicula> filmoteca=p;
		System.out.println("¿Cuántas películas quieres añadir a tu colección?: ");
		Scanner teclado=new Scanner(System.in);
		int numpelis=teclado.nextInt();
		for (int i=0;i<numpelis;i++){
			teclado=new Scanner(System.in);
			System.out.println("Nombre de la película :");
			String tit = teclado.nextLine();
			ArrayList<String> actores=new ArrayList<String>();
			ArrayList<String> directores=new ArrayList<String>();
			for(int j=0;j<10;j++){
				System.out.println("Añade un actor (o un (*) o enter para no meter más actores) :");
				String actor=teclado.nextLine();
				if(actor.equals("*" )||actor.equals("" )){
					break;
				}
				actores.add(j,actor);}
			
			for(int j=0;j<10;j++){
				System.out.println("Añade un director (o un (*) o enter para no meter más directores) :");
				String director=teclado.nextLine();
				if(director.equals("*")||director.equals("" )){
					break;
				}
				directores.add(j,director);}
		
		System.out.println("Fecha de estreno :");
		int fecha = teclado.nextInt();
		System.out.println("Formato :");
		String form = teclado.next();
		System.out.println("********************************");
		Pelicula peli=new Pelicula(tit,actores,directores,fecha,form);
		filmoteca.add(peli);}
	}
	static void borrar(ArrayList<Pelicula> p){
		Scanner teclado=new Scanner(System.in);
		ArrayList<Pelicula> filmoteca=p;
		System.out.println("¿Qué película quieres borrar?: ");
		String n=teclado.nextLine();
		Pelicula.buscar(filmoteca,n);
		for(int i=0;i<filmoteca.size();i++){
			if(n.equalsIgnoreCase(filmoteca.get(i).getTitulo())){
				filmoteca.remove(i);
			}
		}
		System.out.println("********************************");
	}
	static void visionar(ArrayList<Pelicula> p){
		
		Scanner teclado=new Scanner(System.in);
		ArrayList<Pelicula> filmoteca=p;
		System.out.println("¿Qué película quieres visionar?: ");
		String n=teclado.nextLine();
		Pelicula.buscar(filmoteca,n);
		for(int i=0;i<filmoteca.size();i++){
			if(n.equalsIgnoreCase(filmoteca.get(i).getTitulo())){
				System.out.println("Título: "+filmoteca.get(i).getTitulo());
				for(int j=0;j<actores.size();j++){
				System.out.println("Actor protagonista "+(j+1)+": "+actores.get(j));
				}
				for(int j=0;j<directores.size();j++){
				System.out.println("Director: "+directores.get(j));
				}
				System.out.println("Fecha de estreno: "+filmoteca.get(i).getFecha_estreno());
				System.out.println("Formato: "+filmoteca.get(i).getFormato());}
			}
		System.out.println("********************************");
	}
	
	static void modificar(ArrayList<Pelicula> p){
		Scanner teclado=new Scanner(System.in);
		ArrayList<Pelicula> filmoteca=p;
		System.out.println("¿Qué película quieres modificar: ?");
		String n=teclado.nextLine();
		Pelicula.buscar(filmoteca,n);
		for(int i=0;i<filmoteca.size();i++){
			if(n.equalsIgnoreCase(filmoteca.get(i).getTitulo())){
				System.out.println("¿Qué elemento quieres modificar de la película: ?");
				String elemento=teclado.nextLine();
				for(int j=0;j<filmoteca.size();j++){
					if(elemento.equalsIgnoreCase("titulo")){
						String nuevotitulo=teclado.nextLine();
						filmoteca.get(j).setTitulo(nuevotitulo);}
					if(elemento.equalsIgnoreCase("fecha")){
						String nuevafecha=teclado.nextLine();
						filmoteca.get(j).setTitulo(nuevafecha);}
					if(elemento.equalsIgnoreCase("formato")){
						String nuevoformato=teclado.nextLine();
						filmoteca.get(j).setTitulo(nuevoformato);}
					
					if(elemento.equalsIgnoreCase("actores")){
						
						for (int k=0;k<actores.size()-1;k++){
							System.out.println(actores.size());
							actores.remove(k);
							System.out.println("Introduce un actor: ");
							String nuevoactor=teclado.nextLine();
							actores.add(k,nuevoactor);}
					if(elemento.equalsIgnoreCase("directores")){
						for (int k=0;k<directores.size()-1;k++){
							directores.remove(k);
							System.out.println("Introduce director: ");
							String nuevodirector=teclado.nextLine();
							directores.add(k, nuevodirector);}}
						}
					}
				}
			}
		System.out.println("********************************");		
	}
	static void buscar(ArrayList<Pelicula> p,String n){
		//Scanner teclado=new Scanner(System.in);
		ArrayList<Pelicula> filmoteca=p;
		/*System.out.println("¿Qué película quieres buscar: ?");
		String palabra=teclado.nextLine();*/
		if(filmoteca.size()==0){
			System.out.println("No hay ninguna película en la colección");
		}
		else{
		for (int i=0;i<filmoteca.size();i++){
			
			if(n.equalsIgnoreCase(filmoteca.get(i).getTitulo())){
				System.out.println("Está en la colección");
				}
			else{
				System.out.println("No está en la colección");
				}
			}
		}
	}
	public String getTitulo() {
		return titulo;
	}
	
	public int getFecha_estreno() {
		return fecha_estreno;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
		

	
	

}
