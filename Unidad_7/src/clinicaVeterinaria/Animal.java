/*
 * Realizar una jerarquía de clases necesaria para implementar la base de datos de una 
 * clínica veterinaria (solo la parte de animales). Las clases de animales deben ser: 
 * Animal, Mamífero, Perro, Gato, Reptil y Pez. De todas las mascotas se necesita saber
 * su peso, nombre, fecha de nacimiento, asi como los datos del cliente (Nombre y Dirección)
 *  Tanto perros como gatos tienen un nombre de raza ('Persa','American Stanford', etc.). 
 *Los perros tienen además un número identificador, que va en el chip, además del atributo 
 *peligroso que almacenará si el perro es una raza catalogada como peligrosa o no. 
 *A los reptiles debemos además añadir como atributo una lista (array) con los nombres de 
 *los animales que come, por ejemplo {'insectos','ratón','pequeños reptiles'). Por su parte, 
 *los peces se guarda su número 
 *(en realidad la clase guardará los elementos) y si son tropicales o de agua fría.
 */
package clinicaVeterinaria;

import java.util.Scanner;

public class Animal {
	private int peso;
	private String nombre;
	private String fechaNac;
	private Cliente dueño;
	
	Animal(Cliente d, int p,String n,String f){
		this.dueño=d;
		this.peso=p;
		this.nombre=n;
		this.fechaNac=f;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Cliente getDueño() {
		return dueño;
	}
	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}
	public String toString() {
		return dueño.getNombreCliente()+" "+dueño.getNombreCliente()+" "+getNombre()+" "+getFechaNac()+" "+getPeso();
	}
	
	
}
