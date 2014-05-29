package simulacro;
import java.util.Scanner;

public class Ejercicio1_2 {
	static Scanner teclado=new Scanner(System.in);
	public static String leerClave() throws ClaveErronea {
		
		String clave;
		clave = teclado.next();
			if (clave.length()<6)
				throw new ClaveErronea();
		return clave;
	}
	public static void main(String[] args) {
		boolean continuar;
		int fallidos = 0;
			do{	
			continuar=true;
			
					try{
					System.out.println("Elige clave: ");
					String clave=leerClave();
					System.out.println("La clave segura es : "+clave);
					}catch (ClaveErronea e) {
						System.out.println("Clave no segura. Es demasiado corta. Esfuérzate más, no seas vago");
						fallidos++;
						if(fallidos==3){
							System.out.println("****No quedan mas intentos****");
						}
						continuar=false;}
					}
			while (!continuar && fallidos<3);
		
	}

}
