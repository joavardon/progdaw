package simulacro;

public class PruebaMatriz {

	
	public static void main(String[] args) {
		MatrizDispersa matriz=new MatrizDispersa(8,8,50);
		double[][]mi=new double[(int) MatrizDispersa.tamfil][(int) MatrizDispersa.tamcol];
		matriz=new MatrizDispersa(mi, 50);
		double tamaño=MatrizDispersa.tamcol*MatrizDispersa.tamfil;
		ElementoMatriz[] m=new ElementoMatriz[(int) tamaño];
		m[0]=new ElementoMatriz(5,6,0.5);
		m[1]=new ElementoMatriz(4,4,9);
		m[2]=new ElementoMatriz(1,1,8);
		System.out.println("El elemento 0 tiene estos valores: "+m[0].toString());
		System.out.println("El elemento 1 tiene estos valores: "+m[1].toString());
		System.out.println("El elemento 2 tiene estos valores: "+m[2].toString());
		/*
		m[3]=new ElementoMatriz(2,2,5);
		m[4]=new ElementoMatriz(2,1,4);
		m[5]=new ElementoMatriz(1,1,3);
		m[6]=new ElementoMatriz(0,0,6);*/
		
		
		matriz.setValor(m[0].getFila(), m[0].getColumna(),m[0].getContenido());
		
		matriz.setValor(m[1].getFila(), m[1].getColumna(),m[1].getContenido());
		matriz.setValor(m[2].getFila(), m[2].getColumna(),m[2].getContenido());
		/*
		matriz.setValor(m[3].getFila(), m[3].getColumna(),m[3].getContenido());
		matriz.setValor(m[4].getFila(), m[4].getColumna(),m[4].getContenido());
		matriz.setValor(m[5].getFila(), m[5].getColumna(),m[5].getContenido());
		matriz.setValor(m[6].getFila(), m[6].getColumna(),m[6].getContenido());
		//System.out.println(matriz.getValor(m[1].getFila(), m[1].getColumna()));*/
		MatrizDispersa.imprimeMatriz(matriz);
		System.out.println("En la posicion (1,1) hay: "+ matriz.getValor(1, 1));
		System.out.println("En la posicion (6,6) hay: "+ matriz.getValor(6, 6));
	}

}
