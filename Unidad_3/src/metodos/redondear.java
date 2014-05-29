package metodos;

import java.util.Scanner;

public class redondear {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double numero;
		int decimales;
		System.out.println("-Super Redondeador-");
		System.out.println("Dame cuantos decimales: ");
		decimales=teclado.nextInt();
		do{
			System.out.println("Dame un numero real: ");
			numero=teclado.nextDouble();
			
			System.out.println(numero+ " redondeado es : " + redondea(numero,decimales));
		}while(numero!=0.0);
		System.out.println("Adiós");
	}

	private static double redondea(double a_redondear,int decimales) {
		double resultado;
		resultado= a_redondear*Math.pow(10, decimales);
		System.out.println("ahora así: "+resultado);
		resultado=Math.floor(resultado+0.5);
		System.out.println("ahora así: "+resultado);
		resultado=resultado/Math.pow(10,decimales);
		return resultado;
	}
	
}

/*3,333 3,33
3,337 3,34

o adios*/
