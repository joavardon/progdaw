package actividad4;

import java.util.Scanner;

public class pruebaFecha {


	public static void main(String[] args) {
		do{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un mes: ");
		int mes=teclado.nextInt();
		System.out.println("Escribe un d�a: ");
		int dia=teclado.nextInt();
		System.out.println("Escribe un a�o: ");
		int a�o=teclado.nextInt();
		Fecha fecha=new Fecha(mes,dia,a�o);
		fecha.siguienteDia(fecha.getDia(),fecha.getMes(),fecha.getAnio());
		System.out.println("siguiente dia "+fecha.toString());}
		while(true);
	}

}
