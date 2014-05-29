package vectoresymatrices;
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
    Dibuja un circulo pidiendo coordenadas centro.
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
		System.out.println("Introduce el tamaño del cuadrado: ");
		int tamaño=teclado.nextInt();
		for(int i=0;i<pantalla.length;i++){
			for(int j=0;j<pantalla[i].length;j++){
				if(((i==ci) && (j>=cj && j<tamaño+cj))||((i==ci+tamaño) && (j>=cj && j<=tamaño+cj))||
						(i>=ci && i<ci+tamaño && (j==cj||j==cj+tamaño))){
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
		
	// Punto inicial del círculo 1
        int x = 0;
        int y = r;
        // Cálcular el parámetro inicial de decisión
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
     // Punto inicial del círculo 2
        x = 0;
        y = r;
      // Cálcular el parámetro inicial de decisión
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
     // Punto inicial del círculo 3
        x = 0;
        y = r;
      // Cálcular el parámetro inicial de decisión
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
     
     // Punto inicial del círculo 4
        x = 0;
        y = r;
      // Cálcular el parámetro inicial de decisión
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
       // Punto inicial del círculo 5
        x = 0;
        y = r;
       // Cálcular el parámetro inicial de decisión
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
     // Punto inicial del círculo 6
        x = 0;
        y = r;
       // Cálcular el parámetro inicial de decisión
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
     // Punto inicial del círculo 7
        x = 0;
        y = r;
       // Cálcular el parámetro inicial de decisión
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
     // Punto inicial del círculo 8
        x = 0;
        y = r;
       // Cálcular el parámetro inicial de decisión
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
			System.out.println("Elige una opción: ");
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
