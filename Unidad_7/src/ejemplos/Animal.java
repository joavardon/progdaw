package ejemplos;

public class Animal extends Object {
	public String nombrecientifico;
	public String nombrecomun;
	public Animal(){
		nombrecientifico="desconocido";
		System.out.println("Se ha creado un animal");
	}
	public void comer(){
		System.out.println("Ñam,Ñam");
	}
	
}
