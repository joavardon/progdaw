package ejerciciosIniciales;

/*
 * Crear una interfaz llamada Persona, con los datos y m�todos m�nimos para las clases que la 
 * implementen, que ser�n:

    m�todo: pedirDatos();
    m�todo: visualizarDatos();
    dato: nombre de la empresa a la que pertenecen (con un valor asignado).

Crea dos clases, Cliente y Empleado que implementen la interfaz, a�adiendo 
adem�s los datos que estimes oportunos. Prueba a crear objetos Cliente y Empleado, 
dale valores y visualiza sus datos. Intenta tambi�n cambiar el nombre de la empresa (dato de la interfaz).
 */

public interface Persona {
	
	public void pedirDatos();
	public void visualizarDatos();
	public String nombreEmpresa = "SIEMENS";

}
