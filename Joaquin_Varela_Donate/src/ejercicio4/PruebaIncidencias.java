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
		Menu mimenu=new Menu();
		mimenu.setTitulo("Gestor de Incidencias");
		mimenu.añadirOpcion("Nueva");
		mimenu.añadirOpcion("Listado");
		mimenu.añadirOpcion("Resumen");
		mimenu.añadirOpcion("Salir");
		int opcion=-1;
		boolean seguir=false;

	do{
		try{
			do{
			opcion=mimenu.mostrar();
			}while(opcion<1 || opcion>4);
			switch(opcion){
					case 1:
						int numInc=(int)(Math.random()*20000+1);
						System.out.println(numInc);
						Defectos i1=new Defectos(numInc,"defecto del sistema","v.25");
						String arch1="archivo1";
						String arch2="archivo2";
						String arch3="archivo3";
						i1.addArchivoAfectado(arch1);
						i1.addArchivoAfectado(arch2);
						i1.delArchivoAfectado(arch3);
						i1.delArchivoAfectado(arch1);
						int estado=(int)(Math.random()*3);
						String miestado=i1.asignaEstado(estado);
						
						if(!listaIncidencias.contains(i1)){
							listaIncidencias.add(i1);
							numIncidencias++;
							if(i1.getClass().getSimpleName().equals("Defectos")){
								defectos++;
								if(miestado.equalsIgnoreCase("Asignada")||miestado.equalsIgnoreCase("Abierta")){
									abiertasDefectos++;
								}
								
							}
							else if(i1.getClass().getSimpleName().equals("Mejoras")){
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
	