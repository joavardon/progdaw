package repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DejaUnicos {

	public static List<Integer> DejaUnicos(List<Integer> lista){
		Iterator<Integer> it=lista.iterator();
		List<Integer> unicos=new ArrayList<Integer>();
		Set<Integer> aparecidos=new HashSet<Integer>();
		
		while(it.hasNext()){
			 Integer numero=it.next();
			 
			 if (aparecidos.contains(numero)){
				 if (unicos.contains(numero))
				 	unicos.remove(numero);
			 }
			else{
				aparecidos.add(numero);
				unicos.add(numero);
			}
		}
		
		return unicos;
		
	}

	public static void main(String[] args) {
		
			ArrayList<Integer> prueba;
			
			prueba=new ArrayList<Integer>();
			
			prueba.addAll(Arrays.asList(1,2,3,4,5,2,7,3,2));
			
			System.out.println(prueba);
			System.out.println(DejaUnicos(prueba));
			
	}

}
