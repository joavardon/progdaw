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
	
	public void a�adirOpci�n(String nuevaOpci�n){
		this.opciones.add(nuevaOpci�n);
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
		int opci�n;
		
		imprimir();
		System.out.println("Opci�n: ");
		opci�n=scn.nextInt();
		
		return opci�n;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
