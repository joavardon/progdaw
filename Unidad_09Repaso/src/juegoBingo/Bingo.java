package juegoBingo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
 *  El bombo tiene 90 bolas numeradas del 1 al 90. Los cartones tienen 15 números que debes marcar.
 *  Estos números se encuentran distribuidos en 3 filas diferentes, con 9 columnas cada una, habiendo
 *  un total de 5 números por fila. Los números están mezclados con espacios en blanco. Aquí se pueden
 *  ganar premios de 2 formas diferentes, la primera de ellas es cuando consigues marcar todos los
 *  números que existen en cualquiera de las 3 líneas de un cartón. Este premio es llamado "línea".
 *  Por último el premio más importante es cuando se canta bingo, que consiste en haber tachado todos
 *  los números de un cartón.
 */

public class Bingo {
	private HashSet<Integer> bolasBombo;
	private HashSet<Integer> bolasFuera; //podría utilizarse solo un hashset
	private Random rand;
	
	public Bingo() {
		rand = new Random();
		bolasBombo=new HashSet<Integer>();
		bolasFuera=new HashSet<Integer>();
		
		for(int i=1;i<90;i++) bolasBombo.add(i);
	}
	
	private int bolaAleatoria() {
		int posAleatoria,bola = 0;
		
		posAleatoria=rand.nextInt(bolasBombo.size());
		
		Iterator<Integer> it=bolasBombo.iterator();
		for(int i=0;i<=posAleatoria;i++) bola=it.next();
		
		return bola;
	}
	
	public int saca() {
		int bola=bolaAleatoria();
		
		bolasBombo.remove(bola);
		bolasFuera.add(bola);
		
		return bola;
	}
	
	public boolean haSalido(int bola) {
		return bolasFuera.contains(bola);
	}
	
	public boolean quedanBolas() {
		return this.bolasBombo.size()>0;
	}
}
