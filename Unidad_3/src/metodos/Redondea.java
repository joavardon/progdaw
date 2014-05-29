//crea un metodo redondea que realice la tarea de redondear, pedira numeros reales y mostrara el numero y el redondeo (sindecimales)
/*partiendo del anterior mejora el redondeador haciendo que:
A)Al comienzo se pedriá el número de decimales a los que quiere redondear
B)El método redondear tendrá un segundo parámetro, para decirle los decimales que queremos.*/


package metodos;

import java.util.Scanner;

public class Redondea {
	public static  double redondear(double numero,int decimales){;
		
		return  (Math.floor(numero + 0.5));
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("elige un numero: ");
		float num=teclado.nextFloat();

		System.out.println("¿cuántos decimales quieres: ");
		int decimales=teclado.nextInt();
	
		double redondeado=redondear(num,decimales);
		System.out.println(redondeado);
	}
	
	/*3,333 3,33
	3,337 3,34

	o adios*/
}
