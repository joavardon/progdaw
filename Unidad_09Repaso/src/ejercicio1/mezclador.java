package ejercicio1;

import java.util.Scanner;

/*
 *	Haz un programa que acepte dos cadenas escritas por el usuario. Usando un método, llamado "mix(String a, String b)",
 *  crear crear una cadena con una par de caracteres de la primera, dos de la segunda, dos de la primera, dos de la segunta
 *  y así hasta acabar con la cadena. Cualquier caracter que quede irá al final de la cadena.
 *  
 *  Introduce la primera frase:
 *  Hola
 *  Introduce la segunda frase:
 *  Mundo
 *  HoMulando
 *  
 *  Introduce la primera frase:
 *  Pragración en
 *  Introduce la segunda frase:
 *  Java
 *  PrJaagvaración en
 */
public class mezclador {
	 public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Introduce la primera frase:");
		 String str1 = scanner.nextLine();
		 System.out.println("Introduce la segunda frase:");
		 String str2 = scanner.nextLine();
		 System.out.println(mix(str1,str2));
		}
	 
	 public static String mix(String s1, String s2) {
		 
		 int minLength=s1.length()>s2.length()?s2.length():s1.length();
		 int i=0,fincadena;
		 StringBuilder resultado=new StringBuilder();
		 
		 for(i=0;i<minLength;i+=2) {
			 fincadena=i+2>s1.length()?s1.length():i+2;
			 resultado.append(s1.substring(i, fincadena));
			 fincadena=i+2>s2.length()?s2.length():i+2;
			 resultado.append(s2.substring(i, fincadena));
		 }
		 
		 if (s1.length()>i) resultado.append(s1.substring(i));
		 if (s2.length()>i) resultado.append(s2.substring(i));
		 
		 return resultado.toString();
	 }
}

