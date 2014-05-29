package ejercicios_arrays;

import java.util.Scanner;


public class Ejercicio2_2 {

	
	
	public static final int ENERO=1;
	public static final int FEBRERO=2;
	public static final int MARZO=3;
	public static final int ABRIL=4;
	public static final int MAYO=5;
	public static final int JUNIO=6;
	public static final int JULIO=7;
	public static final int AGOSTO=8;
	public static final int SEPTIEMBRE=9;
	public static final int OCTUBRE=10;
	public static final int NOVIEMBRE=11;
	public static final int DICIEMBRE=12;
	
	public enum Meses {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE }
	
	public static void main(String[] args) {
		int mes;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige un mes: ");
		mes=teclado.nextInt();
	
		
		switch(mes){
		case ENERO:
			System.out.println("Mes de enero");
			break;
		
		case FEBRERO:
			System.out.println("febrero");
			break;
		
		case MARZO:
			System.out.println("marzo");
			break;
		
		case ABRIL:
			System.out.println("abril");
			break;
		
		case MAYO:
			System.out.println("mayo");
			break;
		case JUNIO:
			System.out.println("junio");
			break;
		
		case JULIO:
			System.out.println("julio");
			break;
	
		case AGOSTO:
			System.out.println("agosto");
			break;
		
		case SEPTIEMBRE:
			System.out.println("septiembre");
			break;
		
		case OCTUBRE:
			System.out.println("octubre");
			break;
		
		case NOVIEMBRE:
			System.out.println("noviembre");
			break;
		
		case DICIEMBRE:
			System.out.println("diciembre");
		}
		
		teclado.close();
	}
}
