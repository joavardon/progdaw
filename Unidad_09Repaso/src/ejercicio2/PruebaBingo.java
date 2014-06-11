package ejercicio2;

import java.util.ArrayList;


public class PruebaBingo {

	public static void main(String[] args) {
		ArrayList<Integer>numeros=new ArrayList<Integer>();
		for(int i=1;i<=90;i++){
			numeros.add(i);
		}
		
		Bingo mibombo=new Bingo(numeros);
		Carton micarton=new Carton();
		Carton micarton1=new Carton();
		Carton micarton2=new Carton();
		Carton []cartones={micarton,micarton1,micarton2};
		for(int i=0;i<cartones.length;i++){
			cartones[i].rellenaAleatorio();
			System.out.println("Carton "+(i+1)+" limpio: \n"+cartones[i].toString());
		}
		boolean acabar=false;
		//cuando haya bingo la ronda acabara con acabar a true y se cierra el bucle while
		while(!acabar ){
			int n=mibombo.saca();
			System.out.println("NUEVA EXTRACCION: \n"+"Sale el numero: "+n);
			System.out.println("***********************************************************************");
			for(int i=0;i<cartones.length;i++){
			cartones[i].marca(n);//añade coincidencia a tachado e imprime el carton con marcas
			System.out.println("Carton "+(i+1)+ " llevas "+cartones[i].getTachados().size()+" aciertos");
				if(cartones[i].esBingo()){
					System.out.println("¡Has cantado Bingo!");
					System.out.println("El ganador es el carton "+(i+1));
					acabar=true;
				}
				System.out.println("----------------------------------------------------------");
			}
			
		}
		System.out.println(mibombo.quedanBolas());

	}
}
