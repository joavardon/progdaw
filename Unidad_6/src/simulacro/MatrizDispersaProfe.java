package simulacro;

public class MatrizDispersaProfe {
	private ElementoMatrizProfe[] elementos;
	private int filas,columnas;
	private int numElementosNoCero;
	
	public MatrizDispersaProfe(int columnas, int filas, double tantoPorCiento) {
		this.columnas=columnas;
		this.filas=filas;
		
		int tamaño;
		
		tamaño=columnas*filas;
		tamaño=(int)(tamaño*tantoPorCiento/100);
		
		elementos=new ElementoMatrizProfe[tamaño];
		numElementosNoCero=0;
	}
	/*
	public MatrizDispersaProfe(double[][] matriz, double tantoPorCiento) {
		
		this.columnas=matriz[0].length;
		this.filas=matriz.length;
		
		int tamaño;
		
		tamaño=columnas*filas;
		tamaño=(int)(tamaño*tantoPorCiento/100);
		
		elementos=new ElementoMatrizProfe[tamaño];
		numElementosNoCero=0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if (matriz[i][j]!=0) setValor(j,i,matriz[i][j]);
			}
		}
	}
	*/
	public double getValor(int columna, int fila) {
		for(int i=0;i<numElementosNoCero;i++) {
			if (elementos[i].getColumna()==columna && elementos[i].getFila()==fila)
				return elementos[i].getValor();
		}
		//si no hay retorna ninguno  en esa posicion del array retorna 0
		return 0.0;
	}
	
	public void setValor(int columna, int fila, double valor) {
		boolean encontrado=false;
		for(int i=0;i<numElementosNoCero;i++) {
			if (elementos[i].getColumna()==columna && elementos[i].getFila()==fila) {
				elementos[i].setValor(valor);
				encontrado=true;
			}
		}
		
		if (!encontrado) {
			elementos[numElementosNoCero]=new ElementoMatrizProfe(columna,fila,valor);
			numElementosNoCero++;
		}
	}
	
	public void imprimir() {
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.printf("%.2f ",getValor(j,i));
			}
			System.out.println();
		}
	}
}





