package simulando_simulacro;

import java.util.Scanner;

public class Numero {
	int numeroactual;
	int ultimonumero;

	Numero(int numeroactual,int ultimonumero){
		this.numeroactual=numeroactual;
		this.ultimonumero=ultimonumero;
	}
	
	void darNumero(){
		this.ultimonumero=ultimonumero+1;
		System.out.println(ultimonumero);
	}
	void atender(){
		if(numeroactual<ultimonumero){
		System.out.println("Nº"+(numeroactual+1)+" pásese por el mostrador");//+1 para que no llame a cliente cero
		numeroactual++;}
		else{
			System.out.println("No se puede atender a un cliente que no tiene numero");
		}
	}
	void mostrarCola(){
		System.out.println("Clientes sin atender: "+(ultimonumero-numeroactual));
		for(int i=numeroactual+1;i<=ultimonumero;i++){
			System.out.println(i);
		}
	}
	void menu(){
		int opc;
		Scanner teclado=new Scanner(System.in);
		do{
		System.out.println("Elige una opcion del siguiente menu: ");
		System.out.println("(1)Coger Numero)");
		System.out.println("(2)Atender)");
		System.out.println("(3)Ver cola");
		System.out.println("(4)Salir)");
		opc=teclado.nextInt();
		switch(opc){
		case 1: 
			darNumero();
			break;
		case 2: 
			atender();
			break;
		case 3: 
			mostrarCola();
			break;
		}
		}while(opc!=4);
	}
}
