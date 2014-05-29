/*Crea un método que nos diga si un número es capicúa 
(devuelve true en el caso de que lo sea y false si no lo es).*/
package metodos;

import java.util.Scanner;

public class Ejercicio3 {

	public static boolean capicua (float num){
		float numero=num;
		boolean capicua=true;
		String numLetras=Integer.toString((int) numero);
		System.out.println(numLetras);
		int longitud=numLetras.length()-1;
		for(int i=0;i<numLetras.length()-1;i++){
			
			if(numLetras.charAt(i)==numLetras.charAt( longitud)){
				capicua=true;
			}
			else{
				capicua=false;
			}
			longitud--;
		}
		
		return capicua;
		
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int numero=teclado.nextInt();
		boolean comprobarCapicua=capicua(numero);
		if(comprobarCapicua==true){
			System.out.println("Verdadero");
		}
		else{
			System.out.println("Falso");
		}
	}

	
}
