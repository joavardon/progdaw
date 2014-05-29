/*4. Escribe un programa que codifique usando cifrado César. Haz una primera versión en 
que cada letra se sustituya por el caracter siguiente. Por ejemplo “Hola" pasa a ser "Ipmb". " +
"Haz una segunda versión en que se pida un número por teclado y la codificación se haga " +
"incrementando cada carácter por esa cantidad, " +
"por ejemplo si introducimos 3, "Hola" pasa a ser "Krñd".*/
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
