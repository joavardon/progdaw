package Ejercicios;

public class PruebaProducto {


	public static void main(String[] args) {
		Producto p1=new Producto();
		p1.setPrecio(100);
		p1.setDescuento(10);
		System.out.println("el precio del producto con el descuento de "+p1.getDescuento() +"% aplicado es: " +p1.getPrecioTotal());
		System.out.println(p1.getPrecio());
		System.out.println("el nuevo precio del producto con el descuento de "+p1.getDescuento() +"% aplicado es: "+p1.getPrecioTotal(500));
		System.out.println(p1.getPrecio());
		p1.setPrecioTotal(300);
		System.out.println(p1.getPrecioTotal(300));
	}

}
