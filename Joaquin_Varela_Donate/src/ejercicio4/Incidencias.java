package ejercicio4;

public class Incidencias {
	private int id;
	private String descripcion;
	private String estado;
	
	Incidencias(int i,String m){
		this.id=i;
		this.descripcion=m;
	}
	
	public String toString(){
		return "Incidencia ("+getId()+") - "+ getEstado()+"\nDescripcion: "+getDescripcion();
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Incidencias other = (Incidencias) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	

	
	
}
