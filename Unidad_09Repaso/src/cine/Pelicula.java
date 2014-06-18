/*
 * Escribe una peque�a aplicaci�n con tres clases: Pelicula, Sesion y Cine.

La clase Pel�cula tiene los atributos Nombre y Genero de una pel�cula. Tendr� los siguientes m�todos:
 - Un m�todo constructor que recibe el nombre de la pel�cula. Tambi�n el constructor por defecto. 
 - M�todos get y set para manejar los atributos de la clase. - M�todo equal() que permite establecer 
 la igualdad entre dos pel�culas si se llaman igual, independientemente de que una de ellas termine en 3D,
  es decir, por ejemplo la pel�cula �Elysium� y �Elysium 3D� deber� devolverse �Cierto�.

La clase Sesi�n tendr� los atributos Pel�cula (referencia al objeto Pel�cula que se proyecta), 
Hora de comienzo y sala (n�mero) y la Fecha en que comenz� a proyectarse. Tendr� los siguientes m�todos: 
- Un m�todo constructor que recibe el nombre de la pel�cula, la hora y la sala. - M�todos get y set 
para sus atributos. - M�todo toString().

Crea una clase llamada Cine, que contendr� como atributo una lista con las sesiones del cine.

Contendr� el m�todo main, que mostrar� un men� para poder crear una nueva sesi�n, borrar alguna que 
ya est� o ver las sesiones disponibles en el cine.

Contendr� una opci�n que muestre el listado de pel�culas que se est�n proyectando (crea un m�todo que 
realice esta tar�a, utilizando naturalmente el m�todo equals() de la clase Pel�cula).

 */

package cine;

import java.util.Scanner;

public class Pelicula {
	private String nombre;
	private String genero;
	
	Pelicula(String n){
		this.nombre=n;
	}
	Pelicula(){
		
	}
	public boolean iguales(String p){
		String peli1,peli2;
		if(this.nombre.endsWith("3D")){
			peli1=this.nombre.substring(0, this.nombre.lastIndexOf("3D",'3')).trim();
		}
		else{
			peli1=this.nombre;}
		if(p.endsWith("3D")){
			peli2=p.substring(0, p.lastIndexOf("3D",'3')).trim();
		}
		else{
			peli2=p;
		}
		if(peli1.equalsIgnoreCase(peli2)){
			return true;
		}
		
		return false;
		
	}
	
	//Accesadores
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	
	public boolean equals(Object obj) {
		String nombre3D=nombre+" 3D";
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		}else if(!nombre.equals(other.nombre+" 3D")&&!nombre3D.equals(other.nombre)&&!nombre.equals(other.nombre))
			return false;
		
		return true;
	}
	
	
	
	
}
