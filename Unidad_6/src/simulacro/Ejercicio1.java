package simulacro;
import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado;
	public static String leerClave() throws ClaveErronea {
		
		String clave="";
		
		try {
			clave = teclado.next();
			if (clave.length()<6)
				
				throw new ClaveErronea();
			
		}catch (NullPointerException e) {
			System.out.println("Error, Scanner no iniciado.");
			throw e;
		}
		return clave;
	}
	public static void main(String[] args) {
		boolean continuar;
		teclado=new Scanner(System.in);
		try{
			
			do{	
			continuar=true;
			String clave="";
					try{
					System.out.println("Elige clave: ");
					clave=leerClave();
					System.out.println("La clave es: "+clave);
					}catch (ClaveErronea e) {
						System.out.println("Clave no segura");
						continuar=false;}
					}
			while (!continuar);
		} catch (NullPointerException e) {
			System.out.println("No se pudo terminar el programa correctamente.");
		}
	}

}
