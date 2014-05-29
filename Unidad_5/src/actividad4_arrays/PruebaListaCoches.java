package actividad4_arrays;

import java.util.Scanner;

public class PruebaListaCoches {

	
	public static void main(String[] args) {
		//Scanner teclado=new Scanner(System.in);
		Coche coche1=new Coche("Toledo","3454FFJ","SEAT","azul");
		Coche coche2=new Coche("Ibiza","3488XFJ","SEAT","negro");
		Coche coche3=new Coche("Cordoba","1232AAJ","SEAT","rojo");
		Coche coche4=new Coche("Astra","8877CAJ","Opel","rosa");
		ListaCoches.listacoches[0]=coche1;
		ListaCoches.listacoches[1]=coche2;
		ListaCoches.listacoches[2]=coche3;
		ListaCoches.listacoches[3]=coche4;
		Coche cocheDevuelto=ListaCoches.posicion();
		System.out.println(cocheDevuelto);
		System.out.println(ListaCoches.matricula());
		ListaCoches.marca();
	}

}
