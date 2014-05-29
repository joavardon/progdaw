/*    Escribe un programa que cree estas figuras:

*
**
***
****

   *
  **
 ***
****

   *
  ***
 *****
******* 
*/

package ejerciciosPracticar;

public class Ejercicio3 {


	public static void main(String[] args) {
		int cont=1;
		for(int i=0;i<4;i++){
			
			for(int j=0;j<cont;j++){
					System.out.print("*");
					
				}
		
			System.out.println();
			cont++;
					}
		
		
		System.out.println();
		
		int cont2=4;
		for(int i=0;i<4;i++){
			
			for(int j=0;j<cont2;j++){
					System.out.print("*");
					
				}
		
			System.out.println();
			cont2--;
					}
		int elim=3;
		int elim2=3;
		
		for (int k=0;k<4;k++){
			for(int j=0;j<7;j++){
				
				if (j<=elim && j>=elim2){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
				
			}
			System.out.println();
			elim++;
			elim2--;
		}
	
	}
	
	

}
