package ejercicio2;

public class Ejercicio2 {
	public static int contarSecuencias(int[]v){
		int secuencias=0;
		
		for(int i=1;i<v.length;i++){
			if(v[i-1]==v[i]){
				secuencias++;
				if(i<v.length-1){
					while(v[i-1]==v[i] ){
						i++;
					}
				}
			}
			
		}
		
		return secuencias;
		
	}

	public static void main(String[] args) {
		int[]secuencia={0,2,2,1,1,1,2,1,1,2,2};
		String cadSec="";
		for(int i=0;i<secuencia.length;i++){
			cadSec=cadSec+secuencia[i]+" ";
		}
		int n=contarSecuencias(secuencia);
		System.out.println("contarSecuencias "+"({"+cadSec+"}) == "+n);
		
	}

}
