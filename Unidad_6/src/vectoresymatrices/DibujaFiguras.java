package vectoresymatrices;
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
    Dibuja un circulo pidiendo coordenadas centro.
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


import java.util.Scanner;


public class DibujaFiguras {
	
	static Scanner teclado=new Scanner(System.in);
	
	
	//dibujar cuadrado
	static char[][] dibujaCuadrado(char caracter){
		char[][] pantalla=pantalla();
		System.out.println("Dame coordenada i: ");
		int ci=teclado.nextInt();
		System.out.println("Dame coordenada j: ");
		int cj=teclado.nextInt();
		System.out.println("Introduce el tama�o del cuadrado: ");
		int tama�o=teclado.nextInt();
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=cj && j<tama�o+cj))||((i==ci+tama�o) && (j>=cj && j<=tama�o+cj))||
						(i>=ci && i<ci+tama�o && (j==cj||j==cj+tama�o))){
					pantalla[i][j]=caracter;
				}
			}
		}
		return pantalla;
	}
	
	//dibujar rectangulo
	static char[][] dibujaRectangulo(char caracter){
		char[][] pantalla=pantalla();
		System.out.println("Dame coordenada i: ");
		int ci=teclado.nextInt();
		System.out.println("Dame coordenada j: ");
		int cj=teclado.nextInt();
		System.out.println("Introduce el largo del rectangulo: ");
		int largo=teclado.nextInt();
		System.out.println("Introduce la altura del rectangulo: ");
		int altura=teclado.nextInt();
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=cj && j<largo+cj))||((i==ci+altura) && (j>=cj && j<=largo+cj))||
						(i>=ci && i<ci+altura && (j==cj||j==cj+largo))){
					pantalla[i][j]=caracter;
				}
			}
		}
		return pantalla;
	}
	//dibujar triangulo
	static char[][] dibujaTriangulo(char caracter){
		char[][] pantalla=pantalla();
		System.out.println("Dame coordenada i: ");
		int ci=teclado.nextInt();
		System.out.println("Dame coordenada j: ");
		int cj=teclado.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		int altura=teclado.nextInt();
		int c=0;
		for(int i=0;i<pantalla.length;i++){
			boolean contar=false;
				for(int j=0;j<pantalla[i].length;j++){
					if(i>=ci && i<ci+altura){
							if(j<=cj+c && j>=cj-c){
								pantalla[i][j]=caracter;
								contar=true;
							}
					}
				}
				if(contar==true){
					c++;
				}
		}
		return pantalla;
	}
	public static char[][] dibujarCirculo(char caracter) {
		char[][] pantalla=pantalla();
		System.out.println("Dame coordenada x: ");
		int xc=teclado.nextInt();
		System.out.println("Dame coordenada y: ");
		int yc=teclado.nextInt();
		System.out.println("Introduce el radio: ");
		int r=teclado.nextInt();
		
	// Punto inicial del c�rculo 1
        int x = 0;
        int y = r;
        // C�lcular el par�metro inicial de decisi�n
        int pk = 1-r;
        
        // verificar el pk para determinar las posiciones de pixel siguuientes
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc+x][yc+y]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     // Punto inicial del c�rculo 2
        x = 0;
        y = r;
      // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc-x][yc-y]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     // Punto inicial del c�rculo 3
        x = 0;
        y = r;
      // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc+x][yc-y]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     
     // Punto inicial del c�rculo 4
        x = 0;
        y = r;
      // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc-x][yc+y]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
       // Punto inicial del c�rculo 5
        x = 0;
        y = r;
       // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        
        // verificar el pk para determinar las posiciones de pixel siguuientes
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc+y][yc+x]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     // Punto inicial del c�rculo 6
        x = 0;
        y = r;
       // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        
        // verificar el pk para determinar las posiciones de pixel siguuientes
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc-y][yc-x]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     // Punto inicial del c�rculo 7
        x = 0;
        y = r;
       // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        
        // verificar el pk para determinar las posiciones de pixel siguuientes
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc-y][yc+x]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
     // Punto inicial del c�rculo 8
        x = 0;
        y = r;
       // C�lcular el par�metro inicial de decisi�n
        pk = 1-r;
        
        // verificar el pk para determinar las posiciones de pixel siguuientes
        while (x<=y)
        {
            System.out.println("(x,y)= "+x+","+y+" pk="+pk);
            pantalla[xc+y][yc-x]=caracter;
            if (pk<0){
                pk+=2*(x+1)+1;
                x++;
            }
            else // pk>=0
            {
                pk+=2*(x+1)+1 - 2*(y-1);
                x++;
                y--;
            }
        }
        
		return pantalla;
    }

	//crea pantalla de astriscos con medidas dadas por teclado
	static char[][] pantalla(){
		
		System.out.println("Introduce el alto de la pantalla: ");
		int alto=teclado.nextInt();
		System.out.println("Introduce el ancho de la pantalla: ");
		int ancho=teclado.nextInt();
		char[][] matriz=new char[alto][ancho];
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
					matriz[i][j]='*';
				}
		}
		return matriz;
		
	}
	//imorime pantalla
	static void imprime(char[][] pantalla){
		
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				System.out.print((char)pantalla[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	//elegir un caracter que queramos en opcion1 y que se pasara como parametro a los metodos que crean figuras
	static char elegirCaracter(){
		System.out.println("Elige un caracter: ");
		String car=teclado.next();
		char caracter=car.charAt(0);
		return caracter;
	}
	
	static void menu(){
		
		int opcion;
		char caracter='@';
		char[][]pantalla= new char[0][0];;
		do{
			
			System.out.println("MENU");
			System.out.println("0. Salir.");
			System.out.println("1. Elegir caracter: ");
			System.out.println("2. Dibuja cuadrado: ");
			System.out.println("3. Dibuja rectangulo: ");
			System.out.println("4. Dibuja triangulo: ");
			System.out.println("5. Dibuja circulo pidiendo centro: ");
			System.out.println("6.Imprime pantalla: ");
			System.out.println("Elige una opci�n: ");
			opcion=teclado.nextInt();
			switch (opcion){
			
			case 1:
				caracter=elegirCaracter();
				break;
			case 2:
				pantalla=dibujaCuadrado(caracter);
				break;
			case 3:
				pantalla=dibujaRectangulo(caracter);
				break;
			case 4:
				pantalla=dibujaTriangulo(caracter);
				break;
			case 5:
				pantalla=dibujarCirculo(caracter);
				break;
			case 6:
				imprime(pantalla);
				break;
			}
		}while(opcion!=0);
	}
	public static void main(String[] args) {
		menu();
	}

}
