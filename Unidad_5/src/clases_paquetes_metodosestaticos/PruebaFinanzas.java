package clases_paquetes_metodosestaticos;

public class PruebaFinanzas {

	
	public static void main(String[] args) {
		Finanzas fin1=new Finanzas();
		fin1.setEuros(5);
		System.out.println(fin1.getEuros());
		fin1.eurosToDolares();
		
	
		Finanzas fin2=new Finanzas(1.5);
		fin2.setDolares(10);
		System.out.println(fin2.getDolares());
		fin2.dolaresToEuros();
		fin2.setEuros(120);
		System.out.println(fin2.getEuros());
		fin2.eurosToDolares();
	}

}
