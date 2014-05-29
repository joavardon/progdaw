package examen;

import java.util.Scanner;

public class Ejercicio2 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("A qué temperatura quieres estar?");
		float temp=teclado.nextFloat();
		System.out.println("¿Con qué histéresis trabajamos?");
		float hist=teclado.nextFloat();
		boolean seguir=true;
		boolean encendido=true;
		while(seguir=true){
			//System.out.println(encendido);
			System.out.print("¿Temperatura actual?");
			float temp_actual=teclado.nextFloat();
			
				if(temp_actual<temp+hist && encendido==true){
					System.out.println("--------------");
					System.out.println("----Encendido----");
					System.out.println("--------------");
				}
				else if(temp_actual>=temp+hist && encendido==true){
					System.out.println("--------------");
					System.out.println("----apagado----");
					System.out.println("--------------");
					encendido=false;	
				}	
				else if(temp_actual>temp-hist && encendido==false){
						System.out.println("--------------");
						System.out.println("----apagado----");
						System.out.println("--------------");
						}
				else{
					System.out.println("--------------");
					System.out.println("----Encendido----");
					System.out.println("--------------");
					encendido=true;
				}
				//System.out.println(encendido);
		}
	}

}
