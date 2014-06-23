package ejercicio1;
import java.util.Scanner;


public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		System.out.println("Resultado: ");
		System.out.println("\t"+miniMix(cadena));

	}

	private static String miniMix(String cadena) {
		StringBuilder micadena=new StringBuilder ();
		int c=1;
		char caracter;
		for(int i=0;i<cadena.length();i++){
			if(Character.isLetter(cadena.charAt(i))){
					if(c%2!=0){
						caracter=Character.toUpperCase(cadena.charAt(i));
						micadena.append(caracter);
						c++;
					}
					else{
						caracter=Character.toLowerCase(cadena.charAt(i));
						micadena.append(caracter);
						c++;
					}
				}
			else{
				caracter=cadena.charAt(i);
				micadena.append(caracter);
			}
		}		
		return micadena.toString();
	}

}
