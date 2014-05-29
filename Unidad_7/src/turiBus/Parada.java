package turiBus;

public class Parada {
	
    private String nombreParada;
    private String horaBajada;
    private String horaSalida;
    private String tipo;
    Parada( String nombreParada,String horaBajada,String horaSalida,String tipo){
    	this.nombreParada=nombreParada;
    	this.horaBajada=horaBajada;
    	this.horaSalida=horaSalida;
    	this.tipo=tipo;
    }
	public String getNombreParada() {
		return nombreParada;
	}
	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}
	public String getHoraBajada() {
		return horaBajada;
	}
	public void setHoraBajada(String horaBajada) {
		this.horaBajada = horaBajada;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return "\nLugar de Parada: "+this.nombreParada+", Hora de Bajada: "+this.horaBajada+", Hora de Regreso: "+this.horaSalida;
	}
}
