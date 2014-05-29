package cadenas;

import java.util.Scanner;
public class Palindromos {

	public static boolean palindromo (String frase){
		int ini,fin;
		
		ini=0; 
		fin=frase.length()-1;
		
		while(ini<fin && frase.charAt(ini)==frase.charAt(fin)) {
	            		ini++;
	            		fin--;
	        	}
		
	    if(ini<fin)      
	          return false;
	    else
	          return true;
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

