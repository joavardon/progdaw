/*
 * Crea la clase Numero que permite llevar la cuenta de
los números dados en la cola de la charcutería. La clase
almacenará el número que se está atendiendo (sale en el
marcador) y el último número que se ha dado (el que se ha
impreso). La clase tendrá los métodos:
darNumero(): da el siguiente número (lo imprime por
pantalla).
atender(): muestra el número del cliente que tiene ir al
mostrador
mostrarCola(): muestra el número de clientes haciendo cola
e imprime la lista de sus números.
Crea un menú para poder cogeer/dar números y ver la cola
 */
package simulando_simulacro;

public class Ejercicio4 {


	public static void main(String[] args) {
		
		Numero charcuteria=new Numero(0,0);
		charcuteria.menu();
	}

}
