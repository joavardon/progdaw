//Mejorar el ejercicio 1, teniendo en cuenta que los espacios en blanco no cuentan,
//ni las mayúsculas o minúsculas.
package cadenas;

import java.util.Scanner;

public class MejoraPalindromos {
		public static String quitaBlancos(String frase){
		
			StringBuilder builder=new StringBuilder(frase);
			for(int i=0;i<builder.length();i++){
				if(!Character.isLetterOrDigit(builder.charAt(i))){
					builder.deleteCharAt(i);//borra el caracter en la posicion i, en este caso si es ' '
					i--;
					
				}
			}
			return builder.toString();
		}
		public static boolean palindromo (String frase){
			StringBuilder builder=new StringBuilder(frase);
			String sCadenaInvertida=builder.reverse().toString();
			
		    if(frase.equalsIgnoreCase(sCadenaInvertida))      
		          return true;
		    else
		          return false;
		}

		public static void main(String[] args) {
			String frase;
			
			Scanner teclado=new Scanner(System.in);
			
			System.out.println("Introduzca una frase...");
			frase=teclado.nextLine();
			frase=quitaBlancos(frase);
			System.out.println(frase);
			if(palindromo (frase))      
				System.out.println("Es palindromo");    
			else	           		
	            System.out.println("No es palindromo");

		}

	
	

}
