/*

    Crea la clase Deporte que almacenar� datos sobre un deporte concreto, incluyendo los siguientes datos:
        Nombre del deporte.
        N�mero de equipos que participan en un partido.
        N�mero de jugadores de cada equipo.

    La clase Deporte tendr� un constructor al que pasaremos como par�metro el nombre, n�mero de equipos 
    y n�mero de jugadores.

    Crear la clase Futbol, que hereda de Deporte y que tiene el siguiente atributo privado:
        goles de tipo int[] para guardar el n�mero de goles que va marcando cada equipo.
    Crear un constructor sin par�metros de la clase Futbol que da valor a todos sus atributos.
     Inicializar� los goles de cada equipo a cero y el n�mero de jugadores de cada equipo a 11. 
     Deber� usar el constructor de la clase Deporte.
    Crear un m�todo: marcarGol(int equipo) que recibe como par�metro el identificador del equipo 
    que marca el gol (0 � 1), e incrementa su contador de goles.
    Sobrescribir el m�todo toString de la clase Object para que incluya el marcador de goles actual
     (los goles de cada equipo).


 */
package repaso;

public class Deporte {
	private String nombre;
	private int numEquipos;
	private int numJugadores;
	
	Deporte(String n,int ne,int nj){
		this.nombre=n;
		this.numEquipos=ne;
		this.numJugadores=nj;
	}

	

}
