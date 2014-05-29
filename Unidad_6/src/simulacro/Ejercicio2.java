package simulacro;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	public static int aleatorio(int min,int max){
		int aleatorio;
		aleatorio=(int)(Math.random()*((max-min)+1))+min;
		return aleatorio;
	}*/
	static double[][] creaMatriz(double tamaño,double p){
		
		double[][]matriz=new double[(int) tamaño][(int) tamaño];
		//relleno con ceros
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j]=0;
			}
		}
		//relleno con numeros de 0 a 1 hasta que sea igual que el porcentaje
		double n = 1;
		double r;
		for(r=((n*100)/(tamaño*tamaño))/100;r<=p;){
			int i=(int)(Math.random()*tamaño);
			int j=(int)(Math.random()*tamaño);
			if(matriz[i][j]==0){
				double noCero=(double)(Math.random());
				matriz[i][j]=noCero;
				n++;
				r=((n*100)/(tamaño*tamaño))/100;
			}
		}
		return matriz;
	}
	static void  imprimeMatriz(double[][]matriz){
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.printf("%.2f %s",matriz[i][j]," ");	
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tamaño: ");
		double tamaño=teclado.nextInt();
		System.out.println("Introduce el porcentaje de elementos a 0: ");
		double porcentaje=teclado.nextFloat();
		double p=porcentaje/100;
		double[][] matriz=creaMatriz(tamaño,p);
		imprimeMatriz(matriz);
		
	}

}
