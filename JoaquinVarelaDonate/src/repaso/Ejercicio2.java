/* Escribir un método llamado precioFinal que dado un precio y una cantidad devuelva 
 * el precio final resultado de aplicar el descuento del 2% si la cantidad es mayor que
 *  6 y 4% si es mayor que 12. Si al método se le pasan como parámetros números no válidos, 
 *  devolverá la excepción IllegalArgumentException.
 *Escribir también el código que pruebe que funciona correctamente y también que devuelve 
	la excepción si los valores pasados no son correctos.*/

package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double precio=0;
		int cantidad=0;
	
		try {
			System.out.print("Dame el precio: ");
			precio=teclado.nextDouble();
			System.out.print("Dame la cantidad: ");
			cantidad=teclado.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Debes introducir precios y cantidades numÃ©ricos");
			System.exit(0);
		}
		
		try {
			System.out.println("El precio final es: " + 
					precioFinal(precio,cantidad));
		}catch(IllegalArgumentException e) {
			System.out.println("Se ha utilizado un precio o cantidad no valido");
		}
	}
	public static double precioFinal(double precio, double c){
		double preciof = 0;
	
			if (c<=0 || precio<=0)
				throw new IllegalArgumentException();
			else if(c>6 && c<12){
				preciof=precio-((precio*2)/100);
			}
			else if(c>12){
				preciof=precio-((precio*4)/100);
			}
		
		return preciof=preciof*c;
	}

}
