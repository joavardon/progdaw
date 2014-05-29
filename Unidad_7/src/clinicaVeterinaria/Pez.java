package clinicaVeterinaria;

import java.util.Scanner;

public class Pez extends Animal {
	private int numero;
	private boolean clima;

	Pez(Cliente cliente,int peso, String nombre, String fechaNac, int numero,boolean clima){
		super(cliente,peso,nombre,fechaNac);
		this.numero=numero;
		this.clima=clima;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean getClima() {
		return clima;
	}
	public void setClima(boolean clima) {
		this.clima = clima;
	}
	public String toString() {
		return getDueño().getNombreCliente()+" "+getDueño().getDireccion()+" "+
				getNombre()+" "+getPeso()+" "+getFechaNac()+" "+
				getClima()+" "+getNumero();
	}
	
}
