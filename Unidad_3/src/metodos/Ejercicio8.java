/*Escribe una función tiene_duplicados(vector) que tome un vector de cadenas 
y devuelva verdadero si algún elemento aparece más de una vez. 
La función no modificará el vector.*/
package metodos;

public class Ejercicio8 {


	public static void main(String[] args) {
		String[] dupli=new String[5];
		dupli[0]="Hola";
		dupli[1]="amigo";
		dupli[2]="como te llamas";
		dupli[3]="cual es tu edad";
		dupli[4]="Holassss";
		System.out.println(tiene_duplicados(dupli));
	}
	public static boolean tiene_duplicados(String[]dupli){
		boolean duplicados=false;
		fuera:
		for(int i=0;i<dupli.length;i++){
			for(int j=i+1;j<dupli.length;j++){
				if(dupli[i].equals(dupli[j])){
					duplicados=true;
					break fuera;
				}
				else{
					duplicados=false;
					
				}
			}
		}
		
		
		return duplicados;
		
	}

}
