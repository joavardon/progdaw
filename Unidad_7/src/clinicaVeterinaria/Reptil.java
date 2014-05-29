package clinicaVeterinaria;

import java.util.Scanner;

public class Reptil extends Animal{
	 private String[]comida;
	
	Reptil(Cliente cliente,int peso, String nombre, String fechaNac, String []alimentos){
		super(cliente,peso,nombre,fechaNac);
		this.comida=alimentos;
	}
	public String[] getComida() {
		return comida;
	}
	public void setComida(String[] comida) {
		this.comida = comida;
	}
	public String toString() {
		return getDueño().getNombreCliente()+" "+getDueño().getDireccion()+" "+
				getNombre()+" "+getPeso()+" "+getFechaNac()+" "+mostrarComida(getComida());
	}
	public String mostrarComida(String[]c){
		String cadena="";
		for(int i=0;i<c.length;i++){
			cadena=cadena+c[i]+" ";
		}
		return cadena;
	}
	public static  String[] añadirComida(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantas comidas quieres introducir?: ");
		int numcom=teclado.nextInt();
		int c=0;
		String[]comida=new String[numcom];
		do{
		System.out.println("comida: ");
		String alimento=teclado.next();
			if(c<numcom){
				comida[c]=alimento;
				c++;
			}
		
		}while (!comida.equals("*")&& c<numcom );
		return comida;
		
	}

	
}
