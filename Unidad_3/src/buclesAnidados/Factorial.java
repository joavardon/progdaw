/*Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
Hay que validar que el número insertado sea positivo (incluido el 0). 
Si no es así, se volverá a pedir dicho número. Posteriormente, el programa le preguntará 
al usuario si quiere insertar otro número, con un mensaje como este: 
	"¿Quiere insertar otro número [s/n]?". 
Debes validar también esta respuesta.*/
package buclesAnidados;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		String respuesta;
		Scanner teclado = new Scanner(System.in);
		long fact = 1;
		int num;
		do{
			
			
			do{
				
				System.out.println("Introduce un numero positivo: ");
				num=teclado.nextInt();
			}	while (num<0);
			//calcular factorial de nuemro
				fact=1;
				if(num!=0){
					for(int j=1;j<=num;j++){
						fact=fact*j;
					}}
				System.out.println("el factorial es "+fact);
				do{
			
					System.out.println("¿Quieres Introducir otro numero [s/n]: ");
					respuesta=teclado.next();
				}while (!respuesta.equals("s")&&!respuesta.equals("n"));
		}while (respuesta.equals("s"));
						
	}
	
}
