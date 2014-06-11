package ejercicio4;

public class Caja {
	private double alto;
	private double ancho;
	private double fondo;
	Caja(double alto,double ancho,double fondo){
		this.alto=alto;
		this.ancho=ancho;
		this.fondo=fondo;
	}
	
	public double getVolumen(){
		return (this.ancho*this.alto*this.fondo)/1000;
	}
	public String toString(){
		return "Caja con medidas: \n"+"Alto: "+getAlto()+"\n"
	+"Ancho: "+getAncho()+"\n"+"Fondo: "+getFondo();
	}
	//accesadores
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getFondo() {
		return fondo;
	}
	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	
	
}
