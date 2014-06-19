package ejercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class PruebaIncidencias {
	
	public static void main(String[] args) {
		ArrayList<Incidencias>listaIncidencias=new ArrayList<Incidencias>();
		int numIncidencias=0;
		int defectos=0;
		int mejoras=0;
		int abiertasMejoras=0;
		int abiertasDefectos=0;
		int numInc;
		Menu mimenu=new Menu();
		mimenu.setTitulo("Gestor de Incidencias");
		mimenu.añadirOpcion("Nueva");
		mimenu.añadirOpcion("Listado");
		mimenu.añadirOpcion("Resumen");
		mimenu.añadirOpcion("Salir");
		int opcion=-1;
		boolean seguir;
		String estado;
	do{
		try{
			do{
			opcion=mimenu.mostrar();
			}while(opcion<1 || opcion>4);
			seguir=false;
			switch(opcion){
					case 1:
						Menu mimenu2=new Menu();
						mimenu2.setTitulo("Añadir incidencia");
						mimenu2.añadirOpcion("Nueva Mejora");
						mimenu2.añadirOpcion("Nuevo Defecto");
						mimenu2.añadirOpcion("Salir");
						int opcion2=-1;
						Scanner teclado;
						do{
							try{
								do{
								opcion2=mimenu2.mostrar();
								}while(opcion2<1 || opcion2>3);
								seguir=false;
								switch(opcion2){
								case 1:
									teclado=new Scanner(System.in);
									numInc=(int)(Math.random()*20000+1);
									Date d=new Date();
									System.out.println("Escribe el mensaje: ");
									String m=teclado.nextLine();
									Mejoras mejora=new Mejoras(numInc,"mejora del sistema",d);
									System.out.println("Escribe el porcentaje: ");
									double p=teclado.nextDouble();
									mejora.setPorcentaje(p);
									do{
									System.out.println("Escribe el estado: ");
									estado=teclado.next();
									mejora.setEstado(estado);
									}while(!estado.equalsIgnoreCase("abierta")&&!estado.equalsIgnoreCase("asignada")&&!estado.equalsIgnoreCase("cerrada"));
									if(!listaIncidencias.contains(mejora)){
										listaIncidencias.add(mejora);
										numIncidencias++;
										 if(mejora.getClass().getSimpleName().equals("Mejoras")){
											mejoras++;
											if(mejora.getEstado().equalsIgnoreCase("Asignada")|mejora.getEstado().equalsIgnoreCase("Abierta")){
												abiertasMejoras++;
											}
											
										}
										
									}
									else{
										System.out.println("Ya existe");
									}
									break;
								case 2:
									teclado=new Scanner(System.in);
									numInc=(int)(Math.random()*20000+1);
									System.out.println("Escribe el mensaje: ");
									m=teclado.nextLine();
									System.out.println("Escribe la version: ");
									String v=teclado.nextLine();
									Defectos defecto=new Defectos(numInc,m,v);
									String arch1="archivo1";
									String arch2="archivo2";
									String arch3="archivo3";	
									defecto.addArchivoAfectado(arch1);
									defecto.addArchivoAfectado(arch2);
									defecto.delArchivoAfectado(arch3);
									defecto.delArchivoAfectado(arch1);
									do{
										System.out.println("Escribe el estado: ");
										estado=teclado.next();
										defecto.setEstado(estado);
										}while(!estado.equalsIgnoreCase("abierta")&&!estado.equalsIgnoreCase("asignada")&&!estado.equalsIgnoreCase("cerrada"));
									if(!listaIncidencias.contains(defecto)){
										listaIncidencias.add(defecto);
										numIncidencias++;
										if(defecto.getClass().getSimpleName().equals("Defectos")){
											defectos++;
											if(defecto.getEstado().equalsIgnoreCase("Asignada")||defecto.getEstado().equalsIgnoreCase("Abierta")){
												abiertasDefectos++;
											}
											
										}
										
									}
									else{
										System.out.println("Ya existe");
									}
									break;
								}
							}
							catch(Exception e){
							System.out.println("Error. Introduce un numero entre las indicadas ");
							seguir=true;}
						}while(opcion2!=3 || seguir==true);
						break;
					
					case 2:
						for(int i=0;i<listaIncidencias.size();i++){
							System.out.println(listaIncidencias.get(i).toString());
						}
						break;
					case 3:
						System.out.println("Existen un total de "+numIncidencias+" incidencias.");	
						System.out.println("Total mejoras: "+mejoras+"("+abiertasMejoras+" abiertas)");
						System.out.println("Total defectos: "+defectos+"("+abiertasDefectos+" abiertos)");
						break;
					}
				}
			catch(Exception e){
			System.out.println("Error. Introduce un numero entre las indicadas ");
			seguir=true;}
		}while(opcion!=4 || seguir==true);
	}
	
}
	