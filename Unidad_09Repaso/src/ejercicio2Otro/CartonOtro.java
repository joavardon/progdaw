package ejercicio2Otro;

import java.util.HashSet;
import java.util.TreeSet;


public class CartonOtro {
	private int[][]carton;
	private HashSet<Integer>tachados;

	CartonOtro(){
		this.carton=new int[3][9];
		this.tachados=new HashSet<Integer>();
	}

	public boolean estaEnColumna(int n,int[][] c,int j){
		boolean esta=false;
		int con=0;
		for(int i=0;i<3 && esta==false;i++){
				if(c[i][j]==n){
					con++;
					if(con==1){
						esta=true;
					}
			}
		}
		return esta;
	}
	public void rellenaAleatorio(){
		int n;
		for(int i=0;i<3;i++){
			int numIni=1;
			int numFin=9;
			for(int j=0;j<9;j++){
				do{
					n=(int)(Math.random()*(numFin-numIni+1)+numIni);
				}while(estaEnColumna(n,this.carton,j)==true);

				this.carton[i][j]= n;
				numIni=numIni+10;
				numFin=numFin+10;
			}	
		}
	}
	public String toString(){
		String cadena="";
		for(int i=0;i<this.carton.length;i++){
			for(int j=0;j<this.carton[i].length;j++){
				cadena=cadena+ this.carton[i][j]+"    ";
			}
			cadena=cadena+"\n";
		}
		return cadena;
	}

	public void marca(int x,int y){
		String cadena="";
		for(int i=0;i<this.carton.length;i++){
			for(int j=0;j<this.carton[i].length;j++){
				if(tachados.contains(carton[i][j])){
				cadena=cadena+ this.carton[i][j]+"X   ";}
				else{
					cadena=cadena+ this.carton[i][j]+"    ";}
				}
			cadena=cadena+"\n";
			}
			System.out.println(cadena);
		}


	public void marca(int bola){
		//boolean esta=false;
		for(int i=0;i<this.carton.length;i++){
		for(int j=0;j<this.carton[i].length;j++){
			if(this.carton[i][j]==bola){
			//	esta=true;
				this.tachados.add(bola);
				if(esBingo()){
				marca(i,j);}
			}
		}

	}/*
		if(esta==false){
			System.out.println("El numero "+bola+" no esta");
		}
		else{
			System.out.println("El numero "+bola+" sí esta");
		}
		*/
	}
	public boolean esBingo() {
		boolean esBingo = false;
		if(this.tachados.size()==27){
			esBingo=true;
		}
		return esBingo;
	}

	public int[][] getCarton() {
		return carton;
	}

	public void setCarton(int[][] carton) {
		this.carton = carton;
	}

	public HashSet<Integer> getTachados() {
		return tachados;
	}

	public void setTachados(HashSet<Integer> tachados) {
		this.tachados = tachados;
	}


}
