package repaso;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PruebaPrimitiva {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer>cg=new ArrayList<Integer>();
		cg.add(3);
		cg.add(13);
		cg.add(23);
		cg.add(33);
		cg.add(43);
		cg.add(49);
		//complementario en el ultimo elemento del array
		int complementario=1;
		cg.add(1);
	
		ArrayList<Integer>miCombinacion=new ArrayList<Integer>();
		miCombinacion.add(3);
		miCombinacion.add(13);
		miCombinacion.add(12);
		miCombinacion.add(33);
		//miCombinacion.add(43);
		miCombinacion.add(23);
		miCombinacion.add(21);
		miCombinacion.add(41);
		miCombinacion.add(44);
		miCombinacion.add(49);
		miCombinacion.add(1);
		
		
		
		try{
		Primitiva loteria=new Primitiva("06/06/2014",1250000,cg);
		System.out.println(loteria.toString());
		loteria.muestraPremios(miCombinacion,complementario);
	
		}catch(Exception e){System.out.println("Excepcion: "+e.getMessage());};
		
	}

}
