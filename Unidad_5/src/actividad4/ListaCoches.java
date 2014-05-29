/*Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.

La clase Coche tendrá los atributos privados modelo, matrícula, marca y color. 
Crea los constructores que estimes necesarios, los get/set necesarios y el método toString().

La clase ListaCoches contendrá el array de coches y los métodos necesarios para hacer 
un programa principal que pueda hacer lo siguiente:

    Devolver el coche que se encuentra en una posición dada. Si la posición aportada no es válida 
    devolverá null.
    Devolver la posición del coche cuya matrícula coincide con una dada. En caso de no encontrar 
    esta devolverá -1.
    Devuelve la lista de coches que son de una marca determinada.*/


package actividad4;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCoches {
	
	
	//metodos
	static String posicion(Coche[] c){
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce la posición del coche deseada: ");
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
		System.out.println("Introduce la matrícula del coche: ");
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

