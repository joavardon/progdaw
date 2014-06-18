package cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	//private String[] opciones;
	//private int num_opciones;
	private ArrayList<String> opciones;
	
	private String titulo;

	private final static int MAX_OPCIONES=20;
	
	public Menu(){
		//opciones=new String[MAX_OPCIONES];
		opciones=new ArrayList<String>();
		titulo="";
	}
	
	public Menu(String[] opciones,int num_opciones){
		this.opciones=new ArrayList<String>();
		for(int i=0;i<num_opciones;i++)
			this.opciones.add(opciones[i]);
		titulo="";
	}
	
	public void añadirOpción(String nuevaOpción){
		this.opciones.add(nuevaOpción);
	}
	
	public void imprimir(){
		System.out.println(titulo);
		for(int i=0;i<titulo.length();i++)
			System.out.print("-");
		System.out.println();
		for(int i=0;i<opciones.size();i++)
			System.out.println((i+1)+ ". " + opciones.get(i));
	}

	public int mostrar(){
		Scanner scn=new Scanner(System.in);
		int opción;
		
		imprimir();
		System.out.println("Opción: ");
		opción=scn.nextInt();
		
		return opción;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
