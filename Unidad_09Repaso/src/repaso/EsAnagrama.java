package repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EsAnagrama {


		public static boolean es_anagrama(String palabra1, String palabra2) {
			boolean respuesta=true;
			List<Character> lista1 = new ArrayList<Character>();
			for(char c : palabra1.toLowerCase().toCharArray()) {
				lista1.add(c);
			}
			
			List<Character> lista2 = new ArrayList<Character>();
			for(char c : palabra2.toLowerCase().toCharArray()) {
				lista2.add(c);
			}
			
			ListIterator<Character> iterador = lista2.listIterator();
			while(iterador.hasNext()) {
				if(lista1.contains(iterador.next())){
					iterador.remove();
				}else{
					respuesta=false;
					break;
				}
			}
			
			if(lista2.size()>0){
				respuesta=false;
			}
			return respuesta;
		}

		public static void main(String[] args) {
			System.out.println(es_anagrama("amor", "roma"));
			System.out.println(es_anagrama("amor", "coma"));
			System.out.println(es_anagrama("Jamon", "monja"));
		}
	

}
