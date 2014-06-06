/*

    Crea la clase Deporte que almacenará datos sobre un deporte concreto, incluyendo los siguientes datos:
        Nombre del deporte.
        Número de equipos que participan en un partido.
        Número de jugadores de cada equipo.

    La clase Deporte tendrá un constructor al que pasaremos como parámetro el nombre, número de equipos 
    y número de jugadores.

    Crear la clase Futbol, que hereda de Deporte y que tiene el siguiente atributo privado:
        goles de tipo int[] para guardar el número de goles que va marcando cada equipo.
    Crear un constructor sin parámetros de la clase Futbol que da valor a todos sus atributos.
     Inicializará los goles de cada equipo a cero y el número de jugadores de cada equipo a 11. 
     Deberá usar el constructor de la clase Deporte.
    Crear un método: marcarGol(int equipo) que recibe como parámetro el identificador del equipo 
    que marca el gol (0 ó 1), e incrementa su contador de goles.
    Sobrescribir el método toString de la clase Object para que incluya el marcador de goles actual
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
