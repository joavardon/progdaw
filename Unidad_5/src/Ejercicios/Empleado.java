package Ejercicios;

public class Empleado {

	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String DNI;
	private float SueldoBase;
	
	Empleado(){
		//DNI="";
	}
	
	Empleado(String Nombre,String Apellido1){
		this.Nombre=Nombre;
		this.Apellido1=Apellido1;
		//DNI="";
	}
	public float calculaSueldo(float horasExtra, float precioHora){
		float sueldo;
		return sueldo = SueldoBase+horasExtra*precioHora;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	public String getDNI() {
		return (DNI==null) ? "":DNI;//si se cumple"", sino DNI
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public float getSueldoBase() {
		return SueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		SueldoBase = sueldoBase;
	}
}
