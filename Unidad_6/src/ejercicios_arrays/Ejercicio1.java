 /*Realiza un programa que calcule los 6 números para rellenar una quiniela primitiva 
 controlando que no se repita ninguno de ellos.*/
package ejercicios_arrays;

public class Ejercicio1 {

	public static void ganadores(int[]numeros){
		int c=0;//contador de numeros elegidos al azar
		
		do{//hacer, mientras no llegue a ser el contador(numeros a elegir al azar)
			boolean noesta=true;//no esta en principio el numero que sacamos
		
			int numero=(int)(Math.random()*50+1);//se elige un numero al azar
			
			for(int j=0;j<numeros.length;j++){//se busca en los valores del array
						/*if(numeros[j]!=numero){//si no esta, no esta pasa a ser true
							noesta=true;
							}*/
						if(numeros[j]==numero){//si algun valor del array es igual al numero, entonces es false y no hay que seguir mas con el for
							noesta=false;
							break;}
			}
			//si es true, el numero es el valor del array por el que vaya el contador e incrementamos el contador
			if(noesta==true){
				numeros[c]=numero;
					c++;}
					
			}while(c<6);
}
	
public static void imprimir(int[]numeros){
		for(int i=0;i<numeros.length;i++){
			System.out.println(numeros[i]);
		}
	}
public static void main(String[] args) {
		int[]numerosganadores=new int[6];
		Ejercicio1.ganadores(numerosganadores);
		Ejercicio1.imprimir(numerosganadores);
	}

}
