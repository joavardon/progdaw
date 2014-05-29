package actividad4;

import java.util.Scanner;

public class pruebaFecha {


	public static void main(String[] args) {
		do{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un mes: ");
		int mes=teclado.nextInt();
		System.out.println("Escribe un día: ");
		int dia=teclado.nextInt();
		System.out.println("Escribe un año: ");
		int año=teclado.nextInt();
		Fecha fecha=new Fecha(mes,dia,año);
		fecha.siguienteDia(fecha.getDia(),fecha.getMes(),fecha.getAnio());
		System.out.println("siguiente dia "+fecha.toString());}
		while(true);
	}

}
