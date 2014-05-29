/*Realiza un programa que pida al usuario la introducción de un carácter 
 * hasta que este pulse el carácter @. El programa debe mostrar las veces 
 * que se ha escrito cada carácter. Recordad que los caracteres tienen asociado 
 * un número (código) que comienza por cero. 
 
 Ten en cuenta que se pueden hacer cosas como esta:

int c;
String qp="qp";
c=qp.charAt(0);
System.out.println(c);

Este programa imprimiría "113", el código de q. Si quisiera imprimir un número también 
puedo hacerlo así:

System.out.println((char)65);

Utiliza arrays para hacer el ejercicio.*/
package ejercicios_arrays;

import java.util.Scanner;

public class Ejercicio4 {
	
	public void introducir(int[]arrayletras){
		Scanner teclado=new Scanner(System.in);
		int c;
		String arrobastring="@";
		int arroba=arrobastring.charAt(0);
		String caracteres="";
		int cont=0;
		boolean seguir=true;
		
		do{
			System.out.println("Introduce un caracter: ");
			caracteres=teclado.nextLine();
			c=caracteres.charAt(0);
			if(c==arroba){
				break;
			}
			arrayletras[cont]=c;
			cont++;}
		while(seguir);
	}

	public void repeticiones(Ejercicio4 a,int[]arrayletras){
		a.introducir(arrayletras);
		int[]usados=new int[10];
		int rep;
		
		for(int i=0;arrayletras[i]!=0;i++){
			rep=0;
			salir:
			for(int j=0;arrayletras[j]!=0;j++){
				
				if(arrayletras[i]==usados[j]){
					 break salir;}
				else if(arrayletras[i]==arrayletras[j]){
					rep++;}
				}
				
				if(rep>0){
					System.out.println("de la letra "+(char)(arrayletras[i])+" hay "+rep+" repeticiones");
					usados[i]=arrayletras[i];
				}
				
			}

		}
	
	
	
	public static void main(String[] args) {
		Ejercicio4 array=new Ejercicio4();
		int[]arrayletras=new int[10];
		array.repeticiones(array,arrayletras);
	}
	

}
