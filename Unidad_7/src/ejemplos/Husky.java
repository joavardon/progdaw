package ejemplos;

public class Husky extends Perro{
	boolean blanco;
	public void cerrarVentana(){
		System.out.println("Znnnn");
	}
	public void ladrar(){
		super.ladrar();//hace lo que hacia el metodo del padre
		System.out.println("Auuuu!!");//hace otra cosa
	}
}
