package ejercicio4;


public class Incidencias {
	private int id;
	private String descripcion;
	private String[] estado;
	
	
	Incidencias(int i,String m){
		this.id=i;
		this.descripcion=m;
		estado=new String[3];
	}
	public String asignaEstado(int est){
		
		switch (est) {
			case 0:
				this.estado[0]="Abierta";
				break;
				
			case 1:
				this.estado[1]="Asignada";
				break;
				
			case 2:
				this.estado[2]="Cerrada";
				break;
		}
		return this.estado[est];
	}
	public String toString(){
		String cadena="";
		for(int i=0;i<estado.length;i++){
			if(estado[i]!=null){
				cadena=estado[i];
			}
		}
		
		return "Incidencia ("+getId()+") - "+ cadena+"\nDescripcion: "+getDescripcion();
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
