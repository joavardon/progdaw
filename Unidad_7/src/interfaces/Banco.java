package interfaces;

import java.util.Scanner;


public class Banco {
	static Scanner teclado;
	public static void main(String[] args) {
	teclado=new Scanner(System.in);
	Cuenta c1=new Cuenta("Juan Perez","00013333121234567890",500);
	System.out.println("Bienvenido a MENU BANCO");
	Menu mimenu=new Menu();
	mimenu.añadirOpcion("Ver saldo");
	mimenu.añadirOpcion("Meter dinero");
	mimenu.añadirOpcion("Sacar dinero");
	mimenu.añadirOpcion("Cambiar tipo de interes");
	mimenu.añadirOpcion("Aplicar intereses");
	mimenu.añadirOpcion("Salir");
	mimenu.mostrarMenu();
	prueba(mimenu,c1);
	
	}
public static  void prueba(Menu menu, Cuenta c1){
		teclado=new Scanner(System.in);
		int opc;
		do{
		
		opc=teclado.nextInt();
		switch(opc){
		
		case 1: 
				System.out.println("Tu saldo es: ");
				System.out.println(c1.estado());
				menu.mostrarMenu();
				break;
		case 2: System.out.println("dinero a ingresar: ");
				double ing=teclado.nextDouble();
				c1.ingreso(ing);
				menu.mostrarMenu();
				break;
		case 3: System.out.println("dinero a sacar: ");
				teclado=new Scanner(System.in);
				double sac=teclado.nextDouble();
				c1.reintegro(sac);
				menu.mostrarMenu();
				break;
		case 4: System.out.println("cambiar tipo: ");
				teclado=new Scanner(System.in);
				double tipo=teclado.nextDouble();
				c1.asignarTipoInteres(tipo);
				menu.mostrarMenu();
				break;
		case 5:
				System.out.println("Numero de dias a aplicar intereses");
				teclado=new Scanner(System.in);
				int dias=teclado.nextInt();
				System.out.println(c1.intereses(dias));
				menu.mostrarMenu();
				break;
		}
		}while(opc!=6);
		
	}
}
