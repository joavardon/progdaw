package interfaces;

import java.util.Scanner;

public class Empleado implements Persona {
	String dni;
	String nombre;
	String apellido;
	
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre=teclado.next();
		System.out.println("Apellido: ");
		apellido=teclado.next();
		System.out.println("DNI: ");
		dni=teclado.next();
		
	}

	public void visualizarDatos() {
		System.out.println(dni+" "+nombre+" "+apellido+" "+dato);
		
	}
}
