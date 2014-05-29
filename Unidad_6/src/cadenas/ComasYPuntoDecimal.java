/*Ejercicio 6. Escribe un métodos que reciva un numero double y devuelva a una 
cadena con comas y punto decimal.
Por ejemplo, pasándole 1235689,45 dará "1.235.689,45".*/
package cadenas;

import java.util.Scanner;

public class ComasYPuntoDecimal {
	public static String comasYPunto(double d){
		String cadena=String.valueOf(d);
		int pos=cadena.indexOf('.');
		String parteDecimal=cadena.substring(pos+1,cadena.length());
		String parteEntera=cadena.substring(0, pos);
		StringBuilder builder=new StringBuilder(parteEntera);
		int l=parteEntera.length();
		int c=0;
		for(int i=l-1;i>0;i--){
			c++;
			if(c%3==0){
				builder.insert(i, '.');
			}
		}
		parteEntera=builder.toString();
		parteEntera=parteEntera.concat(",");
		return parteEntera.concat(parteDecimal);
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un double: ");
		double numero=teclado.nextDouble();
		System.out.println(comasYPunto(numero));
	}

}
