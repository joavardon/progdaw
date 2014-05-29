/*Ejercicio 7. Escribe un programa que encuentre los números es una cadena y los sume. 
Por ejemplo, si le damos la cadena "en programación 2 más 2 no son siempre 4, 24 de Abril de 2014." 
deverá devolver 2046.*/
package cadenas;

import java.util.Scanner;

public class SumaNumCad {
	public static int suma(String cadena){
		int suma=0;
		String valor="";
		for(int i=0;i<cadena.length();i++){
			//System.out.println(cadena.length());
			int n = 0;
			while(Character.isDigit(cadena.charAt(i))){
				valor = valor +cadena.charAt(i) ;
				n = Integer.parseInt (valor); 
				if(i!=cadena.length()-1){//incrementa siempre que no sea el ultimo valor digito de la cadena; en esa caso se sale del bucle(no debemos incrementar i más)
				i++;}
				else{
					break;
				}
			}
			
			suma=suma+n;
			valor="";
			}
		
		return suma;
		
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		System.out.println(suma(cadena));
	}

}
