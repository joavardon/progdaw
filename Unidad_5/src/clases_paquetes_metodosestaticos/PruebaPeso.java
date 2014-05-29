package clases_paquetes_metodosestaticos;

public class PruebaPeso {

	
	public static void main(String[] args) {
		Peso peso1=new Peso(10,"K");
		System.out.println(peso1.getLibras()+ " en Libras");
		System.out.println(peso1.getLingotes()+ " en Lingotes");
		System.out.println("Peso en libras: "+peso1.getPeso("Lb"));
		System.out.println("Peso en lingotes: "+peso1.getPeso("Li"));
		System.out.println("Peso en onzas: "+peso1.getPeso("Oz"));
		System.out.println("Peso en peniques: "+peso1.getPeso("P"));
		System.out.println("Peso en kilogramos: "+peso1.getPeso("K"));
		System.out.println("Peso en gramos: "+peso1.getPeso("G"));
		System.out.println("Peso en quilates: "+peso1.getPeso("Q"));

	}

}
