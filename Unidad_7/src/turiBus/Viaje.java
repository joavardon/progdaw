/*
 * Una empresa de autobuses organiza viajes turísticos, cada viaje tiene una serie de paradas 
 * en ciudades o lugares importantes. Debes hacer la clases:

    Viaje, que contiene la información de cada viaje:
        Almacena el código del viaje, su nombre, la hora de salida y la hora de regreso.
        Una lista con las paradas que se van a realizar (Lista de objetos Parada).
    Parada, que almacena los tipos de parada:
        Almacena el nombre de la ciudad o lugar, hora de bajada y hora de salida.
        Las paradas son libres o guiádas, en el caso de que se deje a los viajeros visitar 
        libremente el lugar o se les dirija mediante una actividad (visita guiada, ruta, 
        actuación, etc.). Para solucionar esto debe utilizarse la herencia y crear estas 
        dos subclases de Parada:
        ParadaLibre: no contiene ningún dato extra.
        ParadaActividad: contienen el nombre de la actividad a realizar y su precio, que 
        puede ser cero.

Tareas a realizar:

    Crear la clase Parada y sus dos subclases. Al menos deben incluir los atributos, constructores
     y métodos get/set básicos y el método toString() para poder mostrar su contenido.
    La clase Viaje. Al menos deben incluir los atributos, constructores y métodos get/set básicos.
    Un método toString() en la clase Viaje que imprime una ficha con los datos generales del viaje 
    y un listado de sus paradas.
    Un método añadirParada(Parada p) y otro método quitarParada(Parada p), añade o quita la parada 
    correspondiente del viaje. Tener en cuenta que una parada es igual a otra simplemente si el 
    nombre de la parada es el mismo.
    Un método coste() en la clase Viaje que calcula el precio mínimo del viaje, que incluye:
        50€ por cada hora del viaje.
        10€ por cada parada.
        El precio de las actividades en el caso de una ParadaActividad.

 */

package turiBus;

import java.util.Arrays;

public class Viaje {
	 private int codigoViaje;
	 private String nombre; 
	 private String horaDeSalida; 
	 private String horaDeRegreso;
	 private Parada[]paradas;
	 private int numParadas=0;
	 
	 Viaje(int codigoViaje, String nombre, String horaDeSalida, String horaDeRegreso,Parada []p){
	 	this.codigoViaje=codigoViaje;
	 	this.nombre=nombre;
	 	this.horaDeSalida=horaDeSalida;
	 	this.horaDeRegreso=horaDeRegreso;
	 	this.paradas=p;
	 	this.numParadas=p.length;
	 	}
	 
	 public void añadirParada(Parada p){
		 this.numParadas=this.numParadas+1;
		 Parada[]par=Arrays.copyOf(this.paradas,this.numParadas);
		 par[this.numParadas-1]=p;
		 this.paradas=par;
	 }
	 
	 public void eliminarParada(Parada p){
		 for(int i=0;i<this.numParadas;i++){
			 if(this.paradas[i].getNombreParada().equals(p.getNombreParada())){
					this.paradas[i]=this.paradas[this.numParadas-1];
					this.numParadas--;
					this.paradas[this.numParadas]=null;
			 }
		 }
	 }
	 
	 public void coste(){
		 double coste=0;
		 double costeTiempo=0;
		 for(int i=0;i<this.numParadas;i++){
			 if(this.paradas[i].getTipo().equalsIgnoreCase("guiada")){
				 coste=coste+((ParadaGuiada) this.paradas[i]).getPrecio();
			 }
		 }
			 double tiempoHoras=restarHoras(horaDeSalida,horaDeRegreso);
			 costeTiempo=tiempoHoras*50;
			 coste=coste+(this.numParadas*10)+costeTiempo;
			 System.out.printf("El coste total del viaje es: %.2f \n",coste);
	 }
	 
	 public static double restarHoras(String hourS,String hourR){
		 double horas = 0;
		double minutos = 0;
		 String horasS=hourS.substring(0,2);
		 String minutosS=hourS.substring(3,5);
		 String horasR=hourR.substring(0,2);
		 String minutosR=hourR.substring(3,5);
		 double hS=Double.parseDouble(horasS);
		 double hR=Double.parseDouble(horasR);
		 double mS=Double.parseDouble(minutosS);
		 double mR=Double.parseDouble(minutosR);
		 if(hS<hR){
			 horas=(hR-hS);}
		else{
			horas=(24+(hR-hS));	
			 }
		 if(mS<mR){
			 minutos=(mR-mS);
		 }
		 else{
			 minutos=(60+(mR-mS));
			 horas--;
		 }
		minutos=minutos/60;
		double tiempoHoras=horas+minutos;
		System.out.printf("Duracion del viaje pasada a horas: %.2f \n",tiempoHoras);
		 return tiempoHoras;
	 }
	public int getCodigoViaje() {
		return codigoViaje;
	}

	public void setCodigoViaje(int codigoViaje) {
		this.codigoViaje = codigoViaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraDeSalida() {
		return horaDeSalida;
	}

	public void setHoraDeSalida(String horaDeSalida) {
		this.horaDeSalida = horaDeSalida;
	}

	public String getHoraDeRegreso() {
		return horaDeRegreso;
	}

	public void setHoraDeRegreso(String horaDeRegreso) {
		this.horaDeRegreso = horaDeRegreso;
	}

	public Parada[] getParadas() {
		return paradas;
	}

	public void setParadas(Parada[] paradas) {
		this.paradas = paradas;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}
	
	public String toString(){
		
		String cadena;
		cadena="Viaje: "+this.codigoViaje+", Nombre: "+this.nombre+", Hora de Salida: "+this.horaDeSalida+", Hora de Llegada: "+this.horaDeRegreso;
		for(int i=0;i<this.numParadas;i++){
			cadena=cadena+"\n"+this.paradas[i].toString();
		}
		return cadena;
	}
}
