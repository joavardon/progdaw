import java.io.*;
class ErrorException
{
public static void main(String args[]) throws IOException 
{
String cadena;
BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));
System.out.print("Introduce una cadena : ");
cadena = entrada.readLine();}
}