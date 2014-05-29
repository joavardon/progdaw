package ahorcado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



public class Ahorcado {

	
	public static void main(String[] args) {
		System.out.println("********************JUEGO DEL AHORCADO********************");
		Scanner teclado=new Scanner(System.in);
		String mipalabra=new String (Palabras.palabra());//busca palabra online
		//quito palabras con espacios o separadas por guion
		boolean reintento = false;
		if (mipalabra.contains(" ")||mipalabra.contains("-")){
			reintento=true;
		}while(reintento);
		/*
		String cadena="";
		int c=0;
		while(c < mipalabra.length())	{
			cadena =cadena+mipalabra.toUpperCase().charAt(c);
			c++;
			}*/
		//paso la palabra a mayusculas y quito caracteres como tildes
		String mipalabraMay=mipalabra.toUpperCase();
		String palabraBuscada=Ahorcado.reemplazarCaracteresRaros(mipalabraMay);
		//creo un array de caracteres con las letras de la palabra a buscar
		ArrayList<Character> lista=Ahorcado.palabraArray(palabraBuscada);
		/*palabra buscada
		for(int i=0;i<lista.size();i++){
			System.out.print(lista.get(i));
		}
		*/

		//creo lista de caracteres vacia del mismo tamaño que la palabra buscada
		ArrayList<Character> lista2=new ArrayList<Character>();
		for(int i=0;i<lista.size();i++){
			lista2.add('_');
		}
		
		//maximo de fallos permitidos, variable control de fallos, seguir(mientras no se acierte y fallos<10) a true
		int maxFallos=10;
		int fallos=0;
		boolean seguir=true;
		char letraIntroducida;
		//aqui voy guardando los caracteres ya usados, al ser HashSet no repite elementos
		HashSet<Character>letrasUsadas=new HashSet<Character>();
		do{
				//variable booleana para control de fallos
				boolean acierto=false;
				boolean usada;
				do{
					usada=false;
					System.out.print("Introduce un caracter que creas contiene la palabra: ");
					String intento=teclado.next().toUpperCase();//paso a mayusculas 
					letraIntroducida=intento.charAt(0);//cogo el primer caracter de la cadena
					if(letrasUsadas.contains(letraIntroducida)){
						System.out.println("Letra ya usada anteriormente (no contabiliza como fallo)");
						//Vemos como va el juego 
						Ahorcado.juegoEstado(lista2);
						usada=true;
						}
					letrasUsadas.add(letraIntroducida);
					//lista de letras usadas
					System.out.print("Has usado estas letras ya: ");
					Iterator<Character> ite=letrasUsadas.iterator();
					while(ite.hasNext()){
						System.out.print(ite.next()+" ");
					}
					System.out.println();
				}while(usada==true);
				
				//busco en la palabra los caracteres que coinciden 
				for(int i=0;i<lista.size();i++){
					//si lo hay acierto a true y pongo en su lugar el caracter acertado, y borro la siguiente posicion del array
					if(letraIntroducida==lista.get(i)){
						acierto=true;
						lista2.add(i, lista.get(i));
						lista2.remove(i+1);
					}
				}
				//para cada caracter introducido sin acierto incremento en un fallo
				if (acierto==false){
					fallos++;
				}
				////Vemos los fallos que llevamos
				System.out.println("Llevas "+fallos+" fallos");
				//Vemos como va el juego 
				Ahorcado.juegoEstado(lista2);
				// si las palabras son iguales hemos ganado y seguir a false para que termine el juego
				if(lista.equals(lista2)){
					System.out.println("\nGanaste. Acertaste la palabra");
					seguir=false;
				}
				//si hemos superado los fallos maximos hemos perdido y seguir a false para que termine el juego
				if(fallos==maxFallos){
					System.out.println("\nPerdiste. Número máximo de fallos superado. La palabra buscada era "+palabraBuscada);
					seguir=false;
				}
		}while(fallos<maxFallos && seguir);
		
	}
	public static void juegoEstado(ArrayList<Character>lista){
		System.out.println("Estado actual del juego: ");
		Iterator<Character> ite=lista.iterator();
		while(ite.hasNext()){
			char caracter=ite.next();
			System.out.print(caracter+" ");
		}
		System.out.println();
	}
	
	public static String reemplazarCaracteresRaros(String input) {
	    // Cadena de caracteres original a sustituir.
	    String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
	    // Cadena de caracteres ASCII que reemplazarán los originales.
	    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	    String output = input;
	    for (int i=0; i<original.length(); i++) {
	        // Reemplazamos los caracteres especiales.
	        output = output.replace(original.charAt(i), ascii.charAt(i));
	    }//for i
	    return output;
	}//reemplazarCaracteresRaros
	
	private static ArrayList<Character> palabraArray(String mipalabra){
		ArrayList<Character> lista=new ArrayList<Character>();
		
		for(char c:mipalabra.toCharArray()){
			lista.add(c);
		}
		
		return lista;
	}
}
