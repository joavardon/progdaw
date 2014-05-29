/*Crea la clase Oculto que contiene un n�mero oculto. Cuando se crea un objeto de esta clase, 
se crea internamente un n�mero aleatorio entre 1 y 100, o entre los n�meros que se le pasan 
por par�metros (m�nimo y m�ximo). Esta clase entr� el m�todo: pruebaNumero(int n), 
que devolver� 0 si el n�mero es el oculto, -1 si el n�mero oculto es menor y +1 
si el n�mero oculto es mayor. Utiliza esta clase para crear la aplicaci�n Adivina el n�mero.*/
package Ejercicios;

public class Oculto {

		private int oculto;
		private int minimo;
		private int maximo;
		
		Oculto(){
		this.oculto=(int) (Math.random()*100+1);
		}
		
		Oculto(int min,int max){
			this.oculto=((int)(Math.random()*(max-min+1))+min);
			this.minimo=min;
			this.maximo=max;
		}

		public int pruebaNumero(int n){
			if(n==oculto){
				return 0; 
				}
			else if(oculto<n){
				return -1;
				}
			else{
				return 1;
				}
			
		}

		public int getOculto() {
			return oculto;
		}

		public void setOculto(int oculto) {
			this.oculto = oculto;
		}

		public int getMinimo() {
			return minimo;
		}

		public void setMinimo(int minimo) {
			this.minimo = minimo;
		}

		public int getMaximo() {
			return maximo;
		}

		public void setMaximo(int maximo) {
			this.maximo = maximo;
		}
}
