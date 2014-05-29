/*Realiza una clase N�mero que almacene un n�mero entero y tenga las siguientes caracter�sticas:

    Constructor por defecto que inicializa a 0 el n�mero interno.
    Constructor que inicializa el n�mero interno.
    M�todo a�ade que permite sumarle un n�mero al valor interno.
    M�todo resta que resta un n�mero al valor interno.
    M�todo getValor. Devuelve el valor interno.
    M�todo getDoble. Devuelve el doble del valor interno.
    M�todo getTriple. Devuelve el triple del valor interno.
    M�todo setNumero. Inicializa de nuevo el valor interno.*/


package clases_paquetes_metodosestaticos;

public class Numero {
	private int numero;
	
	Numero(){
		this.numero=0;
	}
	Numero(int num){
		this.numero=num;
	}
	
	public void a�ade(int num){
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
