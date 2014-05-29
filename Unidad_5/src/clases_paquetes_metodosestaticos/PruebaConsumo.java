package clases_paquetes_metodosestaticos;

public class PruebaConsumo {

	public static void main(String[] args) {
		Consumo viaje=new Consumo((float) 1.5);
		viaje.setKms(1000);
		viaje.setLitros(50);
		//viaje.setPgas((float) 1.50);
		viaje.setVmed(100);
		System.out.println("El tiempo empleado en horas es : "+viaje.getTiempo());
		System.out.println("El consumo en euros a los 100 km. es: "+viaje.consumoEuros());
		System.out.println("El consumo en litros de gasolina a los 100 kn. es: "+ viaje.consumoMedio());
		

	}

}
