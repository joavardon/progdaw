package ejercicio1;

import java.util.Scanner;

public class cadena2 {
	static String mix(String c1,String c2){
		StringBuilder cadena=new StringBuilder("");
		StringBuilder cad1=new StringBuilder(c1);
		StringBuilder cad2=new StringBuilder(c2);
		int l=cad1.length()+cad2.length();
		int pos1=0;
		int pos2=2;
		while(cadena.length()<l){
			if(cad1.length()>pos2)
			cadena.append(cad1.substring(pos1, pos2));
			else{
				cadena.append(cad1.substring(pos1));
			}
			if(cad2.length()>pos2 )
			cadena.append(cad2.substring(pos1, pos2));
			else{
				cadena.append(cad2.substring(pos1));
			}
			pos1=pos1+2;
			pos2=pos2+2;		
			}
		System.out.println(cadena.length());
		if(cadena.length()>=l){
			if(cad1.length()>cad2.length())
					cadena.append(cad1.substring(pos1-1));
			else
					cadena.append(cad2.substring(pos1-1));
		}
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

