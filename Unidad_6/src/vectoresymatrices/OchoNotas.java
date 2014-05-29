 /*Escribe un programa que pida 8 notas. El programa debe visualizar cuál es la nota más alta, 
 luego la siguiente, y así sucesivamente.
 Si hay alguna nota repetida, se visualizará solo una vez.*/
package vectoresymatrices;

import java.util.Scanner;

public class OchoNotas {

	
	public static void main(String[] args) {
		float[] notas=new float[8];
	
		for(int i=0;i<notas.length;i++){
			Scanner teclado=new Scanner(System.in);
			System.out.println("Nota: ");
			float nota=teclado.nextFloat();
			notas[i]=nota;
			
		}
		int numelem;
		float aux;
		numelem=notas.length;
		for(int i=1;i<numelem;i++){
			for(int j=i+1;j<numelem;j++){
			
				if(notas[i]>notas[j]){
					aux=notas[i];
					notas[i]=notas[j];
					notas[j]=aux;
				}
			
			
			}
		}
		
		for(int i=numelem-1;i>0;i--){//le doy la vuelta para que vaya de mayor a menor
			if(i != numelem-1){//quito las que se repitan de mayor a menor
				if(notas[i]==notas[i+1]){
				}
				else{
					System.out.println("La siguiente es: "+notas[i]);
				}
			}
			else{//la primera será la más alta
					System.out.println("La nota más alta es: "+notas[i]);
			}
		}
	}

}
