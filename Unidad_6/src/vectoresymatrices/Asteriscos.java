/*Desarrolla una pequeña aplicación que use un array bidimensional como pantalla, cada casilla es un pixel que por defecto se caracteriza por el carácter *.

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

El programa tendrá un menú:

    Elegir carácter.
    Cuadrado.
    Rectángulo.
    Triángulo.
    Círculo.
    Mostrar pantalla.

El funcionamiento es el siguiente:

    Pedimos al usuario que inserte el caracter a usar (por defecto será '@').
    Dibuja un cuadrado pidiendo coordenadas esquina izquierda.
    Dibuja un rectángulo pidiendo coordenadas esquina izquierda.
    Dibuja un triángulo pidiendo coordenadas vértice superior.
    Dibuja un rectángulo pidiendo coordenadas centro.
    Imprime pantalla.

Para las opciones 2,3,4,5 se pedirá también el tamaño del elemento.

Así por ejemplo, si se dice que use el '+', posicón 1,1 y tamaño 3.

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
		int tamaño=teclado.nextInt();
		
		//System.out.println(pantalla.length);
		
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=ci && j<tamaño+ci))||((i==ci+tamaño) && (j>=ci && j<=tamaño+ci))||
						(i>=ci && i<ci+tamaño && (j==ci||j==ci+tamaño))){
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
