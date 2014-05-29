/*Escribe un programa que implemente el algoritmo de la criba de Erat�stenes. 
El c�culo de la criba se har� en un m�todo, que imprimir� cada uno de los n�meros no primos encontrados. 
El pseudoc�digo en la p�gina en ingl�s es m�s claro.*/
package metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Escribe un numero: ");
	int numero=teclado.nextInt();
	ArrayList <Integer>primos=criba(numero);
	mostrarPrimos(primos);
	}
	
public static void mostrarPrimos(ArrayList <Integer>prim){
	ArrayList <Integer>numprimos=prim;
	for(int i=0;i<numprimos.size();i++){
		System.out.print(numprimos.get(i)+" ");
	}
}
public static ArrayList <Integer>  criba(int numero){
	ArrayList <Integer> primos=new ArrayList<Integer>();
	ArrayList <Integer> tachados=new ArrayList<Integer>();
	
	for(int i=2;i<numero;i++){
		for(int j=2;j<numero;j++){
			if (tachados.contains(i)||primos.contains(i)){
				break;
			}
			else if(j==i){
				primos.add(i);
				for(int k=i*j;k<numero;){
				tachados.add(k);
				k=k+i;
				}
			}
		}
	}
	return primos;
	}
}