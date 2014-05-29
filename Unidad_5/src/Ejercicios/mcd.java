package Ejercicios;

public class mcd {

	
	public static void main(String[] args) {
		int dividendo,divisor;
		dividendo=10;
		divisor=5;
		simplificar(dividendo,divisor);

	}
	private static void simplificar(int dividendo,int divisor){
		for(int i=dividendo;i>=2;i--){
			for(int j=dividendo-1;j>=2;j--){
				if(dividendo%i==0 && divisor%i==0){
					dividendo=i;
					divisor=divisor/i;
				}
			}
		}
		System.out.println(dividendo+"/"+divisor);
	}

}
