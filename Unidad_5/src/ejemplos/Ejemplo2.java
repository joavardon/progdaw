package ejemplos;

import Ejercicios.Contador;

public class Ejemplo2 {
	public static void main(String[] args) {
	Contador uno;
	uno=new Contador();
	while(uno.getContador()<100){
		System.out.println(uno.getContador());
		uno.incrementar();
	}

	}

}
