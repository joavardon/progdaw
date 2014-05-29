/*
 * Escribe una clase llamada Cuadrado, que posee un atributo de tipo entero llamado ancho.

La clase debe poseer los siguientes m�todos:

    Un constructor que no recibe ning�n par�metro y que inicialice las dimensiones del cuadrado con un n�mero por defecto.
    Otro m�todo constructor que reciba el ancho como par�metros. Se debe comprobar que el valor es positivo antes de asignarlo. En caso contrario, se asignar�n valores por defecto
    M�todos get y set para la clase.
    Un m�todo que calcule y retorne el �rea del cuadrado.
    M�todo que calcule y retorne el per�metro del cuadrado.

Otro m�todo que dibuje en pantalla el cuadrado mediante asteriscos, utilizando tantas columnas y filas como valor tenga el ancho.

* * *

* * *

* * *

Crea la clase Rect�ngulo, que hereda de la clase Cuadrado, y posee dos atributos de tipo entero llamados largo y ancho.

La clase debe tener los siguientes m�todos:

    Un m�todo constructor que reciba el ancho y el largo como par�metros. 
    Debe comrpobar que ambos valores sean positivos antes de asign�rselos 
    a los atributos correspondientes. En caso contrario, se asignar�n valores por defecto.

    M�todos get y set para la clase.
    Un m�todo que calcule y retorne el �rea del rect�ngulo.
    M�todo que calcule y retorne el per�metro del rect�ngulo.
    Otro m�todo que determine si el rect�ngulo es horizontal o vertical. Decimos que el 
    rect�ngulo es horizontal si el valor del ancho es mayor que el del alto. En caso 
    contrario, decimos que el rect�ngulo es vertical.

Otro m�todo que dibuje en pantalla el rect�ngulo mediante asteriscos, utilizando tantas 
columnas como valor tenga el ancho y tantas filas como valor tenga el alto. Por ejemplo, 
si el alto valiera 3 y el ancho valiera 12, se deber�a desplegar as�:

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
