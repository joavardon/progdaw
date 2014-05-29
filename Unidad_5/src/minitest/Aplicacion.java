package minitest;
class Cerebro{
	Cerebro(){
		System.out.println("Pensando...");
	}
}
class Persona{
	private String nombre;
	private Cerebro cerebro;
	Persona(){
	
		//System.out.println( "Constructor ejecutandose!!");
	}
	Persona(String nombre){
		this.nombre=nombre;
		//System.out.println( this.nombre);
		this.cerebro=new Cerebro();
	}
	void escribeNombre(){
		System.out.println("Mi nombre es " +this.nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
public class Aplicacion {
	
	
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Persona persona=new Persona();
		Persona persona1=new Persona("Joaquin");
		//persona1.escribeNombre();
		String nombre = persona1.getNombre();
		nombre = nombre + " García";
		persona1.setNombre(nombre);
		persona1.escribeNombre();
	}

}
