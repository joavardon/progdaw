/*
 * Crear el método estático pregunta_continuar() que
muestra la típica pregunta “¿Desea continuar (s/n)?”. El método
mostrará el mensaje y controlará que el usuario introduce una ‘s’
o ‘n’. Si el usuario introduce otra cosa lo avisará y volverá
apreguntar. Finalmente devolverá un carácter con valor ‘s’ o ‘n’
dependiendo de lo que el usuario eligiera
 */
package simulando_simulacro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	static String pregunta_continuar(){
		String r="";
		boolean valor;
		valor=false;
		Scanner teclado=new Scanner(System.in);
		do{
		System.out.println("¿Desea continuar (s/n)?");
		r=teclado.next();
		
			if (r.equals("s")||r.equals("n")){
				valor=true;
				}
			
			else{
			System.out.println("Debes introducir (s/n). Vuelve a intentarlo.");}
		}while(!valor);
		return r;
	}
	
	public static void main(String[] args) {
	
		System.out.println(pregunta_continuar());
	}

}
