package clases_paquetes_metodosestaticos;

public class PruebaNumero {


	public static void main(String[] args) {
		Numero num=new Numero(5);
		num.añade(7);
		System.out.println(num.getValor());
		num.resta(7);
		System.out.println(num.getValor());

		System.out.println(num.getDoble());
		System.out.println(num.getTriple());
		num.setNumero(1000);
		System.out.println(num.getValor());
	}

}
