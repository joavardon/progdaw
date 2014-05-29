package clases_paquetes_metodosestaticos;

import java.util.Scanner;


public class PruebaRacional {

	
	public static void main(String[] args) {
	
		Racional n1=new Racional();
		Racional n2=new Racional(47,2);
		System.out.println(n1.Suma(n2).toFloatString());
		System.out.println(n1);
		System.out.println(n1.Suma(n2).toString());
		
		Scanner teclado=new Scanner(System.in);
		
		try{
		
		System.out.println("Introduce el numerador del primer numero racional: ");
		int dividendo1=teclado.nextInt();
		System.out.println("Introduce el denominador del primer numero racional: ");
		int divisor1=teclado.nextInt();
		Racional racional1=new Racional(dividendo1,divisor1);
		System.out.println("Introduce el numerador del segundo numero racional: ");
		int dividendo2=teclado.nextInt();
		System.out.println("Introduce el denominador del segundo numero racional: ");
		int divisor2=teclado.nextInt();
		Racional racional2=new Racional(dividendo2,divisor2);
		System.out.println(racional1);
		System.out.println(racional2);
		System.out.println("MENÚ");
		System.out.println("Elige una operación: ");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		int opcion=teclado.nextInt();
		switch(opcion){
			case 1: System.out.println(Racional.Suma(racional1,racional2).toString());
					System.out.println(Racional.Suma(racional1,racional2).toFloatString());
					break;
			case 2: System.out.println(Racional.Resta(racional1,racional2).toString());
					System.out.println(Racional.Resta(racional1,racional2).toFloatString());
					break;
			case 3: System.out.println(Racional.Multiplicacion(racional1,racional2).toString());
					System.out.println(Racional.Multiplicacion(racional1,racional2).toFloatString());
					break;
			case 4: System.out.println(Racional.Division(racional1,racional2).toString());
					System.out.println(Racional.Division(racional1,racional2).toFloatString());
					break;}
		
		}catch(ArithmeticException e){
		
			System.out.println("Division por cero: "+e);}

	}
}

	
	
	
	

	

