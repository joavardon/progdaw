//Lee un n�mero por consola y comprueba si es pal�ndromo (capic�a).
//Pista: si creas un n�mero con los d�gitos en orden inverso al leido, 
//y al compararlos resulta que son iguales, ser� capic�a.


package ejerciciosPracticar;


import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
        int numero=4884;
        String num=Integer.toString(numero);
        System.out.println("num es "+num);
        String num2="";
        
        for(int i=num.length()-1;i>=0;i--){
        	num2=num2+ num.charAt(i);
        	//System.out.print(num2);
        	 
        }
        
        
        if (num2.equals(num)){
         	System.out.println("ES CAPICUA");
         }
         else{
         	System.out.println("no ES CAPICUA");
         }
        
        
       
	}

}
