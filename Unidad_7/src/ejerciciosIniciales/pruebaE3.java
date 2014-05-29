package ejerciciosIniciales;

public class pruebaE3 {


	public static void main(String[] args) {
		Cuadrado c=new Cuadrado(5);
		System.out.println(c.areaCuadrado());
		System.out.println(c.perimetroCuadrado());
		c.dibujaCuadrado();
		Rectangulo r=new Rectangulo(5,10);
		System.out.println(r.areaRectangulo());
		System.out.println(r.perimetroRectaqngulo());
		r.horizontalVertical();
		r.dibujaRectangulo();
		

	}

}
