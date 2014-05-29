package simulacro;

public class ElementoMatriz {

	int fila;
	int columna;
	double contenido;
	//constructor
	ElementoMatriz(int fila,int columna,double contenido){
		this.fila=fila;
		this.columna=columna;
		this.contenido=contenido;
	}
	//metodos
	public String toString(){
		/*String cadena="";
		cadena=columna+" "+fila+" "+contenido;
		return cadena;*/
		return "("+columna+","+fila+","+contenido+")";
	}
	//accesadores
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
	
	public double getContenido() {
		return contenido;
	}
	
	
}
