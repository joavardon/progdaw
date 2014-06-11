package ejercicio1;

import java.util.Scanner;

public class cadena {
	
	static String cadenas(String c1, String c2,String c3,String c4){
		StringBuilder cadena=new StringBuilder("");
		String cad1=c1;
		String cad2=c2;
		String inicial=c3;
		String ultima =c4;
		int pos1=0;
		int pos2=2;
		
			int vueltas=cad2.length()/2;
			for(int i=0;i<vueltas;i++){
				cadena.append(inicial.substring(pos1, pos2));
				cadena.append(ultima.substring(pos1, pos2));
				pos1=pos1+2;
				pos2=pos2+2;
			}
			String cadRestante1=cad1.substring(pos1,cad1.length());
			String cadRestante2=cad2.substring(pos1,cad2.length());
			
			if(inicial.length()<ultima.length()){
				if(vueltas*2!=cad2.length()){
					cadena.append(cadRestante2);
					}
				cadena.append(cadRestante1);
			}
			else{
				cadena.append(cadRestante1);
			if(vueltas*2!=cad2.length()){
				cadena.append(cadRestante2);
				}
			}
			
			return cadena.toString();	
	}
	static String mix(String c1,String c2){
		String cad="";
		String cad1=c1;
		String cad2=c2;
		if(cad1.length()>cad2.length()){
			cad=cadenas(cad1,cad2,cad1,cad2);
		}
		else{
			cad=cadenas(cad2,cad1,cad1,cad2);
		}
		return cad;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la primera frase: ");
		String cad1=teclado.nextLine();
		System.out.println("Introduce la segunda frase: ");
		String cad2=teclado.nextLine();
		System.out.println(mix(cad1,cad2));
	}

}
