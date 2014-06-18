/*
 * La Primitiva es un juego donde tenemos un tablero con n�meros del 1 al 49. 
 * El jugador marca 6 de ellos. En un sorteo se eligen 6 n�meros m�s el complementario 
 * (un total de 7). En funci�n de los n�meros del sorte que coincidan con los seis elegidos
 *  por el usuario, tendremos los siguientes premios:

    3 aciertos.
    4 aciertos.
    5 aciertos.
    5 aciertos + complementario.
    6 aciertos.

Crea la clase Primitiva que tenga los siguientes m�todos:

    Un constructor que permita pasar los datos de un sorteo: fecha, recaudaci�n y combinaci�n ganadora, 
    para que se almacenen dentro de la clase. Debe comprobar que los n�meros pasados son 7 y est�n 
    en el rango permitido, generando una excepci�n en caso contrario (IllegalArgumentException).

    Un m�todo compruebaNumeros que recibir� un array con los 6 n�meros jugados. El m�todo coprobar� los
     aciertos y los almacenar� internamente. Pueden hacerse varias llamadas a compruebaNumeros porque 
     se jueguen muchas combinaciones.

    Un m�todo compruebaMultiple, que tiene el mismo funcionamiento que compruebaNumeros pero al que
     se le pueden pasar combinaciones de m�s de 6 n�meros.

    Un m�todo muestraPremios que mostrar� por consola los premios acumulados (de cada categor�a).

    Implementar el m�todo toString() y getters.

 */
package repaso;

import java.util.Arrays;

public class PrimitivaRename {
	private String fecha;
	private double recaudacion;
	private int[]combGanadora;
	private int[] aciertos;
	public enum Premios {
	    TRES, CUATRO, CINCO, CINCO_Y_COMPLEMENTARIO, SEIS }
	PrimitivaRename(String fecha,double recaudacion,int[] cg){
		this.fecha=fecha;
		this.recaudacion=recaudacion;
		this.combGanadora=cg;
		this.aciertos=new int[5];
	}
	static boolean comprobarNumeros(int[] cg){
		boolean correcto=true;
		for(int i=0;i<cg.length && correcto==true;i++){
			if(!(cg[i]>0 && cg[i]<50)){
				correcto=false;
			}
		}
		return correcto;
	}
	
	static boolean tiene_duplicados(int[] cg){
		boolean rep=false;
		Arrays.sort(cg); 
		for(int i=1;i<cg.length && !rep;i++)
			if (cg[i-1]==(cg[i]))
				rep=true;
		return rep;
	}
	
	 public  void compruebaValida(int[] cg,int num) {
		 if(cg.length!=num || !(comprobarNumeros(cg))||tiene_duplicados(cg)){
				throw new IllegalArgumentException("Numeros no permitidos en este caso");
			};
		}
	 public  void compruebaAciertos(int[] a,int complementario) {
		 compruebaValida(a,6);
		 int aciertos=0;
		 boolean esta = false;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<this.combGanadora.length && !esta;j++){
				if(a[i]==this.combGanadora[j]){
					aciertos++;
					esta=true;
				}
			}
			esta=false;
		}
		
		if(aciertos>=3){
			switch(aciertos){
			case 3: 
				this.aciertos[Premios.TRES.ordinal()]++;
			//	System.out.println("3 aciertos");
				break;
			case 4:
				this.aciertos[Premios.CUATRO.ordinal()]++;
			//	System.out.println("4 aciertos");
				break;
			case 5:
				if(compruebaComplementario(a,complementario)==true){
					this.aciertos[Premios.CINCO_Y_COMPLEMENTARIO.ordinal()]++;
				//	System.out.println("5+Complementario");
				}
				else
				this.aciertos[Premios.CINCO.ordinal()]++;
			//	System.out.println("5 aciertos");
				break;
			case 6:
					this.aciertos[Premios.SEIS.ordinal()]++;
					//System.out.println("6 aciertos");
				
				break;
			
			}
		}
	}
	 
	 public void compruebaMultiple(int[] a,int complementario) throws Exception{
			compruebaAciertos(a,complementario);
		}
	public void muestraPremios(){
	
		System.out.println("Resultados: ");
		System.out.println(" Recaudado: " + recaudacion);
		System.out.println(" 3 Aciertos: " + aciertos[Premios.TRES.ordinal()]);
		System.out.println(" 4 Aciertos: " + aciertos[Premios.CUATRO.ordinal()]);
		System.out.println(" 5 Aciertos: " + aciertos[Premios.CINCO.ordinal()]);
		System.out.println(" 5 Aciertos + complementario: " + aciertos[Premios.CINCO_Y_COMPLEMENTARIO.ordinal()]);
		System.out.println(" 6 Aciertos: " + aciertos[Premios.SEIS.ordinal()]);
		
	}
		

	boolean compruebaComplementario(int[] miCombinacion,int complementario) {
		
		boolean esComplementario=false;
		for(int i=0;i<miCombinacion.length && esComplementario==false;i++){
			if(miCombinacion[i]==(complementario)){
				esComplementario=true;
			}
		}
		return esComplementario;
	}
	
	public String toString(){
		String cadena="";
		for(int i=0;i<combGanadora.length;i++){
			if(i==combGanadora.length-1)
			cadena=cadena+combGanadora[i]+".";
			else
			cadena=cadena+combGanadora[i]+"-";
		}
		String primitiva="Sorteo efectuado el "+getFecha()+" con una recaudaci�n acumulada de "+getRecaudacion()+
				" con la siguiente combinacion ganadora "+cadena;
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
	
	
	
}
