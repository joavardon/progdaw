package repaso;

import java.util.ArrayList;

public class Expediente {

	String nombre;
	ArrayList<Modulo>modulos=new ArrayList<Modulo>();
	
	Expediente(){
		
	}
	Expediente(String nombre, ArrayList<Modulo> modulos){
		this.nombre=nombre;
		this.modulos=modulos;
	}

	public void añadeModulo(Modulo m){
		this.modulos.add(m);
	}

	public String toString(){
		
		String cadena;
		
		cadena="\nLas notas del alumno "+this.nombre+" son: ";
		for(int i=0;i<modulos.size();i++){
			cadena=cadena+"\n"+modulos.get(i).toString();
		}
		
		return cadena;
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(ArrayList<Modulo> modulos) {
		this.modulos = modulos;
	}

}
