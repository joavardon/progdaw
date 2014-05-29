import java.util.Scanner;
import java.util.Arrays;

public class EjemplosString {

	public static void main(String[] args) {
		String cadena="cadena";
		
		cadena=new String("otra cadena");
		cadena+=" hola cadena";
		System.out.println(cadena);
		
		if(cadena.equals("otra cadena hola cadena")){
			System.out.println("Cadenas iguales");
		}
		System.out.println(cadena.toUpperCase());//el obejto no cambia a no ser que le asigne otra
		System.out.println(cadena);
		String nombre1="Angel", nombre2="Alberto Fernandez";
		System.out.println("esto" +nombre1.compareTo(nombre2));//0 si es igual ; -1 si es menor ;1 si en orden alfabetico
		System.out.println(nombre2.compareTo(nombre1));
		System.out.println("2".compareTo("21"));
		cadena.trim();
		System.out.println(cadena.contains("cadena"));
		String numeroCadena=String.valueOf(0.7f);
		float f=Float.valueOf("2.45");
		System.out.println(numeroCadena);
		System.out.println(f);
		System.out.println(cadena.substring(12,16));
		System.out.println(cadena.replace("a", "e"));
		System.out.println(cadena.replaceFirst(cadena, nombre2));
		System.out.println(cadena.replaceAll(cadena, nombre2));
		
		StringBuilder nombre;
		//http://picandocodigo.net/2010/java-stringbuilder-stringbuffer/
		nombre=new StringBuilder("Angel");
		nombre.append(" Cañadas");
		nombre.insert(5, " Martinez");
		System.out.println(nombre);
		nombre.delete(nombre.indexOf(" C"), nombre.length());//desde C al final
		System.out.println(nombre);
		String aux=new String(nombre);
		System.out.println(nombre);
		
	}

}
