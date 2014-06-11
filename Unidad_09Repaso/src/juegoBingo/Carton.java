package juegoBingo;

import java.util.HashSet;
import java.util.Random;

public class Carton {
	private int[][] numeros;
	private boolean[][] marcados;
	
	public Carton() {
		numeros=new int[3][9];
		marcados=new boolean[3][9];
	}
	
	public void rellenaAleatorio() {
		Random rand = new Random();
		for(int i=0;i<9;i++){
			HashSet<Integer> columna=new HashSet<Integer>();
			for(int j=0;j<3;j++) {
					int bola;
					if (i==0) 
						bola=rand.nextInt(9) + 1;
					else if (i==8)
						bola=rand.nextInt(11) + i*10;
					else
						bola=rand.nextInt(10) + i*10;
					if (columna.contains(bola))
						j--;
					else {
						numeros[j][i]=bola;
						marcados[j][i]=false;
						columna.add(bola);
					}
			}
		}
	}
	
	public void setNumero(int i, int j, int k) {
		numeros[j][i]=k;
	}
	
	public void marca(int i, int j) {
		marcados[j][i]=true;
	}
	
	public boolean marca(int bola) {
		
		for(int j=0;j<3;j++){
			for(int i=0;i<9;i++) {
				if (numeros[j][i]==bola) {
					marcados[j][i]=true;
					return true;
				}
			}
		}
				
		return false;
	}
	
	public String toString() {
		StringBuilder carton=new StringBuilder();
		
		for(int j=0;j<3;j++){
			for(int i=0;i<9;i++) {
				if (marcados[j][i])
					carton.append(String.format("%2dX ", numeros[j][i]));
				else
					carton.append(String.format("%2d  ", numeros[j][i]));
			}
			carton.append("\n");
		}
		
		return carton.toString();
	}
	
	public boolean esBingo() {
		boolean bingo=true;
		for(int j=0;j<3 && bingo;j++){
			for(int i=0;i<9 && bingo;i++) {
				if (!marcados[j][i]) bingo=false;
			}
		}
		
		return bingo;
	}
	
	public static void main(String[] args) {
		Carton c;
		
		c=new Carton();
		
		c.rellenaAleatorio();
		c.marca(17);
		c.marca(25);
		c.marca(57);
		
		System.out.println(c);
	}
}
