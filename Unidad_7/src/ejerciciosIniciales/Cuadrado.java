/*
 * Escribe una clase llamada Cuadrado, que posee un atributo de tipo entero llamado ancho.

La clase debe poseer los siguientes métodos:

    Un constructor que no recibe ningún parámetro y que inicialice las dimensiones del cuadrado con un número por defecto.
    Otro método constructor que reciba el ancho como parámetros. Se debe comprobar que el valor es positivo antes de asignarlo. En caso contrario, se asignarán valores por defecto
    Métodos get y set para la clase.
    Un método que calcule y retorne el área del cuadrado.
    Método que calcule y retorne el perímetro del cuadrado.

Otro método que dibuje en pantalla el cuadrado mediante asteriscos, utilizando tantas columnas y filas como valor tenga el ancho.

* * *

* * *

* * *

Crea la clase Rectángulo, que hereda de la clase Cuadrado, y posee dos atributos de tipo entero llamados largo y ancho.

La clase debe tener los siguientes métodos:

    Un método constructor que reciba el ancho y el largo como parámetros. 
    Debe comrpobar que ambos valores sean positivos antes de asignárselos 
    a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.

    Métodos get y set para la clase.
    Un método que calcule y retorne el área del rectángulo.
    Método que calcule y retorne el perímetro del rectángulo.
    Otro método que determine si el rectángulo es horizontal o vertical. Decimos que el 
    rectángulo es horizontal si el valor del ancho es mayor que el del alto. En caso 
    contrario, decimos que el rectángulo es vertical.

Otro método que dibuje en pantalla el rectángulo mediante asteriscos, utilizando tantas 
columnas como valor tenga el ancho y tantas filas como valor tenga el alto. Por ejemplo, 
si el alto valiera 3 y el ancho valiera 12, se debería desplegar así:

* * * * * * * * * * * *

* * * * * * * * * * * *

* * * * * * * * * * * *

 */
package ejerciciosIniciales;

public class Cuadrado {
	private int ancho;
	
	Cuadrado(){
		this.ancho=5;
	}
	Cuadrado (int a){
		if (a>0){
			this.ancho =a;
		}
		else{
			this.ancho=5;
		}
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int areaCuadrado(){
		int area=ancho*ancho;
		return area;
	}
	public int perimetroCuadrado(){
		int perimetro=ancho*4;
		return perimetro;
	}
	public void dibujaCuadrado(){
		for(int i=0;i<ancho;i++){
			for(int j=0;j<ancho;j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
