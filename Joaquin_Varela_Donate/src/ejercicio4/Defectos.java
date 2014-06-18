package ejercicio4;

import java.util.ArrayList;

public class Defectos extends Incidencias   {
	private String version;
	private ArrayList<String>archivos=new ArrayList<String>();
	
	Defectos(int i, String m,String v) {
		super(i, m);
		this.version=v;
	}
	
	public String toString(){
		String cadena="";
		for(int i=0;i<archivos.size();i++){
			cadena=cadena+archivos.get(i)+" ";
		}
		return super.toString()+"\nTipo: "+getClass().getSimpleName()+"\nVersion:"+getVersion()+"\nArchivos: "+cadena;
		
	}
	
	public void addArchivoAfectado(String nombre){
		archivos.add(nombre);
	}
	public void delArchivoAfectado(String nombre){
		if(archivos.contains(nombre)){
			archivos.remove(nombre);}
		
	}

	//Accesadores
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ArrayList<String> getArchivos() {
		return archivos;
	}
	public void setArchivos(ArrayList<String> archivos) {
		this.archivos = archivos;
	}
	
}
