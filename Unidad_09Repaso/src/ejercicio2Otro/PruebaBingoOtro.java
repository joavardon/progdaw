package ejercicio2Otro;


import java.util.ArrayList;


	public class PruebaBingoOtro {

		public static void main(String[] args) {
			ArrayList<Integer>numeros=new ArrayList<Integer>();
			for(int i=1;i<=90;i++){
				numeros.add(i);
			}

			BingoOtro mibombo=new BingoOtro(numeros);
			CartonOtro micarton=new CartonOtro();
			CartonOtro micarton1=new CartonOtro();
			CartonOtro micarton2=new CartonOtro();
			CartonOtro []cartones={micarton,micarton1,micarton2};
			for(int i=0;i<cartones.length;i++){
				cartones[i].rellenaAleatorio();
			}
			System.out.println("Carton1 limpio: \n"+micarton.toString());
			System.out.println("Carton2 limpio: \n"+micarton1.toString());
			System.out.println("Carton3 limpio: \n"+micarton2.toString());
			while(mibombo.quedanBolas()&& !micarton.esBingo()&& !micarton1.esBingo()&& !micarton2.esBingo()){
				int n=mibombo.saca();
				System.out.println("NUEVA EXTRACCION: \n"+"Sale el numero: "+n);
				System.out.println("***********************************************************************");
				for(int i=0;i<cartones.length;i++){
				cartones[i].marca(n);
				System.out.println("Carton "+(i+1)+ " llevas "+cartones[i].getTachados().size()+" aciertos");

					if(cartones[i].getTachados().size()==27){
						System.out.println("¡Has cantado Bingo!");
						System.out.println("El ganador es el carton "+(i+1));

					}
					System.out.println("----------------------------------------------------------");
				}
				//System.out.println("Quedan en el bombo: "+mibombo.toString());
			}
		}
	}