/*
 * crear una coleccion de caracteres que se iran introduciendo 
 * por teclado hasta que se ponga *. 
 * Decir si hay algun caracter duplicado.
 */
package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char caracter=' ';
		ArrayList<Character>lista=new ArrayList<Character>();
		while(caracter!='*'){
			System.out.println("Introduce un caracter: ");
			String car=teclado.next();
			caracter=car.charAt(0);
			if(caracter!='*'){
			lista.add(caracter);}
		}
		//HashSet<Character>repes=new HashSet<Character>();
		boolean repetido=false;
		int contador=1;
		ArrayList<Character>lista2=new ArrayList<Character>();
		Iterator<Character>ite=lista.iterator();
		while(ite.hasNext()){
			char c=ite.next();
				if(!lista2.contains(c)){
					lista2.add(c);
				}
				else{repetido=true;}
			
		}
		
		if(repetido){
			System.out.println("Hay elemento repetidos");
		}
		else{
			System.out.println("no hay repetidos");
		}
		
		Iterator<Character> ite2=lista2.iterator();
		
		while(ite2.hasNext()){
			char v=ite2.next();
			System.out.print(v);
		}
	}

}
