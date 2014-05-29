package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemplosList {

    public static void imprimirLista(List lista) {
        ListIterator iterador;

        iterador = lista.listIterator();
        String elto;

        System.out.println("Impresi�n de la lista ");
        while (iterador.hasNext()) {
            elto = String.valueOf(iterador.next());
            System.out.println("\tValor " + iterador.nextIndex() + ": " + elto);
        }

    }

    public static void prueba1() {
        ArrayList colecci�n = new ArrayList();

        colecci�n.add(7);
        colecci�n.add(56.7);
        colecci�n.add(0, "soy la cadena");
        colecci�n.add(3456);

        System.out.println("imprime el array[]: "+colecci�n.toString());
       
        imprimirLista(colecci�n);

    }

    public static void prueba2(){
        ArrayList numeros = new ArrayList();
        ListIterator it;
       
        for(int i=0;i<=100;i+=5){
            numeros.add(i);
        }
       
       
        // imprimir los n�mero utilizando iterador
        // impl�cito
        for(Object num : numeros){
          System.out.println(num);   
        }
       
        it=numeros.listIterator();
        while(it.hasNext()){
              System.out.println(it.next());   
            }
        //imprime al reves
        while(it.hasPrevious()){
              System.out.println(it.previous());   
            }
       
        for(int i=0;i<numeros.size();i++)
            System.out.println(numeros.get(i));
       
    }
   
    public static void main(String[] args) {
        prueba1();
        System.out.print("\n\n....\n\n");
        prueba2();
    }

}