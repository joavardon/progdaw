/*Se dice que un n�mero entero es un n�mero perfecto si sus factores, incluyendo 1 (pero no el n�mero entero),
al sumarse dan como resultado el n�mero entero. Por ejemplo, 6 es un n�mero perfecto ya que 6 = 1 + 2 + 3. 
Escriba un m�todo llamado perfecto que determine si el par�metro numero es un n�mero perfecto. 
Use este m�todo en una aplicaci�n que determine y muestre todos los n�meros perfectos entre 1 y 1000. 
Imprima los factores de cada n�mero perfecto para confirmar que el n�mero sea realmente perfecto. 
Ponga a prueba el poder de su computadora, evaluando n�meros m�s grandes que 1000. Muestre los resultados.*/
package metodos;

import java.util.Scanner;


public class Ejercicio_624 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("�Hasta que numero quieres sacar los perfectos?: ");
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
