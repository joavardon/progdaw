package simulacro;
import java.util.Arrays;


public class ArrayOrdenado2 {

	int[] numeros;
	
	private void ordenar() {
		Arrays.sort(numeros);
	}
	
	public ArrayOrdenado2(int[] vector) {
		numeros=Arrays.copyOf(vector, vector.length);
		ordenar();
	}
	
	public ArrayOrdenado2(int tamaño) {
		numeros=new int[tamaño];
		Arrays.fill(numeros, 0);
	}
	
	public int getElemento(int x) {
		return numeros[x];
	}
	
	public void setElemento(int x, int elto) {
		numeros[x]=elto;
		ordenar();
	}
	
	public String toString() {
		return Arrays.toString(numeros);
	}
	
	public static void main(String[] args) {
		ArrayOrdenado2 x;
		
		x=new ArrayOrdenado2(100);
		
		for(int i=0;i<100;i++) {
			x.setElemento(i,(int)(Math.random()*100+1));
		}
		
		System.out.println(x);
	}

}
