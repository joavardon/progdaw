package ejercicio4;

import java.util.ArrayList;
import java.util.Date;


public class PruebaIncidencias {
	
	public static void main(String[] args) {
		ArrayList<Incidencias>listaIncidencias=new ArrayList<Incidencias>();
		int numIncidencias=0;
		int defectos=0;
		int mejoras=0;
		int abiertasMejoras=0;
		int abiertasDefectos=0;
		Menu mimenu=new Menu();
		mimenu.setTitulo("Gestor de Incidencias");
		mimenu.añadirOpcion("Nueva");
		mimenu.añadirOpcion("Listado");
		mimenu.añadirOpcion("Resumen");
		mimenu.añadirOpcion("Salir");
		int opcion=-1;
		boolean seguir=false;
		int numInc;
		String miestado;
		int estado;
	do{
		try{
			do{
			opcion=mimenu.mostrar();
			}while(opcion<1 || opcion>4);
			switch(opcion){
					case 1:
						Menu mimenu2=new Menu();
						mimenu2.setTitulo("Añadir incidencia");
						mimenu2.añadirOpcion("Nueva Mejora");
						mimenu2.añadirOpcion("Nuevo Defecto");
						mimenu2.añadirOpcion("Salir");
						int opcion2=-1;
						boolean seguir2=false;
						do{
							try{
								do{
								opcion2=mimenu2.mostrar();
								}while(opcion2<1 || opcion2>3);
								switch(opcion2){
								case 1:
									numInc=(int)(Math.random()*20000+1);
									System.out.println(numInc);
									Date d=new Date();
									Mejoras i2=new Mejoras(numInc,"mejora del sistema",d);
									estado=(int)(Math.random()*3);
									miestado=i2.asignaEstado(estado);
									if(!listaIncidencias.contains(i2)){
										listaIncidencias.add(i2);
										numIncidencias++;
										 if(i2.getClass().getSimpleName().equals("Mejoras")){
											mejoras++;
											if(miestado.equalsIgnoreCase("Asignada")||miestado.equalsIgnoreCase("Abierta")){
												abiertasMejoras++;
											}
											
										}
										
									}
									else{
										System.out.println("Ya existe");
									}
									break;
								case 2:
									numInc=(int)(Math.random()*20000+1);
									System.out.println(numInc);
									Defectos i1=new Defectos(numInc,"defecto del sistema","v.25");
									String arch1="archivo1";
									String arch2="archivo2";
									String arch3="archivo3";
									i1.addArchivoAfectado(arch1);
									i1.addArchivoAfectado(arch2);
									i1.delArchivoAfectado(arch3);
									i1.delArchivoAfectado(arch1);
									estado=(int)(Math.random()*3);
									miestado=i1.asignaEstado(estado);
									
									if(!listaIncidencias.contains(i1)){
										listaIncidencias.add(i1);
										numIncidencias++;
										if(i1.getClass().getSimpleName().equals("Defectos")){
											defectos++;
											if(miestado.equalsIgnoreCase("Asignada")||miestado.equalsIgnoreCase("Abierta")){
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
							seguir2=true;}
						}while(opcion2!=3 || seguir2==true);	
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
	