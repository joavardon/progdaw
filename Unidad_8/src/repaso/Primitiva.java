/*
 * La Primitiva es un juego donde tenemos un tablero con números del 1 al 49. 
 * El jugador marca 6 de ellos. En un sorteo se eligen 6 números más el complementario 
 * (un total de 7). En función de los números del sorte que coincidan con los seis elegidos
 *  por el usuario, tendremos los siguientes premios:

    3 aciertos.
    4 aciertos.
    5 aciertos.
    5 aciertos + complementario.
    6 aciertos.

Crea la clase Primitiva que tenga los siguientes métodos:

    Un constructor que permita pasar los datos de un sorteo: fecha, recaudación y combinación ganadora, 
    para que se almacenen dentro de la clase. Debe comprobar que los números pasados son 7 y están 
    en el rango permitido, generando una excepción en caso contrario (IllegalArgumentException).

    Un método compruebaNumeros que recibirá un array con los 6 números jugados. El método coprobará los
     aciertos y los almacenará internamente. Pueden hacerse varias llamadas a compruebaNumeros porque 
     se jueguen muchas combinaciones.

    Un método compruebaMultiple, que tiene el mismo funcionamiento que compruebaNumeros pero al que
     se le pueden pasar combinaciones de más de 6 números.

    Un método muestraPremios que mostrará por consola los premios acumulados (de cada categoría).

    Implementar el método toString() y getters.

 */
package repaso;

import java.util.ArrayList;
import java.util.Collections;


public class Primitiva {
	private String fecha;
	private double recaudacion;
	private ArrayList<Integer>combGanadora;
	
	Primitiva(String fecha,double recaudacion,ArrayList<Integer>cg)throws Exception{
		this.fecha=fecha;
		this.recaudacion=recaudacion;
		this.combGanadora=cg;
		if(cg.size()!=7 || !(comprobarNumeros(cg))||tiene_duplicados(cg)){
			throw new Exception("combinacion erronea de numeros");
		}
	}
	static boolean comprobarNumeros(ArrayList<Integer>a){
		boolean correcto=true;
		for(int i=0;i<a.size() && correcto==true;i++){
			if(!(a.get(i)>0 && a.get(i)<50)){
				correcto=false;
			}
		}
		return correcto;
	}
	
	static boolean tiene_duplicados(ArrayList<Integer>lista){
		boolean rep=false;
		Collections.sort(lista); 
		for(int i=1;i<lista.size() && !rep;i++)
			if (lista.get(i-1).equals(lista.get(i)))
				rep=true;
		return rep;
	}
	
	 public  int compruebaNumeros(ArrayList<Integer>a){
		 int numAciertos=0;
		for(int i=0;i<6;i++){
			if(this.combGanadora.contains(a.get(i))){
				numAciertos++;
			}
		}
		return numAciertos ;	
	}
	 
	 public int compruebaMultiple(ArrayList<Integer>a){
		 int numAciertos=0;
		for(int i=0;i<a.size();i++){
			if(this.combGanadora.contains(a.get(i))){
				numAciertos++;
			}
		}
		if(numAciertos>=6){
			numAciertos=6;
		}
		return numAciertos ;	
	}
	public void muestraPremios(ArrayList<Integer>a,int complementario){
		//int aciertos=compruebaNumeros(a);
		int aciertos=compruebaMultiple(a);
		if(aciertos>=3){
		switch(aciertos){
		case 3: 
			System.out.println("3 aciertos");
			break;
		case 4:
			System.out.println("4 aciertos");
			break;
		case 5:
			System.out.println("5 aciertos");
			break;
		case 6:
			if(compruebaComplementario(a,complementario)==true){
				System.out.println("5+Complementario");
			}
			else{
				System.out.println("6 aciertos");
			}
			break;
		}
		if(aciertos>6){
			System.out.println("6 aciertos");
		}
		}
		
	}

		boolean compruebaComplementario(ArrayList<Integer>a,int complementario) {
		
		boolean esComplementario=false;
		for(int i=0;i<a.size() && esComplementario==false;i++){
			if(a.get(i).equals(complementario)){
				esComplementario=true;
			}
		}
		return esComplementario;
	}
	
	public String toString(){
		String primitiva="Sorteo efectuado el "+getFecha()+" con una recaudación acumulada de "+getRecaudacion()+
				" con la siguiente combinacion ganadora "+getCombGanadora().toString();
		return primitiva;
		
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	public ArrayList<Integer> getCombGanadora() {
		return combGanadora;
	}
	public void setCombGanadora(ArrayList<Integer> combGanadora) {
		this.combGanadora = combGanadora;
	}
	
	
}
