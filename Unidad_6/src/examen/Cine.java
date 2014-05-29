package examen;

import java.util.Scanner;

public class Cine {
	public String cine;
	public Pelicula[]cartelera;
	public int tama�oMaximoCartelera;
	public   int tama�oActual=0;
	Cine(String c,int n){
		this.cine=c;
		tama�oMaximoCartelera=n;
		cartelera=new Pelicula[tama�oMaximoCartelera];
	}
	public  Pelicula[] getPeliculas(){
		Pelicula[] carteleraAct=new Pelicula[tama�oActual];
		for(int i=0;i<tama�oActual;i++){
			carteleraAct[i]=cartelera[i];
		}
		return carteleraAct;
	}
	
	public void addPelicula(Pelicula p){
		if(tama�oActual<tama�oMaximoCartelera){
		cartelera[tama�oActual]=p;
		tama�oActual++;
		System.out.println("La pel�cula ha sido anadida correctamente.");}
		else{
			System.out.println("No se pueden meter mas de "+tama�oMaximoCartelera+ " peliculas");
		}
		System.out.println(tama�oActual);
		
	}
	public void delPelicula(String nombre){
		boolean existe=false;
		for(int i=0;i<tama�oActual;i++){
		
			if(nombre.equalsIgnoreCase(cartelera[i].getNombre())){
				Pelicula aux=cartelera[i];
				cartelera[i]=cartelera[tama�oActual-1];
				cartelera[tama�oActual-1]=aux;
				cartelera[tama�oActual - 1] = null;
				tama�oActual--;
				System.out.println("La pelicula ha sido eliminada");
				existe=true;
			}
			
		}
		if(!existe){
			System.out.println("no existe");
		}
	}
	public void mostrarPelis(Pelicula[] p){
		String cadena;
		for(int i=0;i<p.length;i++){
			cadena="";
			cadena=p[i].toString()+" ";
			System.out.println(cadena);
		}
		
	}
	public  Pelicula creaPelicula(){
		Pelicula p = null;
		Scanner teclado2=new Scanner(System.in);
		if(tama�oActual<tama�oMaximoCartelera){
		System.out.println("Nombre de la pelicula: ");
		String nombre=teclado2.nextLine();
		p=new Pelicula(nombre);
		System.out.println("A�ade generos a la pelicula: ");
		String genero="";
		int g=0;
		do{
			System.out.println("Genero introduce (* para salir): ");
			genero=teclado2.nextLine();
			if(!genero.equals("*") ){
			p.setGeneros(genero);
			g++;}
		}while(!genero.equals("*") && g<6);
		System.out.println(p.toString());
		}
		
		return p;
	}
	public String getCine() {
		return cine;
	}
	public void setCine(String cine) {
		this.cine = cine;
	}
	
	public static void menuPrincipal(Cine c) {
		Scanner teclado=new Scanner(System.in);
		boolean finalizar = false;

		System.out.println("==== BIENVENIDO A MICINE ====");

		do {
			teclado=new Scanner(System.in);
			System.out.println("Elija una opcion:");
			
			System.out.println("1.A�adir una pelicula");
			System.out.println("2.Eliminar una pelicula");
			System.out.println("3.Visualizar peliculas");
			System.out.println("4.Salir");
			int opcion = teclado.nextInt();
			switch(opcion){
			
			case 1:
				//creo una pelicula parametro para addPelicula
				c.addPelicula(c.creaPelicula());
				break;
			case 2:
				//digo el nombre que es el p para delPelicula
				Scanner teclado2=new Scanner(System.in);
				System.out.println("Nombre de la pelicula: ");
				String nombre=teclado2.nextLine();
				c.delPelicula(nombre);
				break;
			case 3:
				//muuestro las peliculas del array que creo con getPeliculas
				c.mostrarPelis(c.getPeliculas());
				break;
				
			case 4:
				break;}
			System.out.print("Desea realizar alguna otra operacion[s/n]");
			String respuesta = teclado.next();
			if (respuesta.equalsIgnoreCase("n"))
				finalizar = true;

		} while (!finalizar);

		System.out
				.println("---------Gracias por utilizar micine-----------");
	}

}
