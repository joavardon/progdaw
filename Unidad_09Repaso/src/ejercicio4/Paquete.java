package ejercicio4;

public class Paquete extends Caja implements Postal {
	private double peso;
	private double coste=1.5;
	private boolean enviado=true;
	
	Paquete(double alto, double ancho, double fondo,double peso) {
		super(alto, ancho, fondo);
		this.peso=peso;
	}
	
	

	@Override
	public double costeMinimo(double costeMinimo) {
		return costeMinimo;
	}

	@Override
	public String enviar(String direccion) {
		return direccion;
	}

	@Override
	public String entregado() {
		String paqueteEnviado="";
		if(this.enviado==false){
			paqueteEnviado="No enviado";
		}
		else{
			paqueteEnviado="Enviado";
		}
		return paqueteEnviado;
	}

	@Override
	public double portes() {
		if(costeMinimo(costeMinimo)>this.coste){
			this.coste=costeMinimo(costeMinimo);
		}
		return this.coste;
	}
	
	public String toString(){
		
		return super.toString()+"\n"+"Peso: "+getPeso()+"\n"
				+"Coste: "+portes()+"\n"+"Enviado: "+entregado()+"\n"
				+"Direccion: "+enviar("Avenida Guadarrama 13, 4ºA")+"\n"+"Coste Mínimo: "+costeMinimo(costeMinimo)+"\n";
	}
	
	//accesadores
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getCoste() {
			return coste;
		}
		public void setCoste(double coste) {
			this.coste = coste;
		}
		public boolean isEnviado() {
			return enviado;
		}
		public void setEnviado(boolean enviado) {
			this.enviado = enviado;
		}
	
}
