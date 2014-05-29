package Ejercicios;

import java.util.Scanner;

public class Cuenta {
private float saldo;
private int movimientos;
private String numcuenta;//no set, se inizializa con constructores
public Cuenta(){
	
}
public Cuenta(String numcuenta){
	this.numcuenta=numcuenta;
	this.saldo=0;
	this.movimientos=0;
}
public Cuenta(String numcuenta,float saldo_inicial){
	this.numcuenta=numcuenta;
	this.saldo=saldo_inicial;
	this.movimientos=1;
}
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void mostrarSaldo(Cuenta cuenta){
		System.out.println("Tu saldo es "+cuenta.getSaldo());
	}

	public void quitarDinero(Cuenta cuenta){
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuanto retiras?");
		float retirar=teclado.nextFloat();
		this.saldo=saldo-retirar;
		if(cuenta.getSaldo()>=0){
			this.saldo=saldo;
			movimientos++;
			}
		else{
			System.out.println("No puede sacar esa cantidad. Operación denegada.");
		
			this.saldo=saldo+retirar;
			System.out.println("Tu saldo actual es "+this.saldo);
			}
	
}
	public void meterDinero(Cuenta cuenta){
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuanto metes?");
		float retirar=teclado.nextFloat();
		this.saldo=saldo+retirar;
		movimientos++;
	}
	
	public int getMovimientos() {
		return movimientos;
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void verNumero(Cuenta cuenta1) {
		cuenta1.getNumcuenta();
		
	}

	




}
