
public class NumBusquedarepetidos {


	public static void main(String[] args) {
		int numeros[] = {1,2,3,4};
	    //segundo array que contenga la lista sobre la que buscamos.
	    int lista[]= {2,4,5,2,4,4,4,3,4,2,3};
	    boolean encontrado;
	    int iter;
	    for (int x=0;x<numeros.length;x++) {
	        encontrado = false;
	        iter = 0; // Iterador
	         
	        while ((!encontrado) && (iter < lista.length)) {
	        if (lista[iter] == numeros[x])
	        encontrado = true;
	        iter++;
	        }
	         
	        if (encontrado)
	        System.out.println (numeros[x] + " es un número repetido. Encontrado en " + iter + " búsquedas");
	        else
	        System.out.println (numeros[x] + " no está en la lista. No encontrado en " + iter + " búsquedas");
	        }

	}

}
