/*Crea la clase FechaYHora. La clase utiliza la clase Hora definida en el ejercicio 1,
y la clase Fecha del ejercicio anterior, ya que queremos que almacene tanto la fecha como la hora. 
Crea un nuevo método siguienteHora que incrementa la hora pero que también llame al métodosiguienteDía 
si es necesario porque se avanza un día. Crea el método aCadena (toString()) que muestre la fecha y 
la hora de forma conjunta. Escribe un programa que pruebe la nueva clase,
especialmente el incremento de de hora que cambia el día.*/

package actividad4;

public class FechaYHora {
	private Hora horas;
	private Fecha fechas;
	
	
	FechaYHora(Fecha f,Hora h){
		this.horas=h;
		this.fechas=f;
	}
	
	public Hora siguienteHora(Hora h1,Hora h2){
		int hora=h1.getHora()+h2.getHora();
		int min=h1.getMin()+h2.getMin();
		int seg=h1.getSeg()+h2.getSeg();
		
		
		if(seg>59){
			seg=seg-60;
			min++;
		}
		if(min>59){
			min=min-60;
			hora++;
		}
		
		while(hora>23){
			hora=hora-24;
				if(hora==24)
					{hora=0;
				}
			//mientras sea mayor de 23 aplico fechas.siguienteDia, las veces necesarias y cada vuelta suma un dia	
			fechas.siguienteDia(fechas.getDia(),fechas.getMes(),fechas.getAnio());
		}
		horas=new Hora(hora,min,seg);
		return horas;
		}
		
	public String toString(){
		return "\n"+ horas.aCadena()+" "+fechas.toString() ;
	}
	

}
