package ejercicio1;
import java.util.Scanner;


public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadena="En un lugar, donde no se podía soñar...";
		System.out.println("Resultado: ");
		System.out.println("\t"+miniMix(cadena));

	}

	private static String miniMix(String cadena) {
		StringBuilder micadena=new StringBuilder ();
		int c=1;
		for(int i=0;i<cadena.length();i++){
			String cadena1="";
			String cadena2="";
			String letra="";
			if(Character.isLetter(cadena.charAt(i))){
				cadena1=""+cadena.charAt(i);
					if(c%2!=0 || c==1){
						letra=cadena1.toUpperCase();
						micadena.append(letra);
						c++;
					}
					else{
						letra=cadena1.toLowerCase();
						micadena.append(letra);
						c++;
					}
				}
			else{
				cadena2=""+cadena.charAt(i);
				micadena.append(cadena2);
			}
		}		
		return micadena.toString();
	}

}
