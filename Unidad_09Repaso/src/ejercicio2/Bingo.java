package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;


public class Bingo {
	private ArrayList<Integer>bombo;
	
	Bingo(ArrayList<Integer>b){
		this.bombo=b;
	}
	public int saca(){
		int numeroSacado=-1;;
		do{
			numeroSacado=(int)(Math.random()*90+1);
			Iterator<Integer>ite=this.bombo.iterator();
			while(ite.hasNext()){
				int valor=ite.next();
				if(numeroSacado==valor ){
					ite.remove();
				}
			}
		}while(haSalido(numeroSacado));
		
		return numeroSacado;
	}
	
	public boolean haSalido(int bola){
		boolean haSalido=false;
		if(this.bombo.contains(bola)){
			haSalido=true;
		}
		return haSalido;
	}
	
	public  boolean quedanBolas(){
		boolean quedan=true;
		if(this.bombo.size()==0){
			quedan=false;
		}
		else{
			quedan=true;
		}
		
		return quedan;
	}
	
	public String toString(){
		String cadena="";
		for(int i=0;i<this.bombo.size();i++){
				cadena=cadena+ this.bombo.get(i)+" ";
			}
		return cadena;
	}
	public ArrayList<Integer> getBombo() {
		return bombo;
	}
	public void setBombo(ArrayList<Integer> bombo) {
		this.bombo = bombo;
	}
	
	
	
	
}
