package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Distancia {
		
		public static double DistanciaPuntos(){
			boolean seguir=false;
			double[] p1=new double[2];
			double[] p2=new double[2];
			Scanner teclado;
			do{
				teclado=new Scanner(System.in);
				try{
				
					System.out.println("Introduce las coordenadas del punto X(dos numeros reales: ");
					int c=0;
					do{
						p1[c]=teclado.nextDouble();
						c++;
						seguir=false;
					}while(c<2);
				}
				catch(InputMismatchException e){
					System.out.println("No has introducido dos numeros validos");
					seguir=true;
				}
			}while(seguir==true);
			
			do{	
				teclado=new Scanner(System.in);
				try{
					System.out.println("Introduce las coordenadas del punto Y(dos numeros reales: ");
					int c=0;
					do{
						p2[c]=teclado.nextDouble();
						c++;
						seguir=false;
					}while(c<2);
				}
				catch(InputMismatchException e){
					System.out.println("No has introducido dos numeros validos");
					seguir=true;
					
				}
			}while (seguir==true);	
			
			double d=Math.sqrt((Math.pow(p2[0]-p1[0],2))+(Math.pow(p2[1]-p1[1],2)));
			return d;
			
		}
	
	public static void main(String[] args) {
		System.out.printf("%s %.2f %s","La distancia entre dos puntos es: ",DistanciaPuntos()," ");
	}

}
