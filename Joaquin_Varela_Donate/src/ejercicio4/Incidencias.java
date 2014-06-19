package ejercicio4;


public class Incidencias {
	private int id;
	private String descripcion;
	private String[] estado=new String[3];
	
	
	Incidencias(int i,String m){
		this.id=i;
		this.descripcion=m;
		
	}
	
	public void setEstado(String estadoString) {
		if(estadoString.equalsIgnoreCase("Abierta")){
			this.estado[0]="Abierta";
		}
		else if(estadoString.equalsIgnoreCase("Asignada")){
			this.estado[1]="Asignada";
		}
		else if(estadoString.equalsIgnoreCase("Cerrada")){
			this.estado[2]="Cerrada";
		}
	}
	public String getEstado() {
		String estadoActual ="";
		for(int i=0;i<estado.length;i++){
			if(estado[i]!=null){
				estadoActual=this.estado[i];
			}
		}
		return estadoActual;
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
