package actividad4;

public class PruebaFechaYHora {

	
	public static void main(String[] args) {
	Fecha mifecha=new Fecha(2,28,2015);
	Hora mihora=new Hora(22,45,56);
	FechaYHora fyh=new FechaYHora(mifecha,mihora);
	System.out.println(fyh);
	Hora mihora2=new Hora(2,0,0);
	fyh.siguienteHora(mihora,mihora2);
	System.out.println("siguiente hora"+fyh);

	}

}
