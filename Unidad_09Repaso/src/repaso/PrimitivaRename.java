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
		String primitiva="Sorteo efectuado el "+getFecha()+" con una recaudación acumulada de "+getRecaudacion()+
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
