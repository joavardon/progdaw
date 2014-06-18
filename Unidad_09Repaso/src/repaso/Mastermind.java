package repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mastermind {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Collections.addAll(numeros, 1,2,3,4,5,6,7,8,9);
		ArrayList<Integer>numero=new ArrayList<Integer>();
		//Generar 4 numeros aleatorios que no se repitan para la jugada del ordenador
		for (int i=0; i<4;i++){
			int n=(int)(Math.random()*numeros.size());
			numero.add(numeros.get(n));
		    numeros.remove(n); 
		}
		    
		ArrayList<Integer>jugador=new ArrayList<Integer>();
	//bucle para el juego, solo saldra una vez que el numero del ordendor y el jugador coincidan
		int p1=0,p2=0,p3=0,p4=0;
		//Collections.addAll(jugador,p1,p2,p3,p4 );//quitar este
		boolean terminar=false;
		while (terminar==false){
			
			System.out.println("dime el primer numero: ");
		    p1=teclado.nextInt();
		    System.out.println("dime el segundo numero: ");
		    p2=teclado.nextInt();
		    System.out.println("dime el tercer numero: ");
		    p3=teclado.nextInt();
		    System.out.println("dime el cuarto numero: ");
		    p4=teclado.nextInt();
		 //   p1=jugador.set(0, p1);
		  //  p1=jugador.set(1, p2);
		  //  p1=jugador.set(2, p3);
		  //  p1=jugador.set(3, p4);
		   Collections.addAll(jugador,p1,p2,p3,p4 );
		  
		    //Total de aciertos
		    int vac=0;
		    int tor=0;

		     //toros
		    for (int i=0;i<numero.size();i++){
		        if (jugador.get(i).equals(numero.get(i))){
		            tor=tor+1;
		            }
		    }
		   
		      //vacas
		      for (int i=0;i<numero.size();i++){
			        if (numero.contains(jugador.get(i))){
			            vac=vac+1;
			            }
			    }
			    
		    int Vacas1=vac-tor;
		    System.out.println(jugador);
		    System.out.printf("Vacas: %d - ",Vacas1);
		    System.out.printf("Toros: %d\n",tor);
		   //Pierdes
		    if (tor < 4){
		        System.out.println("************************\nIntentelo de nuevo:");
		        jugador.clear();
		    }
		    else {
		        System.out.println("¡Has ganado!!Eres todo un MEGAMIND!");
		    	terminar=true;}
		}
	}

}
