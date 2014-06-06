package repaso;

public class PruebaFutbol {

	
	public static void main(String[] args) {
		
		Futbol mifutbol=new Futbol();
		mifutbol.marcarGol(0);
		mifutbol.marcarGol(1);
		mifutbol.marcarGol(1);
		mifutbol.marcarGol(1);
		mifutbol.marcarGol(0);
		
		System.out.println(mifutbol.toString());

	}

}
