/*
 * Debes crear una clase auxiliar Menú que permita hacer las funciones del menú 
 * típico de texto: mostrar las opciones, esperar una respuesta y devolverla. 
 * La clase Menú se utilizará en el main para realizar una pequeña aplicación 
 * que permita crear y borrar animales.
 */
package clinicaVeterinaria;

import java.util.Scanner;


public class Menu {
	
	private  Animal[] animales;
	private int numAnimales=0;
	
	Menu(int numAnimales){
		this.animales=new Animal[numAnimales];
		this.numAnimales=0;
	}
	
	
	public static void main(String[] args) {
		Menu m=new Menu(5);
		menu(m);
		for(int i=0;i<m.numAnimales;i++){
			System.out.println(m.animales[i]);
		}
	}
	public static void menu(Menu m){
		Scanner teclado=new Scanner(System.in);
		
		boolean seguir=true;
		do{
			
		System.out.println("Elige una opcion: ");
		System.out.println("1. Crear animal: ");
		System.out.println("2. Borrar animal ");
		System.out.println("3. Salir ");
	
		int opcion=teclado.nextInt();
		boolean cont;
		switch(opcion){
	
		case 1:
			
			do{
				cont=false;
				System.out.println("¿Que animal añadir: ");
				String animal=teclado.next();
				if(animal.equals("perro")){
					Animal a=crearAnimal();
					System.out.println("Raza: ");
					String raza=teclado.next();
					System.out.println("Id: ");
					int id=teclado.nextInt();
					System.out.println("Peligroso: ");
					boolean  peligroso=teclado.nextBoolean();
					a=new Perro(a.getDueño(),a.getPeso(),a.getNombre(),a.getFechaNac(),raza,id,peligroso);
					m.añadirAnimal(a);
				}
				else if(animal.equals("gato")){
					Animal a=crearAnimal();
					System.out.println("Raza: ");
					String raza=teclado.next();
					a=new Gato(a.getDueño(),a.getPeso(),a.getNombre(),a.getFechaNac(),raza);
					m.añadirAnimal(a);
				}
				else if(animal.equals("pez")){
					Animal a=crearAnimal();
					System.out.println("Numero de peces: ");
					int numero=teclado.nextInt();
					System.out.println("Temperatura del agua: ");
					boolean clima=teclado.nextBoolean();
					a=new Pez(a.getDueño(),a.getPeso(),a.getNombre(),a.getFechaNac(),numero,clima);
					m.añadirAnimal(a);
					
				}
				else if(animal.equals("reptil")){
					Animal a=crearAnimal();
					String[]comida=Reptil.añadirComida();
					a=new Reptil(a.getDueño(),a.getPeso(),a.getNombre(),a.getFechaNac(),comida);
					
					m.añadirAnimal(a);
				}
				else{
					System.out.println("animal introducido equivocado");
					cont=true;
				}
			}while(cont);
				break;
		case 2:
			System.out.println("Nombre del animal a eliminar: ");
			String nombreAnimal=teclado.next();
			m.eliminarAnimal(nombreAnimal);
			break;
			
		case 3:
			seguir=false;
			break;
		}
		}while (seguir);
		
	}

	
	public  void eliminarAnimal(String nombreAnimal){


			for(int i=0;i<this.numAnimales;i++)
			{
				if (this.animales[i].getNombre().equals(nombreAnimal)) {
					for(int j=i;j<this.numAnimales;j++)
						this.animales[j]=this.animales[j+1];
					this.numAnimales--;
					System.out.println("quedan "+this.numAnimales);
					break;
						}
			}
		}
	
	public void añadirAnimal(Animal a) {
		this.animales[this.numAnimales++]=a;
	}
	public static Animal crearAnimal(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("nombre del cliente");
		String nombreCliente=teclado.next();
		System.out.println("direccion");
		String direccion=teclado.next();
		Cliente micliente=new Cliente(nombreCliente,direccion);
		System.out.println("peso: ");
		int peso=teclado.nextInt();
		System.out.println("nombre: ");
		String nombre=teclado.next();
		System.out.println("fecha nacimiento: ");
		String fecha=teclado.next();
		
		Animal miAnimal=new Animal(micliente,peso,nombre,fecha);
		
		return miAnimal;
	}
	
	public Animal[] getAnimales() {
		return animales;
	}


	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
	
}
