package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {

	
	public static void main(String[] args) {
		List<String>c=new ArrayList<String>();
		String cadena="Asir";
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		c.add(2,"insercion");
		c.set(0,"cadena distinta");
		
		//c.set(5,"Excepcion");
		c.set(c.size()-1,"insrrcion al final");//que quite el del final,si lo comento saldria ASIR
		System.out.println(c);

	}

}
