package ordenacion_busquedas;

public class SinRep3 {

	static int[] SacarRepetidos(int arreglo[], int nuevo[], int tam)
	{
	int i, j, c = 0;
	boolean repetido = false;
	for (i=0;i<tam;i++){
	for (j=0;j<c;j++){
	repetido = false;
	
	if (arreglo[i]==nuevo[j]){
	repetido = true;
	break;
	}
	}
	if (!repetido){
	nuevo[c++] = arreglo[i];
	}
	}
	return nuevo;
	}

	public static void main(String[] args) {
		int arreglo[]={1,4,5,1,3,5};//tiene 6 elementos
		int nuevo[]=new int[6];//reservamos memoria para 6 elementos, aunque no se usen todos
		nuevo=SacarRepetidos(arreglo, nuevo, 6);
		for (int i=0; i < nuevo.length; i++){
			if(nuevo[i]!=0)
		System.out.println("Valor: " + nuevo[i]);
		}
	}

}
