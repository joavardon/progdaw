package buclesAnidados;

import java.util.Scanner;

public class MejoraPPT {


	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        
        System.out.println("Indique piedra, papel o tijera");
        String eleccion;
        
        eleccion = teclado.next();
        
        int resultado;
        resultado = (int) (Math.random() * 3 + 1);
        
        if (resultado == 1){
                System.out.println("piedra");
        }else if(resultado == 2){
                System.out.println("papel");
        }else{
                System.out.println("tijera");
        }
        
        /*si elijo papel y el resultado es 1 ganara papel
        si el resultado es 2 sera empate
        si el resultado es 3 ganara tijera*/
        
        if (eleccion.equals("papel") && resultado == 1){
                System.out.println("usuario: Gana papel");
        }else if(eleccion.equals("piedra") && resultado == 2){
                System.out.println("maquina: Gana papel");
        }else if (eleccion.equals("papel") && resultado == 2 || (eleccion.equals("piedra") && resultado == 1 || (eleccion.equals("tijera") && resultado == 3))){
                System.out.println("Empate");
        }else if (eleccion.equals("piedra") && resultado == 3){
                System.out.println("usuario: Gana piedra");
        }else if (eleccion.equals("tijera") && resultado == 1){
                System.out.println("maquina: Gana piedra");
        }else if (eleccion.equals("tijera") && resultado == 2){
                System.out.println("usuario: Gana tijera");
        }else if(eleccion.equals("papel") && resultado == 3){
                System.out.println("maquina: Gana tijera");
        }

	}

}
