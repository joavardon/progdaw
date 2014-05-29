/*Realiza una clase MiNumero que proporcione el doble, triple y cuádruple de 
un número proporcionado en su constructor (realiza un método para doble, 
otro para triple y otro para cuádruple). En este caso haz que la clase 
tenga un método main y comprueba los distintos métodos, 
sin necesidad de crear un método de prueba.*/
package clases_paquetes_metodosestaticos;

public class MiNumero {
	
	private  int numero;
	
	MiNumero(int numero){
		this.numero=numero;
	}
	public  void doble(){
		int doble=numero*2;
		System.out.println(doble);
	}
	public  void triple(){
		int triple=numero*3;
		System.out.println(triple);
	}
	public  void cuadruple(){
		int cuadruple=numero*4;
		System.out.println(cuadruple);
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static void main(String[] args) {
		MiNumero numero1=new MiNumero(5);
	
		numero1.doble();
		numero1.triple();
		numero1.cuadruple();
	}
	}

	