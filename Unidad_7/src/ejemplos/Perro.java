package ejemplos;

public class Perro extends Animal{
	public Perro(){
		this.nombrecientifico="canis lupus familiaris";
		System.out.println("Ha nacido un nuevo "+this.nombrecientifico);
	}
	public void ladrar(){
		System.out.println("Guau,guau");
	}
	

}
