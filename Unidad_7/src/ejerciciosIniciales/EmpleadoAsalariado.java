package ejerciciosIniciales;

public class EmpleadoAsalariado extends Empleado{
	private int salarioSemanal;

	public int getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(int salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	public int calculaSalarioSemanal(){
		return this.salarioSemanal;
	}
	public String toString() {
		return getNombre()+" "+calculaSalarioSemanal();
	}
}
