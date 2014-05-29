/*Escribe un método que tome un vector de números y devuelva la suma acumulativa; 
esto es, un nuevo vector en el que cada elemento contiene la suma de todos los elementos anteriores. 
Por ejemplo, la suma acumulativa de [1, 2, 3] es [1, 3, 6].*/
package metodos;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] enteros=new int[3];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=3;
		int[] suma2 =SumaAcumulativa(enteros);
		
		for(int i=0;i<suma2.length;i++){
			System.out.print(suma2[i]+" ");
		}
	}
	
	public static int[] SumaAcumulativa(int[]ent){
		int[] suma =new int[3];
		int sumaAcumulada=0;
		for(int i=0;i<ent.length;i++){
			suma[i]=sumaAcumulada+ent[i];
			sumaAcumulada=suma[i];
		}
		return suma;	
	}
}
