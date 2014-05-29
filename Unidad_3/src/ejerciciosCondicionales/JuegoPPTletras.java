/*El juego de piedra/papel/tijera. 
Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
Solo una ronda por ejecución.
//para obtener un número aleatorio en Java entre 1 y 3:

resultado = (int )(Math.random() * 3 + 1);*/
package ejerciciosCondicionales;

import java.util.Scanner;

public class JuegoPPTletras {

	
	public static void main(String[] args) {
		
		int puntoshuman=0;
		int puntosord=0;
		
		//1 piedra, 2 papel, 3 tijera
		
		
		while((puntoshuman<4 && puntosord<4)){
			Scanner elige=new Scanner (System.in);
			
			System.out.println("Elige piedra(p),papel(l),o tijera(t): ");
			
			String jugada=elige.next();
			while(!jugada.equals("p") && !jugada.equals("l") && !jugada.equals("t") ){
				System.out.println("Error.Elige otra vez: ");
				jugada=elige.next();
			}
			System.out.println("Tu elección es: "+jugada);
			int resultado = (int )(Math.random() * 3 + 1);
			
			String res= Integer.toString(resultado);
			
			if (res.equals("1")){
				res="p";
				System.out.println("El ordenador elige: "+res);
			}
			else if (res.equals("2")){
				res=res.replaceAll(res,"l");
				System.out.println("El ordenador elige: "+res);
			}
			else if (res.equals("3")){
				res=res.replaceAll(res,"t");
				System.out.println("El ordenador elige: "+res);
			}
		
			if (jugada.equals("p") && res.equals("l")){
				System.out.println("Gana el ordenador");
				puntosord++;
			}
			else if (jugada.equals("p") && res.equals("t")){
				System.out.println("Ganas tú");
				puntoshuman++;
			}
			else if (jugada.equals("p") && res.equals("p")){
				System.out.println("Empate");
			}
			
			if (jugada.equals("l") && res.equals("t")){
				System.out.println("Gana el ordenador");
				puntosord++;
			}
			else if (jugada.equals("l") && res.equals("p")){
				System.out.println("Ganas tú");
				puntoshuman++;
			}
			else if (jugada.equals("l") && res.equals("l")){
				System.out.println("Empate");
			}
			
			if (jugada.equals("t") && res.equals("p")){
				System.out.println("Gana el ordenador");
				puntosord++;
			}
			else if (jugada.equals("t") && res.equals("l")){
				System.out.println("Ganas tú");
				puntoshuman++;
			}
			else if (jugada.equals("t") && res.equals("t")){
				System.out.println("Empate");
			}
		}
		System.out.println("Total puntos del jugador humano: "+puntoshuman);
		System.out.println("Total puntos del ordenador: "+puntosord);
			if (puntoshuman>3){
				System.out.println("GANA HUMANO con "+puntoshuman+" puntos");
			}
			if (puntosord>3){
				System.out.println("GANA ORDENADOR con "+puntosord+" puntos");
			
		}}

}
