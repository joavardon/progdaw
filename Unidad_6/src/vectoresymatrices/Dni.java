/*
 Escribe un programa que obtenga la letra del DNI. 
 El procedimiento para obtener la letra consiste en dividir el número del DNI por 23. 
 La parte entera del resultado obtenido se multiplica por 23. Seguidamente, 
 al DNI original se le resta el último resultado obtenido. 
 Como resultado final de esta última operación dará un número 
 que estará siempre comprendido entre 0 y 23. 
 Según el valor de este último, se aplicará la siguiente tabla: 
 0=T 1=R 2=W 3=A 4=G 5=M 6=Y 7=F 8=P 9=D 10=X 11=B 12=N 13=J 
 14=Z 15=S 16=Q 17=V 18=H 19=L 20=C 21=K 22=E 23=O
 */
package vectoresymatrices;

import java.util.Arrays;
import java.util.Scanner;

public class Dni {

	
	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe el DNI: ");
		int dni=teclado.nextInt();
		
		float paso1=dni/23;
		/*
		String paso2=Float.toString(paso1);
		System.out.println(paso2);
		int delimitador = 0;
		System.out.println(paso2.length());
		for(int i=0;i<paso2.length();i++){
			if(paso2.charAt(i)=='.'){
				delimitador=i;
			}
		}
		String paso3=paso2.substring(0, delimitador);
		System.out.println(paso3);
		int paso4=Integer.parseInt(paso3);
		System.out.println("entero"+paso4);
		int paso5=paso4*23;
		System.out.println(paso5);
		float paso6=dni-paso5;
		System.out.println(paso6);
		int paso7=(int) (paso6);*/
		
		int paso2=(int)paso1;
		int paso3=paso2*23;
		int paso4=dni-paso3;
		String[] letra={"T","R","W","A","G","M","Y","F","P","D","X",
				"B","N","J","Z","S","Q","V","H","L","C","K","E","O"};
		for(int i=0;i<letra.length;i++){
			if(paso4==i){
				System.out.println(letra[i]);
			}
		}
		/*
		switch(paso7){
	
		case 0:
			System.out.println("T");
			break;
		case 1:
			System.out.println("R");
			break;
		case 2:
			System.out.println("W");
			break;
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("G");
			break;
		case 5:
			System.out.println("M");
			break;
		case 6:
			System.out.println("Y");
			break;
		case 7:
			System.out.println("F");
			break;
		case 8:
			System.out.println("P");
			break;
		case 9:
			System.out.println("D");
			break;
		case 10:
			System.out.println("X");
			break;
		case 11:
			System.out.println("B");
			break;
		
		case 12:
			System.out.println("N");
			break;
		case 13:
			System.out.println("J");
			break;
		case 14:
			System.out.println("Z");
			break;
		case 15:
			System.out.println("S");
			break;
		case 16:
			System.out.println("Q");
			break;
		case 17:
			System.out.println("V");
			break;
		case 18:
			System.out.println("H");
			break;
		case 19:
			System.out.println("L");
			break;
		case 20:
			System.out.println("C");
			break;
		case 21:
			System.out.println("K");
			break;
		case 22:
			System.out.println("E");
			break;
		case 23:
			System.out.println("O");
			break;
		
		}
		
		*/
		/*
		String  dni=teclado.next();
		int[]midni=new int[8]; 
		
		for(int i=0;i<dni.length();i++){
			midni[i]=dni.charAt(i);
		}
		for(int i=0;i<midni.length;i++){
		System.out.print((char)(midni[i]));
		}
		*/
		


	}

}
