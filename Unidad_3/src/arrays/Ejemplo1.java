package arrays;

import java.util.Arrays;

public class Ejemplo1 {

	
	public static void main(String[] args) {
		int[] enteros;
		enteros=new int [10];
		
		for(int i=0;i<10;i++){
			enteros[i]=i;}
		

		for(int i=0;i<10;i++){
			System.out.print(enteros[i]);}
			
			System.out.println();
			System.out.println(Arrays.toString(enteros));
		}

}
