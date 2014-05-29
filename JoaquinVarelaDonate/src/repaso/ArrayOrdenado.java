package repaso;

import java.util.Arrays;


public class ArrayOrdenado {

	int[]array;
	ArrayOrdenado(int[]a){
		this.array=a;
		Arrays.sort(this.array);
	}
	ArrayOrdenado(int t){
		this.array=new int[t];
		Arrays.fill(array, 0);
		
	}
	public int getElemento(int x){
		
		return this.array[x];
		
	}
	public void setElemento(int x, int elto){
		
		this.array[x]=elto;
		Arrays.sort(this.array);
		
		
	}
	public String toString(){
		
		return Arrays.toString(array);
	}
	
}
