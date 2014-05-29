/*Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.

La clase Coche tendr� los atributos privados modelo, matr�cula, marca y color. 
Crea los constructores que estimes necesarios, los get/set necesarios y el m�todo toString().

La clase ListaCoches contendr� el array de coches y los m�todos necesarios para hacer 
un programa principal que pueda hacer lo siguiente:

    Devolver el coche que se encuentra en una posici�n dada. Si la posici�n aportada no es v�lida 
    devolver� null.
    Devolver la posici�n del coche cuya matr�cula coincide con una dada. En caso de no encontrar 
    esta devolver� -1.
    Devuelve la lista de coches que son de una marca determinada.*/


package actividad4;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCoches {
	
	
	//metodos
	static String posicion(Coche[] c){
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce la posici�n del coche deseada: ");
		int posicion=teclado.nextInt();
		String posicionModelo = "-1"; 
		
		for(int i=0;i<c.length;i++){
			
			if(posicion==i){
				posicionModelo=c[i].getMarca()+c[i].getModelo();
				
				break;
			}
		}
		
		return posicionModelo;
	}
	static String posMatricula(Coche[] c){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la matr�cula del coche: ");
		String  matricula=teclado.next();
		String posMatricula = null;
		
		for(int i=0;i<c.length;i++){
			if(matricula.equals(c[i].getMatricula())){
				posMatricula=("La posicion es: "+i);
				
				break;
			}
		}
		return posMatricula;
	}
	static void cochesMarca(Coche[] c){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la marca deseada: ");
		String  marca=teclado.next();
		Coche[] coches=c;
		for(int i=0;i<c.length;i++){
			if(marca.equals(c[i].getMarca())){
				
				System.out.println(c[i].getMarca()+" "+(c[i].getModelo()));
				}
			
		}

	}
public static void main(String[] args) {
	Coche[] coches=new Coche[3];
	Coche coche1=new Coche("Toledo","4565V","SEAT","rojo");
	Coche coche2=new Coche("Ibiza","4885V","SEAT","azul");
	Coche coche3=new Coche("Toledo","9665V","SEAT","negro");
	coches[0]=coche1;
	coches[1]=coche2;
	coches[2]=coche3;
	ListaCoches.cochesMarca(coches);
	System.out.println(ListaCoches.posicion(coches));
	System.out.println(ListaCoches.posMatricula(coches));
}
}

