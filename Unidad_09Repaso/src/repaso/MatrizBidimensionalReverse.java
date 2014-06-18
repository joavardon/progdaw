package repaso;

public class MatrizBidimensionalReverse {

	
	public static void main(String[] args) {
		int[][] matriz1=new int[3][5];
		for(int i=0;i<5;i++){
			
			for(int j=0;j<3;j++){
						matriz1[j][i]=i;
	
					}
			}
		
	
		
	for(int j=0;j<3;j++){
		for(int i=0;i<5;i++){
			System.out.print(matriz1[j][i]);
		}
		System.out.println();
			
		
	}

}

}