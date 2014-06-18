/*
 * Escribe una pequeña aplicación con tres clases: Pelicula, Sesion y Cine.

La clase Película tiene los atributos Nombre y Genero de una película. Tendrá los siguientes métodos:
 - Un método constructor que recibe el nombre de la película. También el constructor por defecto. 
 - Métodos get y set para manejar los atributos de la clase. - Método equal() que permite establecer 
 la igualdad entre dos películas si se llaman igual, independientemente de que una de ellas termine en 3D,
  es decir, por ejemplo la película “Elysium” y “Elysium 3D” deberá devolverse “Cierto”.

La clase Sesión tendrá los atributos Película (referencia al objeto Película que se proyecta), 
Hora de comienzo y sala (número) y la Fecha en que comenzó a proyectarse. Tendrá los siguientes métodos: 
- Un método constructor que recibe el nombre de la película, la hora y la sala. - Métodos get y set 
para sus atributos. - Método toString().

Crea una clase llamada Cine, que contendrá como atributo una lista con las sesiones del cine.

Contendrá el método main, que mostrará un menú para poder crear una nueva sesión, borrar alguna que 
ya esté o ver las sesiones disponibles en el cine.

Contendrá una opción que muestre el listado de películas que se están proyectando (crea un método que 
realice esta taréa, utilizando naturalmente el método equals() de la clase Película).

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
