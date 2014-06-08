package repaso;

public class PruebaAspirante {

	public static void main(String[] args) {
		int[]fallos1={0,0,0,0};
		int[]fallos2={0,0,3,0};
		int[]fallos3={0,0,0,0};
		int[]fallos4={1,0,0,0};
		Aspirante a1=new Aspirante(1,fallos1);
		Aspirante a2=new Aspirante(2,fallos2);
		Aspirante a3=new Aspirante(3,fallos3);
		Aspirante a4=new Aspirante(4,fallos4);
		Aspirante[]aspirantesEx={a1,a2,a3,a4};
		int[]fallos={0,1,2,1};
		int fail=0;
		int fallosTot = 0;
		char[]grupos={'a','b','c','d'};
		Examen miexamen=new Examen("5-6-14",aspirantesEx,fallos,grupos);
		boolean aprobado=true;
		System.out.println(miexamen.toString());
		for(int i=0;i<aspirantesEx.length;i++){
			for(int j=0;j<grupos.length && aprobado ;j++){
				fail=aspirantesEx[i].getFallos()[j];
				if(fail>fallos[j]){
					aprobado=false;
					miexamen.setGrupo(grupos);
					System.out.println("El aspirante "+aspirantesEx[i].getId()+" ha superado el maximo de fallos en el grupo "
					+miexamen.getGrupo(j));
				}
				else{
					aprobado=true;
				}
				fallosTot=fallosTot+fail;
			}
			System.out.println("El aspirante "+aspirantesEx[i].getId()+" tiene "+fallosTot+" fallos en total");
			if(aprobado){
				System.out.println("El aspirante "+aspirantesEx[i].getId()+" ha aprobado");
			}
			else{
				System.out.println("El aspirante "+aspirantesEx[i].getId()+" ha suspendido");
			}
			fallosTot=0;
			aprobado=true;
			
		}
		
		
	}

}
