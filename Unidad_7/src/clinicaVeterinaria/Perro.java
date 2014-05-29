package clinicaVeterinaria;

import java.util.Scanner;

public class Perro extends Mamifero {
	private int id;
	private boolean peligroso;
	
	public Perro(Cliente cliente,int peso, String nombre, String fechaNac, String nombreRaza,int id,boolean peligroso){
		super(cliente,peso,nombre,fechaNac,nombreRaza);
		this.id=id;
		this.peligroso=peligroso;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	
	public String toString() {
		return getDueño().getNombreCliente()+" "+getDueño().getDireccion()+" "+
	getNombre()+" "+getPeso()+" "+getFechaNac()+" "+
	getNombreRaza()+" "+getId()+" "+getPeligroso();
	}
	
}
