/*
 * Crear el m�todo est�tico pregunta_continuar() que
muestra la t�pica pregunta ��Desea continuar (s/n)?�. El m�todo
mostrar� el mensaje y controlar� que el usuario introduce una �s�
o �n�. Si el usuario introduce otra cosa lo avisar� y volver�
apreguntar. Finalmente devolver� un car�cter con valor �s� o �n�
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
		System.out.println("�Desea continuar (s/n)?");
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
