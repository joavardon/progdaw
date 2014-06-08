package repaso;

import java.util.ArrayList;

public class PruebaElecciones {

	
	public static void main(String[] args) {
	ArrayList<String>listaPSOE=new ArrayList();
	listaPSOE.add("Rubalcaba");
	listaPSOE.add("Madina");
	listaPSOE.add("Bono");
	Candidatura c1=new Candidatura("PSOE",listaPSOE);
	System.out.println(c1.toString());
	ArrayList<String>listaPSOE2=new ArrayList();
	listaPSOE2.add("Rubalcaba");
	listaPSOE2.add("Madina");
	listaPSOE2.add("Bono");
	Candidatura c2=new Candidatura("PSOE",listaPSOE);
	System.out.println(c2.toString());
	//System.out.println(c1.equals(c2));
	if (c1.equals(c2)==true){
		System.out.println("Tienen el mismo nombre");
	}
	ArrayList<String>listaPP=new ArrayList();
	listaPP.add("Rajoy");
	listaPP.add("Saez Santamaria");
	listaPP.add("Botella");
	Candidatura c3=new Candidatura("PP",listaPP);
	
	if (c1.equals(c3)==true){
		System.out.println("Tienen el mismo nombre");
	}
	else{
		System.out.println("NO tienen el mismo nombre");
	}
	
	c1.igualNombre("PP");
	c1.igualNombre("PSOE");

	ArrayList<String>listaIU=new ArrayList();
	listaIU.add("Anguita");
	listaIU.add("San Emeterio");
	listaIU.add("Llamazares");
	Candidatura c4=new Candidatura("IU",listaIU);
	
	Candidatura[]lista={c1,c3,c4};
	Eleccion miEleccion=new Eleccion(lista,7);
	miEleccion.getCandidaturas()[1].addCandidato("Juanito Navarro");
	System.out.println(c3);//toString es opcional por no ser String
	miEleccion.setVotos("PSOE", 340000);
	miEleccion.setVotos("PP", 280000);
	miEleccion.setVotos("IU", 160000);
	
	for(int i=0;i<lista.length;i++){
		System.out.println("Votos de "+miEleccion.getCandidaturas()[i].getNombre()+": "+miEleccion.getVotos()[i]);
	}
	miEleccion.mostrarEscaños();
	
	
	}

}
