/*Implementa una clase Consumo, la cual forma parte de la centralita electrónica de un coche 
 * y tiene las siguientes características:
Atributos:
        kms. Kilómetros recorridos por el coche.
        litros. Litros de combustible consumido.
        vmed. Velocidad media.
        pgas. Precio de la gasolina.
Métodos:
        getTiempo. Indicará el tiempo empleado en realizar el viaje.
        consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
        consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
        setKms
        setLitros
        setVmed
        setPgas
No olvides crear un constructor para la clase que establezca el valor de los atributos. 
Elige el tipo de datos más apropiado para cada atributo.*/

package clases_paquetes_metodosestaticos;

public class Consumo {
	private float kms; //Kilómetros recorridos por el coche.
	private float litros; //Litros de combustible consumido.
	private float vmed; //Velocidad media.
	private float pgas; //Precio de la gasolina.
	
	Consumo(float precio){
		this.kms=kms;
		this.litros=litros;
		this.vmed=vmed;
		this.pgas=precio;
	}
	
	//Métodos

        public float getTiempo(){
        	return kms/vmed;
        }
        public float consumoMedio(){
        	return (100*litros/kms);
        }
        public float consumoEuros(){
        	return (100*(litros/kms))*pgas;
        }

		public void setKms(float kms) {
			this.kms = kms;
		}

		public void setLitros(float litros) {
			this.litros = litros;
		}

		public void setVmed(float vmed) {
			this.vmed = vmed;
		}

		public void setPgas(float pgas) {
			this.pgas = pgas;
		}
       
}
