package cine;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Scanner;

public class Cine {

	private static ArrayList<Sesion>micine;
	private static ArrayList<String>actuales=new ArrayList<String>();
	
	
	
	public static void pelisAhora(){
		Scanner teclado=new Scanner(System.in);
		//a que hora queremos mirar las pelis que hay
		System.out.println("¿Que hora es: ?");
		String hora=teclado.next();
		boolean esta;
		//vamos a ir mirando en todas las sesiones del cine
		for(int i=0;i<micine.size();i++){
			esta=false;
			//si la hora de la sesion es la misma que la hora que queremos mirar(guardada en variable hora)
			if(micine.get(i).getHoraComienzo().equals(hora)){
				//mientras la pelicula de igual nombre (incluidas las de 3d) no este en la lista actuales(ninguna al principio)
				for(int j=0;j<actuales.size() && !esta;j++){
					//aplico el metodo iguales que cree en peliculas
					if(micine.get(i).iguales(actuales.get(j))){
						esta=true;//si esta a true para el bucle for mas proximo y no se guardara en actuales 
						}
				}
				if(!esta){//si no estaba ya(el resultado de esta tras el for es falso)
					actuales.add(micine.get(i).getNombre());//añado el nombre de la pelicula a actuales
				}
			}	
		}
		//imprimir el nombre de las peliculas (String) que hechan a la hora que dijimos
		System.out.println("Las peliculas que estan hechando a la hora indicada son: ");
		for(int i=0;i<actuales.size();i++){
			System.out.println(actuales.get(i));
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
	public static void main(String[] args) {
		menu();

	}
	private static void menu() {
		Scanner teclado=new Scanner(System.in);
		micine=new ArrayList<Sesion>();
		int opcion;
		do{
			System.out.println("Elige una opcion: \n"+"1. Crear sesión\n"+"2. Borrar sesión\n"
			+"3. Ver disponibles\n"+"4. Peliculas en proyección\n"+"5. Salir");
			opcion=teclado.nextInt();
			switch(opcion){
			case 1:
				micine.add(Cine.creaSesion());
				break;
			case 2:
				System.out.println("Indice pelicula a borrar: ");
				int n=teclado.nextInt()-1;
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

}
