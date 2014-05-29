
public class ArraysPrueba {
	public static void main(String[] args) {
//Decalracion
	int[] enteros;
	int enteros2[];
	String[] cadenas;
//Creacion
	enteros=new int[40];
	enteros2=new int [40];
	cadenas=new String [40];
//Inicializacion
	int[] enteros3={1,2,3,7};
	String[] cadenas2={"casa","coche","perro"};
	String[] cadenas3={new String("uno"),new String("dos")};//por ejemplo para objetos como coches
	for(int i=0;i<enteros.length;i++){
		enteros[i]=i;
	}
	for(int i=0;i<cadenas.length;i++){
		cadenas[i]=new String(Integer.toString(i));
		
	}
	//recorrido
	for(int i=0;i<cadenas.length;i++){
		System.out.println(cadenas[i]);
	}
	for(String c:cadenas)//para recorrer toda la coleccion
		System.out.println(c);
	
	//Array bidimensional
	
	int[][]enteros4;
	int[][]enteros5= {{1,2},{3,4}};//en un tablero 1,2 en una fila y 3,4 en la de abajo
	enteros5[0][1]=7;
	
	System.out.println(enteros5[0][1]); //del primero el segundo-->2
	System.out.println(enteros5[1][0]);//del segundo el primero-->3
	
	enteros4=new int[3][3];
	
	enteros4[1][1]=1;
	enteros4[2][2]=2;
	enteros4[1][2]=3;//fila-columna de la segunda fila la tercera columna
	//enteros4[1].length;
}

	
	
}
