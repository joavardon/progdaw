package simulacro2;


public class MatrizDispersa {
	double[][]matrizinic;
	static private int tamfil;
	static private int tamcol;
	static private double porcentaje;
	
	MatrizDispersa(int f,int c,double p){
		tamfil=(f);
		tamcol=c;
		porcentaje=p;
	}
	 
	MatrizDispersa(double[][]matriz,double p){
		matrizinic=new double[this.getTamfil()][this.getTamcol()];
		porcentaje=(p);
	}
	
	public double getValor(int x,int y){
		return matrizinic[x][y];
		
	}
	
	public void setValor(int x,int y,double z){
		matrizinic[x][y]= z;
	}
	 public static void  imprimeMatriz(MatrizDispersa m,int f,int c,double p){
		int tamfil=f;
		int tamcol=c;
		double porcentaje=p;
		 int n = 1;
		double r =((n*100)/(tamfil*tamcol)) ;
		for(int i=0;i<tamfil;i++){
			
			for(int j=0;j<tamcol;j++){
				if(m.getValor(i, j)!=0 && r<=porcentaje){
					
					System.out.print(m.getValor(i, j)+" ");
					n++;
					r=((n*100)/(tamfil*tamcol));
				}
				else{
					System.out.print(0.0+" ");
				}
			
			}
			System.out.println();
			
		}
		
	}

	public int getTamfil() {
		return tamfil;
	}
	public int getTamcol() {
		return tamcol;
	}
	public double getPorcentaje() {
		return porcentaje;
	}

	
		
					
}
	

	
	
	
	

