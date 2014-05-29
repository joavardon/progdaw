package Ejercicios;

public class PruebaCoche {

	public static void main(String[] args) {
		Coche coche1=new Coche();
		coche1.acelera(60);
		System.out.println("La velocidad ahora es :"+coche1.getVelocidad());
		coche1.acelera(40);
		System.out.println("La velocidad ahora es :"+coche1.getVelocidad());
		coche1.desacelera(40);
		System.out.println("La velocidad ahora es :"+coche1.getVelocidad());
	}

}
