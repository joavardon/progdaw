package colecciones;

import java.util.ArrayList;
import java.util.Iterator;


public class Listas2 {


	public static void main(String[] args) {
		ArrayList<String>c=new ArrayList<String>();
		String cadena="Asir";
		c.ensureCapacity(1000);//asigna mil 
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		c.add(2,"insercion");
		c.set(0,"cadena distinta");
		System.out.println(c.size());
		System.out.println(c);
		
	}

}
