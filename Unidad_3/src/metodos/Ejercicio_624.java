/*Se dice que un número entero es un número perfecto si sus factores, incluyendo 1 (pero no el número entero),
al sumarse dan como resultado el número entero. Por ejemplo, 6 es un número perfecto ya que 6 = 1 + 2 + 3. 
Escriba un método llamado perfecto que determine si el parámetro numero es un número perfecto. 
Use este método en una aplicación que determine y muestre todos los números perfectos entre 1 y 1000. 
Imprima los factores de cada número perfecto para confirmar que el número sea realmente perfecto. 
Ponga a prueba el poder de su computadora, evaluando números más grandes que 1000. Muestre los resultados.*/
package metodos;

import java.util.Scanner;


public class Ejercicio_624 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Hasta que numero quieres sacar los perfectos?: ");
		int num=teclado.nextInt();
		imprime(num);
	}
	public static void imprime(int numero){
		for (int i=1;i<=numero;i++){
			perfecto(i);
			if (perfecto(i)==true){
				System.out.print(i+ " ");
			}
		}
	}
	public static boolean perfecto(int numero){
		boolean perfecto=false;
		int total=0;
		for (int i=numero-1;i>0;i--){
            if(numero%i==0){
                    total=total+i;
            }
		}
		if (total==numero){
			perfecto=true;
		}
		return perfecto;
	}
	
}
