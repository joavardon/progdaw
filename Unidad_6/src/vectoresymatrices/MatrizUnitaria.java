/*Necesitamos crear una matriz unitaria de orden 8. Crea un método que lo haga. 
Una matriz unitaria es aquella que tiene todos sus componentes a 0, 
excepto las de la diagonal principal, que están a 1.*/
package vectoresymatrices;

public class MatrizUnitaria {
	public static void mostrarMatriz(int[][]mimatriz){
		for(int i=0;i<mimatriz.length;i++){
			for(int j=0;j<mimatriz[i].length;j++){
				System.out.print(mimatriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][]creaMatriz(int orden){
		int[][]matriz;
		matriz=new int[orden][orden];
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(i==j){
					matriz[i][j]=1;
				}
				else{
					matriz[i][j]=0;
					
				}
			}
		}
		return matriz;
	}
	public static void main(String[] args) {
	int orden=8;
	int[][]mimatriz=creaMatriz(orden);
	
	mostrarMatriz(mimatriz);
	}

}
