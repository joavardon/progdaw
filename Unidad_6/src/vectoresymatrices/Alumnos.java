/*
 *Declara y crea un tipo de variable que sea capaz de contener 
 *el número de alumnos matriculados en 4 
 *institutos en 5 niveles de estudios: ESO, BACHILLERATO, CGM, CGS, PCPI.
 */
package vectoresymatrices;

import java.util.Scanner;


public class Alumnos {
	/*
	public static final int ALFONSOX=1;
	public static final int AZARQUIEL=2;
	public static final int ELGRECO=3;
	public static final int JUANELO=4;
	*/
	public enum Institutos {ALFONSOX("Alfonso X El Sabio "),AZARQUIEL("Azarquiel"),ELGRECO("El Greco"),JUANELO("Juanelo Turriano");
	private final String nombreinsti; 
	Institutos(String nombreinsti){
		this.nombreinsti = nombreinsti;}
	public String getNombreInsti(){
		return nombreinsti;}
	}
	/*
	public static final int ESO=1;
	public static final int BACHILLERATO=2;
	public static final int CGM=3;
	public static final int CGS=4;
	public static final int PCPI=5;
	*/
	public enum Niveles {ESO("ESO"),BACHILLERATO("Bachillerato"),CGM("Ciclo Grado Medio"),CGS("Ciclo Grado Superior"),PCPI("PROGRAMAS DE CUALIFICACIÓN PROFESIONAL INICIAL");
	private final String nv; 
	Niveles(String nv){
		this.nv = nv;}
	public String getNombreNivel(){
		return nv;}
	}
	
	public static void main(String[] args) {
		
	int[]instituto={1,2,3,4};
	int[] nivel={1,2,3,4,5};
	int[][] alumnos=new int[instituto.length][nivel.length];
	
	for(int i=0;i<instituto.length;i++){
		for(int j=0;j<nivel.length;j++){
			Scanner teclado=new Scanner(System.in);
			System.out.println("Inserta numero de alumnos para el instituto "+Institutos.values()[i].getNombreInsti()+" en el nivel de estudios "+Niveles.values()[j].getNombreNivel()+" :");
			int numalumnos=teclado.nextInt();
			alumnos[i][j]=numalumnos;
			}	
		}
	
	
	for(int i=0;i<instituto.length;i++){
		for(int j=0;j<nivel.length;j++){
			System.out.println(Institutos.values()[i].getNombreInsti()+" en el nivel de estudios "+Niveles.values()[j].getNombreNivel()+" tiene "+alumnos[i][j]+" alumnos/as");
		}
	}
}
}
