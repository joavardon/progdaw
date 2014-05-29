import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Ejercicio4 {

	
	public static void main(String[] args) {
		System.out.println("�Dos n�meros?");
		int dividendo=0,divisor=0;

		Scanner teclado=new Scanner (System.in);
		
		try{
		dividendo=teclado.nextInt();
		divisor=teclado.nextInt();
		System.out.println("Resultado: "+(dividendo/divisor));
		}
		catch(ArithmeticException e ){
			System.err.println("Error,divisi�n por cero.");
		}
		catch(InputMismatchException e){
			System.err.println("Error, no es un numero entero");
		}
		
		System.out.println("Adi�s");
		

	}

}
