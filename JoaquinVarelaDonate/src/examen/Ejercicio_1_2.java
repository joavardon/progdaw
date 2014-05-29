package examen;

public class Ejercicio_1_2 {
	public static void main(String[] args) {
		char s='@';
		int l=7;
		for(int i=0;i<7;i++){
			for(int j=0;j<l;j++){
			
			System.out.print(s);
		}
			l--;
		System.out.println();
		}
		
		int c=0;
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(c<=j){
					System.out.print(s);}
				else{
					System.out.print(' ');
				}
		}
		System.out.println();
		c++;
		}
		c=1;
		for(int i=0;i<7;i++){
			for(int j=7;j>0;j--){
				if(j<=c){
					System.out.print(s+" ");}
				else{
					System.out.print(' ');
				}
		}
			System.out.println();
			c++;
		}
	}
}
