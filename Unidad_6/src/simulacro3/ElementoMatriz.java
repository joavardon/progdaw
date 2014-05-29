package simulacro3;

public class ElementoMatriz {

	int fila;
	int columna;
	double valor;
	//constructor
	ElementoMatriz(int fila,int columna,double valor){
		this.fila=fila;
		this.columna=columna;
		this.valor=valor;
	}
	//metodos
	public String toString(){
		return "("+columna+","+fila+","+valor+")";
	}
	//accesadores
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
