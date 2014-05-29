package ejerciciosIniciales;

import java.util.Scanner;

public class Empleado implements Persona{

	private String nombre;

	@Override
	public void pedirDatos() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Solicitando datos de EMPLEADO... ");
		System.out.print("Introduzca nombre: ");
		this.nombre = teclado.nextLine();			
	}

	@Override
	public void visualizarDatos() {
		System.out.println("===== DATOS DEL EMPLEADO =====");
		System.out.printf("Nombre: %s\nEmpresa: %s\n",
				           this.nombre, nombreEmpresa);
		
	}

}
