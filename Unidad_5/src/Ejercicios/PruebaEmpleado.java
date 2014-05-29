package Ejercicios;

public class PruebaEmpleado {

	public static void main(String[] args) {
		Empleado emple1,emple2;
		String nombre1="Juan";
		emple1=new Empleado(nombre1,"Cruz");
		emple2=new Empleado("Jose","Zarco");
		
		System.out.println("Empleado 1: "+emple1.getNombre());
		//emple1.getDNI().length();
		System.out.println(emple1.getDNI());
		emple2.setApellido2("García");
		emple2.setSueldoBase(500);
		System.out.println("Su sueldo es: "+emple2.calculaSueldo(5, 6));;
		
	}

}
