package cadenas;

import java.util.Scanner;

public class PalindromosReverse {
	public static boolean palindromo (String frase){
		StringBuilder builder=new StringBuilder(frase);
		String sCadenaInvertida=builder.reverse().toString();
		System.out.println(sCadenaInvertida);
	    if(frase.equals(sCadenaInvertida))      
	          return true;
	    else
	          return false;
	}

	public static void main(String[] args) {
		String frase;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca una frase...");
		frase=teclado.nextLine();
		
		if(palindromo (frase))      
			System.out.println("Es palindromo");    
		else	           		
            System.out.println("No es palindromo");

	}

}
