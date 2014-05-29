package vectoresymatrices;

import java.util.Scanner;

public class Nota2 {

//4,7,3,2
	public static void main(String[] args) {
		int[][]notas;
		notas=new int[4][];
		
		notas[0]=new int[4];
		notas[1]=new int[7];
		notas[2]=new int[3];
		notas[3]=new int[2];
		/*
		notas[0][0]=10;
		notas[0][1]=9;
		notas[0][2]=8;
		notas[0][3]=7;
		
		notas[1][0]=6;
		notas[1][1]=5;
		notas[1][2]=4;
		notas[1][3]=7;
		notas[1][4]=6;
		notas[1][5]=7;
		notas[1][6]=5;
		
		notas[2][0]=6;
		notas[2][1]=7;
		notas[2][2]=8;
		
		notas[3][0]=9;
		notas[3][1]=8;
		*/
		int nota;
		for(int i=0;i<notas.length;i++){
			
			for(int j=0;j<notas[i].length;j++){
				Scanner teclado=new Scanner(System.in);
				System.out.println("nota del alumno "+(i+1)+" en la asignatura " +(j+1)+": ");
				
				nota=teclado.nextInt();
				notas[i][j]=notas[i][j];
			}
			System.out.println();
		}

	}

}
