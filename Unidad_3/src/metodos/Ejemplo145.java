package metodos;

public class Ejemplo145 {

	
	public static void main(String[] args) {
	int[]prueba={1,2,3,4,5};
	imprime(prueba);
	//imprime(prueba);
	String frase="Hola cadena";
//añadePunto(frase);
	
	frase=añadePunto(frase);
	System.out.println(frase);

	}
	//public static String nombre;
	//metodo que recibe un array de enteros y devuelve el array
	
	public static void imprime(int[]vector){
		System.out.print("[");
		for(int i=0;i<vector.length-1;i++){
			System.out.print(vector[i] + ", ");
		}
		System.out.print(vector[vector.length-1] + "]");
		//System.out.println(nombre);
	}
		
		//vector[0]++;
		
	//metodo 
		
	public static String añadePunto(String frase){
		if(frase.charAt(frase.length()-1)!='.'){
			return frase+".";}
		else{
			return frase;}
	}
	
	
}
