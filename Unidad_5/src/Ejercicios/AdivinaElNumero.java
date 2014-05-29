package Ejercicios;

import java.util.Scanner;


public class AdivinaElNumero {


	public static void main(String[] args) {
		int res, res2;
		System.out.println("ADIVINA EL NUM1");
		Oculto oculto1=new Oculto();
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int num1=teclado.nextInt();
		//System.out.println(oculto1);
		
		
		do{
			while (num1<1 || num1>100){
				System.out.println("Fuera de rango. Introduce otro numero: ");
				num1=teclado.nextInt();
			}
		res=oculto1.pruebaNumero(num1);
		if(res==-1){
			System.out.println("El oculto es menor. Introduce otro numero: ");
			num1=teclado.nextInt();
		}
		else if(res==1){
			System.out.println("El oculto es mayor. Introduce otro numero: ");
			num1=teclado.nextInt();
		}
		}while(res!=0 );
		System.out.println("Lo has adivinado");
		
		System.out.println("************************************************");
		System.out.println("ADIVINA EL NUM2");
		
		Oculto oculto2=new Oculto(35,75);
		//System.out.println(oculto2);
		System.out.println("Introduce un numero: ");
		int num2=teclado.nextInt();
		do{
			while (num2<oculto2.getMinimo() || num2>oculto2.getMaximo()){
				System.out.println("Fuera de rango. Introduce otro numero: ");
				num2=teclado.nextInt();
			}
			res2=oculto2.pruebaNumero(num2);
			if(res2==-1){
				
				System.out.println("El oculto es menor. Introduce otro numero: ");
				num2=teclado.nextInt();
			}
			else if(res2==1){
	
				System.out.println("El oculto es mayor. Introduce otro numero: ");
				num2=teclado.nextInt();
			}
		}while(res2!=0  );
		System.out.println("Lo has adivinado");
	}

}
