public class Ejemplo{
public Ejemplo(String nombre, String apellidos)
throws
Exception{
if(nombre == null || apellidos == null)
throw new Exception("Argumentos no v�lidos");
//si el constructor lanza la excepci�n el objeto
//no se crea
}
public static void main(String args[]) {
try{
Ejemplo alum = new Ejemplo(null, "hola");
}catch (Exception e){
System.out.println("Excepcion: "+
e.getMessage());
}
}
}