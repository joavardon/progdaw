package clases_paquetes_metodosestaticos;

public class PruebaCoche {

	
	public static void main(String[] args) {
		Coche coche1=new Coche();
		Coche coche2=new Coche("SEAT","León");
		String marca1=coche1.getMarca();
		String modelo1= coche1.getModelo();
		System.out.println(marca1 +" "+modelo1);
		coche1.setMarca("OPEL");
		coche1.setModelo("Astra");
		marca1=coche1.getMarca();
		modelo1= coche1.getModelo();
		System.out.println(marca1 +" "+modelo1);
		String marca2=coche2.getMarca();
		String modelo2=coche2.getModelo();
		System.out.println(marca2 +" "+modelo2);
	}

}
