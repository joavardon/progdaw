/*
 * Crea la clase Numero que permite llevar la cuenta de
los n�meros dados en la cola de la charcuter�a. La clase
almacenar� el n�mero que se est� atendiendo (sale en el
marcador) y el �ltimo n�mero que se ha dado (el que se ha
impreso). La clase tendr� los m�todos:
darNumero(): da el siguiente n�mero (lo imprime por
pantalla).
atender(): muestra el n�mero del cliente que tiene ir al
mostrador
mostrarCola(): muestra el n�mero de clientes haciendo cola
e imprime la lista de sus n�meros.
Crea un men� para poder cogeer/dar n�meros y ver la cola
 */
package simulando_simulacro;

public class Ejercicio4 {


	public static void main(String[] args) {
		
		Numero charcuteria=new Numero(0,0);
		charcuteria.menu();
	}

}
