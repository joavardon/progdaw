/*El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito 
que está lleno y litros de consumo por 100kms. El programa mostrará los kilómetros 
que quedan de autonomía. Si quedan menos de 30 kilómetros mostrará un aviso 
de que hay que repostar porque estamos usando la reserva.*/

package ejerciciosCondicionales;

public class Coche {


	public static void main(String[] args) {
		float deposito = 40;
		float porcentaje = 3;
		float consumo = 5;
		float litrosqueda=porcentaje*deposito/100;
		float kmqueda=litrosqueda*100/consumo;
		if (kmqueda>=30){
			System.out.println("Queda gasolina para: "+kmqueda+" Km.");
		}
		else{
			System.out.println("AVISO. Queda gasolina para menos de 30 Km.");
		}

	}

}
