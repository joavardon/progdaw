package ejerciciosIniciales;

import java.util.Scanner;

public class PruebaE4 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		EmpleadoAsalariado e1=new EmpleadoAsalariado();
		e1.setNombre("Juan");
		e1.setOcupacion("Oficial");
		e1.setSalarioSemanal(400);
		System.out.println(e1.calculaSalarioSemanal());
		EmpleadoPorHoras e2=new EmpleadoPorHoras();
		e2.setNombre("pepe");
		e2.setOcupacion("teniente");
		e2.setPrecioHora(10);
		e2.setHorasTrabajadas(100);
		System.out.println(e2.calculaSalarioSemanal());
		//*******************************************
		
		Empleado[]array=new Empleado[3];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Tipod empleado");
			String tipo=teclado.next();
		
			if(tipo.equals("asalariado")){
				array[i]=new EmpleadoAsalariado();
				EmpleadoAsalariado ea=(EmpleadoAsalariado)array[i];
				System.out.println("nombre: ");
				String nombre=teclado.next();
				ea.setSalarioSemanal(300);
				ea.setNombre(nombre);
				ea.setOcupacion("oficial");
				ea.calculaSalarioSemanal();
				
				}
			else if(tipo.equals("porhoras")){
				array[i]=new EmpleadoPorHoras();
				EmpleadoPorHoras eh=(EmpleadoPorHoras)array[i];
				System.out.println("nombre: ");
				String nombre=teclado.next();
				eh.setPrecioHora(10);
				eh.setHorasTrabajadas(20);
				eh.setNombre(nombre);
				int sueldo=eh.calculaSalarioSemanal();
				System.out.println("tu sueldo"+sueldo);
				eh.setOcupacion("oficial");
				}
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].toString());
		}
		//el .toString() es opcional:
		for(int i=0;i<3;i++) System.out.println(array[i]);
		
		//prueba
		Empleado ea = new EmpleadoAsalariado();
		ea.setNombre("juan");
		ea.setOcupacion("oficial");
		EmpleadoAsalariado eas=(EmpleadoAsalariado)ea;
		eas.setSalarioSemanal(100);
		System.out.println(eas.toString());
		System.out.println(ea.calculaSalarioSemanal());//usando metodo desde Empleado
		
	}

}
