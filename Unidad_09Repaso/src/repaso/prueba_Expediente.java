package repaso;

import java.util.ArrayList;



public class prueba_Expediente {

	
	public static void main(String[] args) {
		Modulo ASIR=new Modulo("ASIR");
		Modulo DAW=new Modulo("DAW");
		Modulo DAM=new Modulo("DAM");
		
		ASIR.setNota1(8);
		ASIR.setNota2(5);
		ASIR.setNota3(4);
		//notas(ASIR);
		System.out.println("Nota media de "+ASIR.getNombremod()+" es "+ASIR.nota_Media());
		
		System.out.println(ASIR.equals(DAW));
		System.out.println(ASIR.equals(ASIR));
		
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		modulos.add(ASIR);
		modulos.add(DAW);
		modulos.add(DAM);
		
		Expediente e1=new Expediente("Juan",modulos );
		/*
		System.out.println("La notas de "+e1.nombre+ "  son : ");
		for(int i=0;i<modulos.size();i++){
		System.out.println(modulos.get(i).toString());
		}*/
		System.out.println(e1.toString());
		Modulo FOL=new Modulo("FOL");
		e1.añadeModulo(FOL);
		DAW.setNota1(4);
		DAW.setNota2(7);
		DAW.setNota3(4);
		System.out.println(e1.toString());

	}
	
	
	
}
