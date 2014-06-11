package repaso;

public class Parada implements Coste {
	private String nombre;
	private String horaBajada;
	private String horaSubida;
	
	
	Parada(){
	}

	public Parada(String nombre2, String horaBajada2, String horaSubida2) {
		this.nombre=nombre2;
		this.horaBajada=horaBajada2;
		this.horaSubida=horaSubida2;
		
	}
	
	
	public String toString(){
		return getNombre()+" "+getHoraBajada()+" "+getHoraSubida();
	}

	
	//Accesadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(String horaBajada) {
		this.horaBajada = horaBajada;
	}

	public String getHoraSubida() {
		return horaSubida;
	}

	public void setHoraSubida(String horaSubida) {
		this.horaSubida = horaSubida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parada other = (Parada) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public double coste() {
		return 10;
	}

	
}
