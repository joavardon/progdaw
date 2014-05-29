package ejerciciosIniciales;

public class PruebaE2 {

	
	public static void main(String[] args) {
		Publicacion mipublicacion=new Publicacion();
		mipublicacion.setEditor("Santillana");
		mipublicacion.setFecha("10/12/2013");
		Revista mirevista=new Revista();
		mirevista.setEditor("Anaya");
		mirevista.setFecha("20/10/2012");
		mirevista.setNumero(12);
		Libro milibro=new Libro();
		milibro.setAutor("juan perez");
		milibro.setEditor("SM");
		milibro.setFecha("23/11/2013");
		milibro.setISBN("45456445");
		System.out.println(mipublicacion);
		System.out.println(mirevista);
		System.out.println(milibro);

	}

}
