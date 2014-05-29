package Ejercicios;

import java.util.Scanner;

public class Banco {

	
	public static void main(String[] args) {
	Cuenta numcuenta = new Cuenta("345234535",100);
	menu(numcuenta);
	}
	
	public static void menu(Cuenta numcuenta){
		
		int opcion;
		Scanner teclado =new Scanner (System.in);
		System.out.println("1.Ver saldo: ");
		System.out.println("2.Meter dinero: ");
		System.out.println("3.Sacar dinero: ");
		System.out.println("4. Ver numero de cuenta: ");
		System.out.println("5. Salir. ");
		do{
			System.out.println("Elige una opción: ");
			opcion=teclado.nextInt();
			switch(opcion){
			case 1: 
				numcuenta.mostrarSaldo(numcuenta);
				break;
			case 2:
				numcuenta.meterDinero(numcuenta);
				
				System.out.println(numcuenta.getMovimientos()+ " movimientos llevas");
				
				break;
			case 3:
				numcuenta.quitarDinero(numcuenta);
			
				System.out.println(numcuenta.getMovimientos()+ " movimientos llevas");
		
				break;
			case 4:
				System.out.println("Tu cuenta es "+numcuenta.getNumcuenta());
				break;
			default:
				if(opcion!=5){
					System.out.println("Opción inválida. Elige otra opción: ");
				}
			}
		}while(opcion!=5);
		
		
	}

}
