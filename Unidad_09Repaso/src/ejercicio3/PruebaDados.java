package ejercicio3;

public class PruebaDados {

	
	public static void main(String[] args) {
		int aleatorio1=(int)(Math.random()*5+1);
		Dado midado1=new Dado(aleatorio1);
		int aleatorio2=(int)(Math.random()*5+1);
		Dado midado2=new Dado(aleatorio2);
		boolean iguales=false;
		ParDeDados mipar=new ParDeDados(midado1,midado2);
		System.out.println(mipar.toString());
		int c=0;
		while(iguales==false){
		mipar.tirar();
		System.out.println("Tirada de dados, ha salido "+mipar.getDado1()+ " y "+mipar.getDado2());
		c++;
			if(mipar.getDado1()==1 && mipar.getDado2()==1){
				iguales=true;
			}
		}
		System.out.println("Me llevó "+c+" tiradas conseguir dos "+mipar.getDado1());

	}
	
	

}
