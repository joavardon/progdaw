package ordenacion_busquedas;

import java.util.Scanner;

public class SinRep2 {

	public static void eliminar(int a[]){
        int val=-1;
        int aux[]=new int[a.length];
        for(int i=0; i<a.length;i++) { //copiamos los elementos de a aux.
                  aux[i]=a[i];
        }
        /*Buscamos Datos Repetidos y si los hay*/
        /*se remplaza su posición por val     */
        for(int i=0;i<(a.length-1);i++)
                  for(int j=i+1;j<a.length;j++){
                              if(aux[i]==aux[j])
                                         aux[i]=val;
                  }

         int j=0;
         for(int i=0;i<aux.length;i++){
                   if(aux[i]!=val){
                              a[j]=aux[i];
                               j++;
                  }
         }

 

         for(int K=j;K<a.length;K++){
                   a[K]=0;
         }
         
      }


public static void main(String[] args) {

Scanner in=new Scanner(System.in);

int i,n,j,k;

int[] A=new int[5];



for(i=0;i<5;i++){
System.out.print("ingrese valores ");

A[i]=in.nextInt();

}

eliminar(A);

for(i=0;i<A.length;i++){
	if(A[i]!=0)
			System.out.println(A[i]);}

	}
}
