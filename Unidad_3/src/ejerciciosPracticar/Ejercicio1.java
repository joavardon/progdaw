//Lee un número por consola y comprueba si es palíndromo (capicúa).
//Pista: si creas un número con los dígitos en orden inverso al leido, 
//y al compararlos resulta que son iguales, será capicúa.


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
