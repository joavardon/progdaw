/*Realiza una clase Número que almacene un número entero y tenga las siguientes características:

    Constructor por defecto que inicializa a 0 el número interno.
    Constructor que inicializa el número interno.
    Método añade que permite sumarle un número al valor interno.
    Método resta que resta un número al valor interno.
    Método getValor. Devuelve el valor interno.
    Método getDoble. Devuelve el doble del valor interno.
    Método getTriple. Devuelve el triple del valor interno.
    Método setNumero. Inicializa de nuevo el valor interno.*/


package clases_paquetes_metodosestaticos;

public class Numero {
	private int numero;
	
	Numero(){
		this.numero=0;
	}
	Numero(int num){
		this.numero=num;
	}
	
	public void añade(int num){
		this.numero=numero+num;
	}
	public void resta(int num){
		this.numero=numero-num;
	}
	public int getValor(){
		return this.numero;
	}
	public int getDoble(){
		return this.numero*2;
	}
	public int getTriple(){
		return this.numero*3;
	}
	public void setNumero(int num){
		this.numero=num;
	}
}
