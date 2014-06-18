package cine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CineMenu {
	private static ArrayList<Sesion>micine;
	private static ArrayList<Pelicula>actuales;
	private static Scanner teclado;
	public static void main(String[] args) {
		/*
		Pelicula p1=new Pelicula("Amadeus");
		Pelicula p2=new Pelicula("Amadeus 3D");
		System.out.println(p1.equals(p2));
		Pelicula p3=new Pelicula("Amadeu");
		System.out.println(p1.equals(p3));*/
		String[] opciones={"Crear sesión","Borrar sesión","Ver disponibles","Peliculas en proyección","Salir"};
		Menu cine=new Menu(opciones,5);
		micine=new ArrayList<Sesion>();
		actuales=new ArrayList<Pelicula>();
		cine.setTitulo("MI CINE");
		teclado=new Scanner(System.in);
		int opcion;
		do{
		opcion=cine.mostrar();
		switch(opcion){
		case 1:
			micine.add(creaSesion());
			break;
		case 2:
			System.out.println("Indice sesion a borrar: ");
			int n=teclado.nextInt()-1;
			if(n>=0 && n<micine.size())
				micine.remove(micine.get(n));
			break;
		case 3:
			Iterator<Sesion>ite=micine.iterator();
			while(ite.hasNext()){
				Sesion s=ite.next();
				System.out.println(s.toString());
			}
			break;
		case 4:
			pelisAhora();
			break;
		}
		}while(opcion!=5);

	}
	public static void pelisAhora(){
		Scanner teclado=new Scanner(System.in);
		//a que hora queremos mirar las pelis que hay
		System.out.println("¿Que hora es: ?");
		String hora=teclado.next();
		actuales.removeAll(actuales);
		//vamos a ir mirando en todas las sesiones del cine
		for(int i=0;i<micine.size();i++){
			//si no esta en actuales y la hora de la sesion es la misma que la hora que queremos mirar(guardada en variable hora)
			if(micine.get(i).getHoraComienzo().equals(hora) && !actuales.contains(micine.get(i))){
						actuales.add(micine.get(i));
				}
			}	
		
		//imprimir el nombre de las peliculas (String) que hechan a la hora que dijimos
		System.out.println("Las peliculas que estan echando a la hora indicada son: ");
		for(int i=0;i<actuales.size();i++){
			if(actuales.get(i).getNombre().endsWith("3D")){
				System.out.println(actuales.get(i).getNombre().substring(0,micine.get(i).getNombre().lastIndexOf("3D",'3')).trim());
				}
			else{
				System.out.println(actuales.get(i).getNombre());
				}
		}

		
	}
	
	public static Sesion creaSesion(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre=teclado.nextLine();
		System.out.println("Hora: ");
		String hora=teclado.nextLine();
		System.out.println("Sala: ");
		int sala=teclado.nextInt();
		Sesion s=new Sesion(nombre,hora, sala);
		return s;
	}
	
}
