package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2Or {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char caracter=' ';
		ArrayList<Character>lista=new ArrayList<Character>();
		do{
			System.out.println("Introduce un caracter: ");
			String car=teclado.next();
			caracter=car.charAt(0);
			if(caracter!='*'){
				lista.add(caracter);}
		}while(caracter!='*');
		//HashSet<Character>repes=new HashSet<Character>();
		boolean repetido=false;
		int contador=1;
		Iterator<Character>ite=lista.iterator();
		while(ite.hasNext() && repetido==false){
			char c=ite.next();
			for(int i=contador;i<lista.size();i++){
				if(c==lista.get(i)){
					repetido=true;
					break;
				}
			}
			contador++;
		}
		
		if(repetido){
			System.out.println("Hay elemento repetidos");
		}
		else{
			System.out.println("no hay repetidos");
		}
	
	

	}

}
