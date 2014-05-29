package cadenas;

import java.util.Scanner;

public class SumNumCad_3 {
	public static int sumaCadena(String cadena){
		int suma=0;
		String valor="";
		for(int i=0;i<cadena.length();i++){
			boolean esDigito=Character.isDigit(cadena.charAt(i));
			int numeroASumar = 0;
			int primeraPos=i;
			int ultimaPos = i;
			while(Character.isDigit(cadena.charAt(i))){
					ultimaPos++;
					if(i<cadena.length()-1){
					i++;}
					else{
						break;
					}
			}
			
			if(Character.isDigit(cadena.charAt(primeraPos))){
				valor=valor+cadena.substring(primeraPos,ultimaPos);
				numeroASumar = Integer.parseInt (valor); 
				suma=suma+numeroASumar;}
				valor="";
			}
		
		return suma;
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		System.out.println(sumaCadena(cadena));


	}

}


/*
 * public static int sumaCadena(String cadena){
		
		int suma=0;
		String valor="";
		
		for(int i=0;i<cadena.length();i++){
			boolean esDigito=Character.isDigit(cadena.charAt(i));
			int numeroASumar = 0;
			if(esDigito){
				int primeraPos=i;
				int ultimaPos = i;
				while(Character.isDigit(cadena.charAt(i))){
					ultimaPos++;
					if(i<cadena.length()-1){
					i++;}
					else{
						break;
					}
				}
				valor=valor+cadena.substring(primeraPos,ultimaPos);
				numeroASumar = Integer.parseInt (valor); 
				suma=suma+numeroASumar;
			}
			valor="";
		}
		
		return suma;
	}
*/