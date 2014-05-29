/*Visualizar los 15 primeros números naturales del 15 al 1.
Primero utilizar una estructura while, luego una for.*/
package bucles;

public class QuinceNumeros {

	
	public static void main(String[] args) {
		int numero=15;
		do{
			System.out.println(numero);
			numero=numero-1;
			
		}while(numero!=0);
		
		for(int i=15;i>0;i--){
			System.out.println(i);
		}
	}

}
