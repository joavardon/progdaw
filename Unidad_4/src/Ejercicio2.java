import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio2 {

	
	public static void main(String[] args) {
		System.out.println("¿Dos números?");
		int dividendo=0,divisor=0;

		Scanner teclado=new Scanner (System.in);
		
		try{
		dividendo=teclado.nextInt();
		divisor=teclado.nextInt();
		System.out.println("Resultado: "+(dividendo/divisor));
		}
		catch(ArithmeticException e ){
			System.err.println("Error,división por cero.");
		}
		catch(InputMismatchException e){
			System.err.println("Error, no es un numero entero");
		}
		finally{
			System.out.println("Adiós");
		}

	}

}
