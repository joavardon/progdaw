package cadenas;

import java.util.Scanner;

public class SumaNumCad_2 {
	public static int sumaCad(String cadena){
		int numeroASumar = 0;
		int suma=0;
		String valor="";
		for(int i=0;i<cadena.length();i++){
			if(Character.isDigit(cadena.charAt(i))){	
				for(int j=0;Character.isDigit(cadena.charAt(j));j++){
					valor = valor +cadena.charAt(i) ;
					numeroASumar = Integer.parseInt (valor); 
					i++;
				}
				suma=suma+numeroASumar;
			}
		
		valor="";
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		System.out.println(sumaCad(cadena));

	}

}
