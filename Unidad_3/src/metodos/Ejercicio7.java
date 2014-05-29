/*Escribe un método llamado ordenado, que tome un vector de enteros como parámetro y devuelva true si 
el vector (todos sus elementos) está ordenado ascendentemente, o false en caso contrario.*/
package metodos;

public class Ejercicio7 {
	public static void main(String[] args) {
	int[] enteros=new int[5];
	enteros[0]=7;
	enteros[1]=17;
	enteros[2]=27;
	enteros[3]=7;
	enteros[4]=87;
	System.out.println(ordenado(enteros));
	}
	public static boolean ordenado(int[]enteros){
		
		for(int i=1;i<enteros.length;i++){
			if(enteros[i]<enteros[i-1]){
				return false;
			}
		}
		return true;
		
	}
}
