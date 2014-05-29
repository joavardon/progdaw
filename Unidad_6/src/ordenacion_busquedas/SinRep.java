package ordenacion_busquedas;

import java.util.Random;
import java.util.Scanner;

public class SinRep {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] v_original=new int [10];
        int[] v_aux=new int [10];
        int[] v_final=new int[10];
        int cont,num,i,j=0,k,z=0 ;
        //valores del array 
        for (i=0; i<10; i++) {
        		
                System.out.println("Introduce el valor del array incial: ");
                v_original[i]=teclado.nextInt();
        }


        for (i=0;i<10;i++) {
                cont=0;
                num=v_original[i];
                v_aux[j]=num;
                j++;
                for (k=0;k<10;k++){
                        if ( v_aux[k] == num ){
                                cont++;}
                        }

                if ( cont == 1 ) {
                        v_final[z]=num;
                        z++;
                }
        }


        System.out.println("El array simplificado es: \n");
        for (i=0;i<z;i++)
                System.out.println(v_final[i]);

       

	}

}
