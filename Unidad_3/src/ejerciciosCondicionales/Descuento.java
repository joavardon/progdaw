/*Una tienda hace un descuento del 10% por compras menores de 20€, 
un 20% por compras entre 20 y 50€ y un 25% si la compra es mayor. 
Escribe un programa que pida el precio de un producto 
y muestre su precio final en las rebajas.*/
package ejerciciosCondicionales;

import java.util.Scanner;

public class Descuento {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Precio: ");
		
		float precio=teclado.nextFloat();
		if(precio<20){
			precio=precio-precio*10/100;
			System.out.println("El precio final es: "+precio);
		}
		else if (precio>=20 && precio<=50){
			precio=precio-precio*20/100;
			System.out.println("El precio final es: "+precio);
		}
		else if(precio>50){
			precio=precio-precio*25/100;
			System.out.println("El precio final es: "+precio);
		}
	}

}
