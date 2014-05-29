package Ejercicios;

public class Agenda {

	
	public static void main(String[] args) {
		Contacto[] listin;
		listin=new Contacto[10];
		listin[0]=new Contacto("contacto1","Apellido1","111111");
		listin[1]=new Contacto("contacto2","Apellido2","222222");
		listin[2]=new Contacto("contacto3","Apellido3","333333");
		
		for(int i=0;i<3;i++){
			System.out.println(listin[0].getNombre()+": "+listin[i].getTelMovil());
		}
	}

}
