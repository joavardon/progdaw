package clinicaVeterinaria;

import java.util.Scanner;

public class Gato extends Mamifero{
	Gato(Cliente cliente,int peso, String nombre, String fechaNac, String nombreRaza){
		super(cliente,peso,nombre,fechaNac,nombreRaza);
	}
	public String toString() {
		return getDue�o().getNombreCliente()+" "+getDue�o().getDireccion()+" "+
				getNombre()+" "+getPeso()+" "+getFechaNac()+" "+
				getNombreRaza();
	}
	
}
