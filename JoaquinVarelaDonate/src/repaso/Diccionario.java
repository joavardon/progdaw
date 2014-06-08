package repaso;
import java.util.*;
public class Diccionario {
public static void main(String[] args) {
Hashtable<String,String> dic=new Hashtable<String,String>();
dic.put("HOLA","HELLO");
dic.put("ADIOS", "BYE");
dic.put("MESA" ,"TABLE") ;
dic.put("SILLA","CHAIR");
dic.put("CABEZA","HEAD");
dic.put("CARA","FACE");
String saludo = (String) dic.get("HOLA");
String despedida = (String) dic.get("ADIOS");
String brazo = (String) dic.get("BRAZO");
System.out.println("HOLA : " + saludo);
System.out.println("ADIOS : " + despedida);
System.out.println("BRAZO : " + brazo);
System.out.println("dic contiene " + dic.size() + " pares.");
if(dic.containsKey("HOLA")){
System.out.println("dic contiene HOLA como clave");
}else{
System.out.println("dic NO contiene HOLA como clave");
}
if(dic.contains("HELLO"))
System.out.println("dic contiene HELLO como valor");
else
System.out.println("dic NO contiene HELLO como Valor");
System.out.println("Mostrando todos los datos de la thaabslah...");
Enumeration k = dic.keys();
while( k.hasMoreElements() ) System.out.println( k.nextElement() );
System.out.println("Mostrando todos los datos de la thaabslah...");
Enumeration e = dic.elements();
while( e.hasMoreElements() ) System.out.println( e.nextElement() );
System.out.println("Eliminado el dato "+dic.remove("HOLA"));
System.out.println("Eliminado el dato "+dic.remove("ADIOS"));
System.out.println("Mostrando todos los datos de la thaabslah...");
Enumeration e1 = dic.elements();
while( e1.hasMoreElements() ) System.out.println( e1.nextElement() );
}

}