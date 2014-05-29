package actividad4;

public class SumaComplejosOtro {
	
	 public static double aleatorio10(){
		double aleatorio=Math.random()*10;
		return aleatorio;
		
	}
	
	private static Complejo sumatorio(Complejo[]n){
		
		Complejo sumas = new Complejo();
		for (int i=0;i<n.length;i++){
		
		sumas.Suma(n[i]);
		}
		
		return sumas;
		
	}
	
	public static void main(String[] args) {
		Complejo[] numeros;
		numeros=new Complejo[40];
		for(int i=0;i<numeros.length;i++){
			numeros[i]=new Complejo(aleatorio10(),aleatorio10());
		}
		System.out.println("Suma: " + sumatorio(numeros));
		
		
		
	}

}
