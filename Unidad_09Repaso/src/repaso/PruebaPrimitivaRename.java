package repaso;

public class PruebaPrimitivaRename {

	public static void main(String[] args){
		

		int[]miCombinacion=new int[6];
		miCombinacion[0]=15;
		miCombinacion[1]=1;
		miCombinacion[2]=21;
		miCombinacion[3]=31;
		miCombinacion[4]=41;
		miCombinacion[5]=18;
		int[]miCombinacion2={1,21,22,41,45,15};
		int[]miCombinacion3={3,21,18,41,31,15};
		//0,2
		int[][]combinaciones={miCombinacion,miCombinacion2,miCombinacion3};
		
		try{
			int complementario=1;
			int[]cg=new int[6];
			cg[0]=15;
			cg[1]=16;
			cg[2]=21;
			cg[3]=31;
			cg[4]=41;
			cg[5]=18;
		
		PrimitivaRename loteria=new PrimitivaRename("06/06/2014",1250000,cg);
		loteria.compruebaValida(cg,6);
		System.out.println(loteria.toString());
		for(int i=0;i<3;i++){
			loteria.compruebaAciertos(combinaciones[i], complementario);
		}

		loteria.muestraPremios();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("Sobrepasado el limite del array");}
		catch(IllegalArgumentException e)
		{System.out.println(e.getMessage());}
		
	}

}
