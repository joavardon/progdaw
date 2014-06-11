package ejercicio4;

public class ProbarMensajeria {

	public static void main(String[] args) {
		Caja micaja=new Caja(10,10,10);
		System.out.println("El volumen de mi caja en litros es: "+micaja.getVolumen());
		System.out.println(micaja.toString());
		
		System.out.println("-------------------------------");
		
		Paquete mipaquete=new Paquete(10,10,10,50.5);
		System.out.println(mipaquete.toString());

	}

}
