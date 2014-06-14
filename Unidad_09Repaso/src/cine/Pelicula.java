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
		String peli1,peli2,peli1ini,peli2ini;
		if(this.nombre.endsWith("3D")){
			peli1ini=this.nombre.substring(0, this.nombre.lastIndexOf("3D",'3'));
			peli1=peli1ini.trim();
		}
		else{
			peli1=this.nombre;}
		if(p.endsWith("3D")){
			peli2ini=p.substring(0, p.lastIndexOf("3D",'3'));
			peli2=peli2ini.trim();
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
	
	
	
}
