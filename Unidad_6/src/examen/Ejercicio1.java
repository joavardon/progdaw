package examen;

import java.util.Arrays;

public class Ejercicio1 {
	public static int[] repetidos(int[]arr){
		 int[]array=Arrays.copyOf(arr,arr.length);
		 int tama�o=array.length;
		 int []arrayRepetidos=new int[tama�o];
		 int c=0;
		//quitar no repetidos(los mando al final los no repes y dejo el tama�o decrementandolo para que coja solo  los repetidos) y crear array con el nuevo tama�o
		 for(int i=0;i<tama�o;i++){
			 int rep=0;
			 for(int j=0;j<tama�o;j++){
				 if(array[i]==array[j]){
					 rep++;
				 }
				 
			 }
			 
			 if(rep>1){
				 arrayRepetidos[c]=array[i];
				 c++;
				
			 }
			 else{
				 
				 int aux=array[tama�o-1];
				 array[tama�o-1]=array[i];
				 array[i]=aux;
				 tama�o--;
				 i--;
			 }
			 
		 }
		
		 int[]f=new int[tama�o];
		 for(int i=0;i<tama�o;i++){
			 f[i]=arrayRepetidos[i];
		 }
		 //quitar duplicados y crear array final de tama�o final
		 for(int i=0;i<tama�o;i++){
			 int rep=0;
			 for(int j=0;j<tama�o;j++){
				 if(f[i]==f[j] && rep==0){//si es la primera vez que esta el valor 
					 rep++;
				 }
				 else if(rep>0 && f[i]==f[j]){//si ya se ha repetido, j pasa al ultimo y el ultimo a su posicion y decremento j y tama�o
					 int aux=f[tama�o-1];
					 f[tama�o-1]=f[j];
					 f[j]=aux;
					 tama�o--;
					 j--;
				 }
			 }
			 
		 }
		 int[]f2=new int[tama�o];
		 
		 for(int i=0;i<tama�o;i++){
			 f2[i]=f[i];
		 }
		return f2;
		
	}
	
	public static void main(String[] args) {
		int[]num={1,2,5,5,3,3,3,4,4,5,6,7,9,5,6,7,8,6,4,3,4,5,6,8};
		int[]repes=repetidos(num);
		System.out.println(Arrays.toString(repes));
		Arrays.sort(repes);
		System.out.println(Arrays.toString(repes));
		

	}

}
