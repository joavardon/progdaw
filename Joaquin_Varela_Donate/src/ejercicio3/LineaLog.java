package ejercicio3;

import java.util.Date;


public class LineaLog {
	protected int id;
	private String texto;
	private Date fecha=new Date();
	//Constructores
		LineaLog(int i,String t,Date f){
			this.id=i;
			this.texto=t;
			this.fecha=f;
		}
		LineaLog(int i,String t){
			this.id=i;
			this.texto=t;
			fecha=new Date();
		}
		
		LineaLog(String t){
			this.texto=t;
		}
		
		public String toString(){
			return "#"+getId()+" - "+getFecha()+" - "+getTexto();
		}
		
		//accesadores
		public int getId() {
			return id;
		}
		public String getTexto() {
			return texto;
		}
		public Date getFecha() {
			return fecha;
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
			LineaLog other = (LineaLog) obj;
			if (id != other.id)
				return false;
			return true;
		}
	
		
	
	
}
