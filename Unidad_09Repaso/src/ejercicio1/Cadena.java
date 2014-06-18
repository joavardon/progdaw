package ejercicio1;

import java.util.Scanner;

public class Cadena {
	static String mix(String c1,String c2){
		StringBuilder cadena=new StringBuilder("");
		StringBuilder cad1=new StringBuilder(c1);
		StringBuilder cad2=new StringBuilder(c2);
		int vueltas;
		if(cad1.length()>cad2.length()){
			vueltas=cad2.length()/2;
		}
		else{
			vueltas=cad1.length()/2;
		}
		int pos1=0;
		int pos2=2;
		for(int i=0;i<vueltas;i++){
			cadena.append(cad1.substring(pos1, pos2));
			cadena.append(cad2.substring(pos1, pos2));
			pos1=pos1+2;
			pos2=pos2+2;		
		}
		System.out.println(cadena.length());
		if(cad1.length()>=cad2.length())
		cadena.append(cad1.substring(pos1));
		else if(cad2.length()>=cad1.length())
		cadena.append(cad2.substring(pos1));
		return cadena.toString();
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la primera frase: ");
		String cad1=teclado.next();
		System.out.println("Introduce la segunda frase: ");
		String cad2=teclado.next();
		System.out.println(mix(cad1,cad2));
	}

}

