/*1. Crear un método llamado Comprobarcuenta al que pasemos una cadena que contiene un 
número de cuenta con el formato:"2077-0024-00-3102575766"
y devuelva true o false si el numero de control es correcto o no.*/
package repaso;

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		String cuenta="2077-0024-00-3102575766";
		int[] pesos={4,8,5,10,9,7,3,6};
		int[] pesosdos={1,2,4,8,5,10,9,7,3,6};
		String ce=cuenta.substring(0, 4)+cuenta.substring(5, 9);
		String ce2=cuenta.substring(13,23);
		int[] valores=new int[8];
		int[] valores2=new int[10];
		
		for(int i=0;i<valores.length;i++){
			valores[i]=Integer.parseInt(""+ce.charAt(i));}
			
		int suma=0;
		for(int j=0;j<valores.length;j++){
			suma=suma+(valores[j]*pesos[j]);}
		int modulo=suma%11;
		int digControl=11-modulo;
		if  (digControl >=10) 
		     digControl=11-digControl;
		
		int suma2=0;
		for(int k=0;k<valores2.length;k++){
			valores2[k]=Integer.parseInt(""+ce2.charAt(k));}
		for(int j=0;j<valores2.length;j++){
			suma2=suma2+(valores2[j]*pesosdos[j]);}
		int modulo2=suma2%11;
		int digControl2=11-modulo2;
		if  (digControl2 >=10){
		       digControl2=11-digControl2;}
		
		
		System.out.println("Los digitos de control son: ");
		System.out.print(digControl);
		System.out.print(digControl2);

		
	}

}
