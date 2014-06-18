package repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DejaRepetidos {

	public static List<Integer> DejaRepetidos(List<Integer> lista){
		Iterator<Integer> it=lista.iterator();
		List<Integer> repetidos=new ArrayList<Integer>();
		Set<Integer> aparecidos=new HashSet<Integer>();
		
		while(it.hasNext()){
			 Integer numero=it.next();
			 
			 if (aparecidos.contains(numero)){
				 if (!repetidos.contains(numero))
					 repetidos.add(numero);
			 }
			 else
			   aparecidos.add(numero);
		}
		
		return repetidos;
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> prueba;
		
		prueba=new ArrayList<Integer>();
		
		prueba.addAll(Arrays.asList(1,2,3,4,5,2,7,3,2));
		
		System.out.println(prueba);
		System.out.println(DejaRepetidos(prueba));
	}
}
