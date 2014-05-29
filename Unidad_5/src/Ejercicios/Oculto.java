/*Crea la clase Oculto que contiene un número oculto. Cuando se crea un objeto de esta clase, 
se crea internamente un número aleatorio entre 1 y 100, o entre los números que se le pasan 
por parámetros (mínimo y máximo). Esta clase entrá el método: pruebaNumero(int n), 
que devolverá 0 si el número es el oculto, -1 si el número oculto es menor y +1 
si el número oculto es mayor. Utiliza esta clase para crear la aplicación Adivina el número.*/
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
