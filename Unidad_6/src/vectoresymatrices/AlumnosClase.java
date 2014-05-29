package vectoresymatrices;

import java.util.Arrays;

public class AlumnosClase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][]array1;
		
		array1=new int[3][4];
		/*
		 [
		 [0,0,0,0],
		 [0,0,0,0],
		 [0,0,0,0],
		 ]
		 */
		array1[1][3]=7;
		/*[
		 [0,0,0,0]
		 [0,0,0,7]
		 [0,0,0,0]
		 ]
		 */
		int[] array2=new int[4];
		System.out.println(Arrays.toString(array1[1]));
		
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array1[i].length;j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		//otro con caracteres
		char[][]caracteres={{'a','b'},{'c','d'},{'e','f'}};//dando los valores al inicializarlo
		for(int i=0;i<caracteres.length;i++){
			for(int j=0;j<caracteres[i].length;j++){
				System.out.print(caracteres[i][j]+" ");
			}
			System.out.println();
		}
			char[][]caracteres2;//sin darlos al principio
			caracteres2=new char[3][];
			caracteres2[0]=new char[2];
			caracteres2[1]=new char[3];
			caracteres2[2]=new char[2];
			
			caracteres2[0][0]='a';
			caracteres2[0][1]='b';
			
			caracteres2[1][0]='c';
			caracteres2[1][1]='d';
			caracteres2[1][2]='e';
		
			caracteres2[2][0]='f';
			caracteres2[2][1]='g';
			System.out.println("***********");
			for(int i=0;i<caracteres2.length;i++){
				
				for(int j=0;j<caracteres2[i].length;j++){
					
					System.out.print(caracteres2[i][j]+" ");
				}
				System.out.println();
			}
	}

}
