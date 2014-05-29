package simulacro;


public class MatrizDispersa {
	double[][]matrizinic;
	static int tamfil;
	static int tamcol;
	static double porcentaje;
	
	MatrizDispersa(int f,int c,double p){
		MatrizDispersa.tamfil=f;
		MatrizDispersa.tamcol=c;
		MatrizDispersa.porcentaje=p;
	}
	 
	MatrizDispersa(double[][]matriz,double p){
		matrizinic=new double[tamfil][tamcol];
		MatrizDispersa.porcentaje=p;
	}
	
	public double getValor(int x,int y){
		return matrizinic[x][y];
		
	}
	
	public void setValor(int x,int y,double z){
		matrizinic[x][y]= z;
	}
	static void  imprimeMatriz(MatrizDispersa m){
		int n = 1;
		double r =((n*100)/(MatrizDispersa.tamfil*MatrizDispersa.tamcol)) ;
		for(int i=0;i<MatrizDispersa.tamfil;i++){
			
			for(int j=0;j<MatrizDispersa.tamcol;j++){
				if(m.getValor(i, j)!=0 && r<=MatrizDispersa.porcentaje){
					
					System.out.print(m.getValor(i, j)+" ");
					n++;
					r=((n*100)/(MatrizDispersa.tamfil*MatrizDispersa.tamcol));
				}
				else{
					System.out.print(0.0+" ");
				}
			
			}
			System.out.println();
			
		}
		
	}
		
					
}
	

	
	
	
	

