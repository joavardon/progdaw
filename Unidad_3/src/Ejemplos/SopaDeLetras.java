package Ejemplos;

import java.util.Scanner;

public class SopaDeLetras {

public static void main(String[] args) {
Scanner read = new Scanner(System.in);
char[][] sopa = new char[6][6];
int numP = 0;
String palabra = "";

llenarSopa(sopa);
mostrarSopa(sopa);

System.out.println("¿Cuantas palabras quiere que se busque?");
numP = read.nextInt();

for (int i = 0; i < numP; ++i) {
System.out.println("\nIngrese palabra a buscar: " + (i + 1));
palabra = read.next();

System.out.println(buscarPalabra(sopa, palabra));
}
}

private static void llenarSopa(char[][] sopa) {
char letra = ' ';

for (int i = 0; i < sopa.length; ++i) {
for (int j = 0; j < sopa[0].length; ++j) {
letra = (char) (Math.random() * ((122 + 1) - 97) + 97);
sopa[i][j] = letra;
}
}
}

private static void mostrarSopa(char[][] sopa) {
for (char[] fila : sopa) {
for (char dato : fila) {
System.out.print(dato + "\t");
}

System.out.println("\n");
}
}

private static boolean buscarPalabra(char[][] sopa, String palabra) {
String palabraBus = "";
char letra = ' ';
int indicePal = 0;

for (int i = 0; i < sopa.length; ++i) {
for (int j = 0; j < sopa[0].length; ++j) {
while (indicePal < palabra.length()) {
letra = palabra.charAt(indicePal);

if (sopa[i][j] == letra) {
palabraBus += letra;
++indicePal;
} else {
break;
}
}
}
}

if (palabraBus.equalsIgnoreCase(palabra))
return true;

System.out.println("\nPalabra buscada: " + palabraBus);

return false;
}

} 