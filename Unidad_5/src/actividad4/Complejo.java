/*Cree una clase llamada Complejo para realizar operaciones aritméticas con números complejos. 
Estos números tienen la forma:

parteReal + parteImaginaria * i

donde i representa la raiz de -1.

Escribe un programa para probar tu clase. Usa variables reales para almacenar los datos privados de la clase.
Crea un constructor por defecto que inicialice el número a (0,0) y otro que permita inicializar los dos 
valores al crearlo.

Crea métodos públicos para realizar las siguientes operaciones:

Suma: (a,b)+(c,d)=(a+c,b+d)
Resta: (a,b)-(c,d)=(a-c,b-d)
Producto: (a,b)*(c,d)=(ac-bd,ad-bc)
Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))

Crea un método para imprimir un número complejo de la forma (a,b), donde a es la parte real y b es la parte
imaginaria.*/

package actividad4;

public class Complejo {
	private double parteReal;
	private double parteImag;
	
	Complejo(){
		this.parteReal=0;
		this.parteImag=0;
	}
	Complejo(double pr,double pi){
		this.parteReal=pr;
		this.parteImag=pi;
	}
	public void Suma(Complejo num2){
		this.parteReal=this.getParteReal()+num2.getParteReal();
		this.parteImag=this.getParteImag()+num2.getParteImag();
		
	}
	public void Resta(Complejo num2){
		this.parteReal=this.getParteReal()-num2.getParteReal();
		this.parteImag=this.getParteImag()-num2.getParteImag();
		
	}
	public void Multiplicacion(Complejo num2){
		this.parteReal=(this.getParteReal()*num2.getParteReal())-(this.getParteImag()*num2.getParteImag());
		this.parteImag=(this.getParteReal()*num2.getParteImag())+(this.getParteImag()*num2.getParteReal());
	}
	public void Division(Complejo num2){
		double aux=num2.getParteReal()*num2.getParteReal()+num2.getParteImag()*num2.getParteImag();
		this.parteReal=((this.getParteReal()*num2.getParteReal())+(this.getParteImag()*num2.getParteImag()))/aux;
		this.parteImag=((this.getParteImag()*num2.getParteReal())-(this.getParteReal()*num2.getParteImag()))/aux;
	}
	
	public String toString() {
		return "(" + parteReal + ","
				+ parteImag + ")";
	}
	
	//ACCESADORES
	public double getParteReal() {
		return parteReal;
	}
	public void setParteReal(float parteReal) {
		this.parteReal = parteReal;
	}
	public double getParteImag() {
		return parteImag;
	}
	public void setParteImag(float parteImag) {
		this.parteImag = parteImag;
	}

}
