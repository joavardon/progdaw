/*4. Escribe un programa que codifique usando cifrado C�sar. Haz una primera versi�n en 
que cada letra se sustituya por el caracter siguiente. Por ejemplo �Hola" pasa a ser "Ipmb". " +
"Haz una segunda versi�n en que se pida un n�mero por teclado y la codificaci�n se haga " +
"incrementando cada car�cter por esa cantidad, " +
"por ejemplo si introducimos 3, "Hola" pasa a ser "Kr�d".*/
package cadenas;

import java.util.Scanner;

public class CifradoCesar {

	public static String cifradoPrimeraVersion(String frase){
		char[]car=new char[frase.length()];
		String f="";;
		for(int i=0;i<car.length;i++){
			car[i]=frase.charAt(i);
			String caracter=car[i]+"";
			int codigo =(caracter.codePointAt(0))+1;
			//System.out.println(codigo);
			car[i]=(char)codigo;
		}
		for(int i=0;i<car.length;i++){
			f=f+car[i];
		}
		return f;
		
	}
	public static String cifradoSegundaVersion(String frase,int num){
		char[]car=new char[frase.length()];
		String f="";;
		for(int i=0;i<car.length;i++){
			car[i]=frase.charAt(i);
			String caracter=car[i]+"";
			int codigo =(caracter.codePointAt(0))+num;
			//System.out.println(codigo);
			car[i]=(char)codigo;
		}
		for(int i=0;i<car.length;i++){
			f=f+car[i];
		}
		return f;
		
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra a cifrar: ");
		String palabra=teclado.next();
		System.out.println(cifradoPrimeraVersion(palabra));
		System.out.println("Introduce un numero: ");
		int numero=teclado.nextInt();
		System.out.println(cifradoSegundaVersion(palabra,numero));
	}

}
