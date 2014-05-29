/*Desarrolla una peque�a aplicaci�n que use un array bidimensional como pantalla, cada casilla es un pixel que por defecto se caracteriza por el car�cter *.

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

El programa tendr� un men�:

    Elegir car�cter.
    Cuadrado.
    Rect�ngulo.
    Tri�ngulo.
    C�rculo.
    Mostrar pantalla.

El funcionamiento es el siguiente:

    Pedimos al usuario que inserte el caracter a usar (por defecto ser� '@').
    Dibuja un cuadrado pidiendo coordenadas esquina izquierda.
    Dibuja un rect�ngulo pidiendo coordenadas esquina izquierda.
    Dibuja un tri�ngulo pidiendo coordenadas v�rtice superior.
    Dibuja un rect�ngulo pidiendo coordenadas centro.
    Imprime pantalla.

Para las opciones 2,3,4,5 se pedir� tambi�n el tama�o del elemento.

As� por ejemplo, si se dice que use el '+', posic�n 1,1 y tama�o 3.

* * * * * * * * * *
* + + + * * * * * *
* + * + * * * * * *
* + + + * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
*/

package vectoresymatrices;

import java.util.Scanner;

public class Asteriscos {
	
	
	public static void main(String[] args) {
		char[][]pantalla=new char[8][10];
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige un caracter (@ por defecto)");
		String pedircar=teclado.next();
		char caracter='@';
		if(!(pedircar.charAt(0)=='@')){
			caracter=pedircar.charAt(0);
		}
		System.out.println(caracter);
		
		Scanner teclado2=new Scanner(System.in);
		/*System.out.println("Dame coordenada i: ");
		int ci=teclado2.nextInt();
		System.out.println("Dame coordenada j: ");
		int cj=teclado2.nextInt();
		int tama�o=teclado.nextInt();
		
		//System.out.println(pantalla.length);
		
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=ci && j<tama�o+ci))||((i==ci+tama�o) && (j>=ci && j<=tama�o+ci))||
						(i>=ci && i<ci+tama�o && (j==ci||j==ci+tama�o))){
					pantalla[i][j]=(char)caracter;
				}
				
				else{
					pantalla[i][j]='*';
				}
			}
			
		}
		for(int k=0;k<pantalla.length;k++){
			for(int l=0;l<pantalla[k].length;l++){
				System.out.print(pantalla[k][l]+ " ");
			}
			System.out.println();
		}
		System.out.println("Dame coordenada i: ");
		ci=teclado2.nextInt();
		System.out.println("Dame coordenada j: ");
		cj=teclado2.nextInt();
		int largo=teclado.nextInt();
		int ancho=teclado.nextInt();
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=ci && j<largo+ci))||((i==ci+ancho) && (j>=ci && j<=largo+ci))||
						(i>=ci && i<ci+ancho && (j==ci||j==ci+largo))){
					pantalla[i][j]=(char)caracter;
				}
				
				else{
					pantalla[i][j]='*';
				}
			}
			
		}
		
		for(int k=0;k<pantalla.length;k++){
			for(int l=0;l<pantalla[k].length;l++){
				System.out.print(pantalla[k][l]+ " ");
			}
			System.out.println();
		}*/
		System.out.println("Dame coordenada i: ");
		int ci=teclado2.nextInt();
		System.out.println("Dame coordenada j: ");
		int cj=teclado2.nextInt();
		int altura=teclado2.nextInt();
		int c=0;
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if((i==ci) && (i<ci+altura)){
					
				}
				else{
					pantalla[i][j]='*';
				}
				ci++;
			}
	
			
		}
		
		for(int k=0;k<pantalla.length;k++){
			for(int l=0;l<pantalla[k].length;l++){
				System.out.print(pantalla[k][l]+ " ");
			}
			System.out.println();
		}
		
	}
}
