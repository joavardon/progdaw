package ejerciciosIniciales;

public class EmpleadoPorHoras extends Empleado {
	//El empleado por horas tiene un precio por hora y las horas trabajadas
	private int precioHora;
	private int horasTrabajadas;
	public int getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public int calculaSalarioSemanal(){
		int salario=horasTrabajadas*precioHora;
		return salario;
	}
	public String toString() {
		return precioHora+" "+horasTrabajadas+" "+getNombre()+" "+calculaSalarioSemanal();
	}
}
