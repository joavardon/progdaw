package ordenacion_busquedas;

public class SinRep4 {

	public static void main(String[] args) {
		int [] vector1 = new int [] {1,4,5,3,2,5,4,3,4,5,6};

		// el vector donde guardaremos el resultado, de momento vacío
		int [] vector2 = new int [] {};

		int i;
		// recorremos el vector 1
		for( i = 0; i<vector1.length; i++){

			// variable donde almacenamos el caracter que estamos buscando
			// para saber si esta repetido.
			int numBuscado = vector1[i];
	
			// bandera para saber si el caracter buscado ya existe en el
			// vector de resultado, osea vector2, incialmente asumimos
			// que el caracter no existe
			boolean numYaExiste = false;
	
			// recorremos el vector 2, para buscar nuestro caracter sospechoso
					for(int j = 0; j<vector2.length; j++){
	
					// si efecticamente nuestro caracter buscado es encontrado
								if ( vector2[j] == numBuscado ){
			
					// cambiamos nuestra bandera a true, nuestro sospechoso
					// es culpable.
										numYaExiste = true;
			
					// terminamos la busqueda de ese caracter
										break;
								}
					}
			
					// Si al terminar la búsqueda nuestra bandera sigue siendo falsa,
					// significa que nuestro carácter no existe en el vector2 y puede
					// ser agregado al vector de resultado, osea vector 2
					if ( numYaExiste == false ){
			
					// creamos un vector temporal, una posicion mas grande que vector 2
					// ya que vamos a agregar un nuevo caracter y necesitamos hacer
					// espacio para el.
					int [] vectorTemp = new int [vector2.length + 1];
					int j;
					// copiamos caracter por caracter el contenido de vector2 a vectorTemp
						for(j = 0; j<vector2.length; j++){
							vectorTemp[j] = vector2[j];
						}
			
					// finalmente llenamos la ultima posicion del vectorTemp con
					// nuestro nuevo caracter no repetido
					vectorTemp[j] = numBuscado;
			
					// Y por ultimo reemplazamos la instancia del vector2 con nuestro
					// mas grande vectorTemp. De esta forma aseguramos que vector2
					// esta actualizado con el nuevo caracter agregado
					vector2 = vectorTemp;
					}
		}

		/*lo siguiente es solo para poder ver el resultado
		String res = "[";
		for( i = 0; i<vector2.length - 1; i++){
		res += vector2 + ",";
		}
		res += vector2 + "]";

		// mostramos el resultado por la consola
		System.out.println(res);
		*/
		for (i=0; i < vector2.length; i++){
		System.out.println("Valor: " + vector2[i]);
		}
	}
}
