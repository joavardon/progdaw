package examen;

public class ArbolDeNavidad {

	public static void main(String[] args) {
		int tama�o=8;
	
		for(int k=0;k<tama�o-1;k++){
			for(int i=0;i<k+2;i++){//el primer arbol acababa en dos 0+2
				for(int j=0;j<tama�o-i;j++){
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++){
					System.out.print("@ ");
				}
				System.out.println();
			}
		
			
		
	}
		
	}

}
