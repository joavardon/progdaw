package simulacro;

public class PruebaMatrizProfe {

	public static void main(String[] args) {
		
		MatrizDispersaProfe uno;
		
		uno=new MatrizDispersaProfe(10,10,25);

		uno.setValor(1,1,3.5);
		uno.setValor(9, 3, 3.23);

		uno.imprimir();
		
		System.out.println("En la posición (0,0) hay un: " + uno.getValor(0,0)); 
		System.out.println("En la posición (1,1) hay un: " + uno.getValor(1,1));
		
	}

}