package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Conjuntos1 {

	
	public static void main(String[] args) {
		HashSet<String>miscadenas=new HashSet<String>();
		miscadenas.add("ASIR");
		miscadenas.add("DAW");
		System.out.println(miscadenas);
		if(miscadenas.contains("DAW"))
			System.out.println("Daw es un ciclo");
		miscadenas.add("DAW");
		System.out.println(miscadenas);
		Iterator i=miscadenas.iterator();
		while(i.hasNext()){
			String dato=(String) i.next();
		}
		Iterator<String>j=miscadenas.iterator();
		while(j.hasNext()){
			String dato1= j.next();
		}
		miscadenas.remove("DAW");
		System.out.println(miscadenas);
	}

}
