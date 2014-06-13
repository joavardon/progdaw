package ejercicio2;

import java.util.ArrayList;


public class PruebaBingo {
	private static  Bingo mibombo;
	private   static Carton [] cartones;
	
	public static void main(String[] args) {
		ArrayList<Integer>numeros=new ArrayList<Integer>();
		for(int i=1;i<=90;i++){
			numeros.add(i);
		}
		
		mibombo=new Bingo(numeros);
		cartones=new Carton[3];
		for(int i=0;i<3;i++){
			Carton c=new Carton();
			c.rellenaAleatorio();
			cartones[i]=c;
		}
	
		boolean acabar=false;
		//cuando haya bingo la ronda acabara con acabar a true y se cierra el bucle while
		while(!acabar && mibombo.quedanBolas()){
			int n=mibombo.saca();
			System.out.println("NUEVA EXTRACCION: \n"+"Sale el numero: "+n);
		//	System.out.println("***********************************************************************");
			for(int i=0;i<cartones.length ;i++){
			cartones[i].marca(n);//pone en marcado true o false
			//System.out.println("Carton "+(i+1)+ " llevas "+cartones[i].getTachados().size()+" aciertos");
				if(cartones[i].esBingo()){
					System.out.println("¡Has cantado Bingo!");
					System.out.println("El ganador es el carton "+(i+1));
					acabar=true;
				}
		//		System.out.println("----------------------------------------------------------");
			}
			
		}
		for(int j=0;j<3;j++)System.out.println(cartones[j].toString());
		//System.out.println(mibombo.quedanBolas());

	}
}
