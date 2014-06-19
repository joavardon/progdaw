package ejercicio4;

import java.util.Date;

public class Mejoras extends Incidencias {
	private double porcentaje=0.0;
	private Date fecha;
	Mejoras(int i, String m,Date d) {
		super(i, m);
		this.fecha=d;
	}
	public String toString(){
		return super.toString()+"\nMejoras: "+getClass().getSimpleName()+"\nFecha:  "+getFecha()+"\nRealizada: "+getPorcentaje()+" %";
		
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
