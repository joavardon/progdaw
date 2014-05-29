package clinicaVeterinaria;

import java.util.Scanner;

public class Gato extends Mamifero{
	Gato(Cliente cliente,int peso, String nombre, String fechaNac, String nombreRaza){
		super(cliente,peso,nombre,fechaNac,nombreRaza);
	}
	public String toString() {
		return getDueño().getNombreCliente()+" "+getDueño().getDireccion()+" "+
				getNombre()+" "+getPeso()+" "+getFechaNac()+" "+
				getNombreRaza();
	}
	
}
