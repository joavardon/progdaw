package EjerciciosAngel;

public class SumaComplejos {

	
	
	private static Complejo sumatorio(Complejo[] numeros) {
		Complejo sumatorio=new Complejo();
		
		for(int i=0;i<numeros.length;i++) sumatorio.suma(numeros[i]);
		
		return sumatorio;
	}
	
	private static Complejo[] crearVector(int num_eltos) {
		Complejo[] vector;
		
		vector=new Complejo[num_eltos];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=new Complejo(5,5);
		}
		
		return vector;
	}
	
	public static void main(String[] args) {
	
		Complejo vector[];
		
		vector = crearVector(40);
			
		System.out.println("Sumatorio: " + sumatorio(vector));
	}

}



