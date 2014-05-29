/*Realiza un programa que encripte una cadena de caracteres 
(solo podemos usar caracteres en min�sculas o n�meros). 
La enciptaci�n consiste en:

    Dada una cadena de caracteres, en la cadena encriptada cada 
    car�cter ser� igual a �l mismo m�s el car�cter que se encuentra 
    a continuaci�n. Si nos encontramos en el �ltimo valor le sumaremos 4.
    Una vez realizada la operaci�n anterior sumaremos 3 a cada 
    car�cter obteniendo finalmente la cadena encriptada definitiva.

Puedes utilizar los m�todos de cadenas toCharArray y el constructor 
String(char[] value) para convertir/crear una cadena a/partiendo de un array de caracteres.
*/
package ejercicios_arrays;

import java.util.Scanner;

public class Ejercicio5 {

	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea la cadena a encriptar: ");
		String cadena=teclado.nextLine();
		
		for(int i=0;i<cadena.length();i++) {
			if (!(Character.isDigit(cadena.charAt(i)) ||
				Character.isLowerCase(cadena.charAt(i))
				|| cadena.charAt(i)==' ')){
				System.out.println("Caracteres no válidos en la entrada");
				System.exit(0);
			}
		}
		
		char[] vector = cadena.toCharArray();
		//System.out.println(vector[0]+vector[1]+3);

		char[] vector2=cadena.toCharArray();//guardo la original
		for(int i=0;i<vector.length-1;i++){
			
			vector[i]+=vector[i+1]+3;}
		
		vector[vector.length-1]+=4+3;
		cadena=new String(vector);
		System.out.println("Cadena encriptada: " + cadena);
		
		for(int j=0;j<vector.length-1;j++){
			vector[j]-=vector2[j+1]+3;}//resto el valor original para el elemento i del bucle + 3
		
			vector[vector.length-1]-=7;//resto siete al ultimo

		String cadena2=new String(vector);
		System.out.println("Cadena revertida: "+cadena2);
		
		
	}


}
