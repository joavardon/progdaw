package repaso;

public class ParadaGuiada extends Parada {
	private String actividad;
	private double precio;
	private String tipo="actividad";
	ParadaGuiada(String nombre,String horaBajada,String horaSubida,String actividad,double precio){
		super(nombre,horaBajada,horaSubida);
		this.actividad=actividad;
		this.precio=precio;
	}
	public String toString(){
		return super.toString()+" "+getActividad()+" "+getPrecio();
		
	}
	
	public double coste() {
		return super.coste()+this.precio;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
