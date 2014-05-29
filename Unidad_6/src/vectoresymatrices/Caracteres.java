/* Escribe un método que reciba una matriz de caracteres con el fin de visualizar su contenido.*/
package vectoresymatrices;

public class Caracteres {
	public static void visualizarMatriz(char[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
/*
		for(char[]fila:matriz){
			for(char[]elemento:fila){
				System.out.println(elemento+" ");
			}
			System.out.println();
		}*/
	}

	public static void main(String[] args) {
	
		char [][]caracteres={{'a','b'},{'c','d','e'}};
		visualizarMatriz(caracteres);
	}

}
