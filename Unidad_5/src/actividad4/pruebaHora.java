package actividad4;

public class pruebaHora {

	public static void main(String[] args) {
		Hora mihora=new Hora(12,00,00);
		Hora unahoraycuarto=new Hora(72,15,00);
		//mihora.sumaHora(unahoraycuarto);
		//System.out.println(mihora.aCadena());
		Hora sininicializar=new Hora();
		sininicializar.sumaHora(mihora);
		System.out.println(sininicializar.aCadena());
		sininicializar.sumaHora(unahoraycuarto);
		System.out.println(sininicializar.aCadena());
		sininicializar.tick();
		System.out.println(sininicializar.aCadena());
		sininicializar.incrementarMinuto();
		System.out.println(sininicializar.aCadena());
		sininicializar.incrementarHora();
		System.out.println(sininicializar.aCadena());
	}

}
