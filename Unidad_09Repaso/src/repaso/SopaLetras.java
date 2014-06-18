package repaso;

import java.util.Scanner;

public class SopaLetras {
	public static int letraAleatoria(int tamañoChars){
		int aleatoria=(int)(Math.random()*(tamañoChars-1));
		return aleatoria;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String escondida="ALCAHUETA";
		int tamX,tamY;
		do{
		System.out.println("Ancho: ");
		tamX=teclado.nextInt();
		System.out.println("Alto: ");
		tamY=teclado.nextInt();}
		while(tamX<escondida.length());
		
		String[]chars={"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
				"Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int tamañoChars=chars.length;
		
		char[] esc = escondida.toCharArray();
		int aleatoria;
		
		int escondidaX=(int)(Math.random()*(tamX-escondida.length()));//aleatorio entre 0 al 4, 
																//controla que la palabra entre en la linea
		int escondidaY=(int)(Math.random()*(tamY));//aleatorio 0 al 9,control linea donde ira la palabra
		System.out.println("ex: "+escondidaX);
		System.out.println("ey: "+escondidaY);
		
		int cont = -1;
		
		for (int i=0;i<tamY;i++){
		    for (int j=0;j< tamX;j++){
		        if (i==escondidaY){
		            if (j<escondidaX || j>=(escondidaX+escondida.length())){
		            	aleatoria=letraAleatoria(tamañoChars);
			        	System.out.print(chars[aleatoria]+" ");}
		            else{
		            	System.out.print(esc[++cont]+" "); } 
		        }
		        else{  
		        	aleatoria=letraAleatoria(tamañoChars);
		        	System.out.print(chars[aleatoria]+" "); } 
		    }
		    System.out.println();
		}
	
	}
}
