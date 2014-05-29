import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Divide {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner teclado=new Scanner (System.in);
		try{
		dividendo=teclado.nextInt();
		divisor=teclado.nextInt();
		}
		catch(InputMismatchException e){
			System.err.println("Error, no es un numero entero");
			System.exit(0);//terminar el programa
		}
		catch (NoSuchElementException | IllegalStateException e){
			System.err.println("Error, no se puede leer del teclado");
			System.exit(0);
		}
		
		//se suele poner lo más cerca de donde se produce la excepción
		try{
			System.out.println("Resultado: "+(dividendo/divisor));
		}
		//e es el objeto de excepción
		catch(ArithmeticException error ){
			System.err.println("Error,división por cero.");
			System.err.println(error.getMessage());// div(/) by zero
		}
		catch(Exception e){
			System.err.println("Error inesperado");
			System.err.println(e.getMessage());
		}
		finally{
			System.out.println("Mensaje finally2");
		}
		
		System.out.println("Adiós");
		
			
	}

}
