package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sumaPares {
	static Scanner teclado;
	public static void introducePar(int numero)throws NoPar{
			if(numero%2!=0){
				throw new NoPar("No par");
			}
	}
	public static void main(String[] args) {
		int c=0;
		int suma=0;
		boolean seguir;
		try{
			teclado=new Scanner(System.in);
			
			do{
				seguir=true;
				
				try{
					int numero=teclado.nextInt();
						introducePar(numero);
						suma=suma+numero;
						c++;
						if(c<5){
							seguir=false;
						}
					}
				catch (InputMismatchException ime) {
					System.out.println("No puedes introducir letras.");
					seguir=false;
					teclado.next();//MUY IMPORTANTE
				}
				catch(Exception NoPar){
					System.out.println( NoPar.getMessage());
					seguir=false;}
				
			}while(!seguir);}
	catch (NullPointerException ime) {
			System.out.println("No se pudo terminar el programa correctamente.");
	} 
				
		System.out.println(c);
		System.out.println(suma);
		}
}
