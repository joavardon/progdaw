package ejercicio3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LineaLog {
	private String id="#1";
	private String texto;
	Date d=new Date();
	private String fecha=d.toString();
	//Constructores
		LineaLog(String i,String t,String f){
			this.id=i;
			this.texto=t;
			this.fecha=f;
		}
		LineaLog(String i,String t){
			this.id=i;
			this.texto=t;
		}
		
		LineaLog(String t){
			this.texto=t;
			id="#1";
			
		}
		
		public String toString(){
			return getId()+" - "+getFecha()+" - "+getTexto();
		}
		
		//accesadores
		public String getId() {
			return id;
		}
		public String getTexto() {
			return texto;
		}
		public String getFecha() {
			return fecha;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
	
	
}
