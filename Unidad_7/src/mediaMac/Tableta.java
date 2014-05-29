package mediaMac;

public class Tableta extends Aparato{
	private double pulgadas;
	private double peso;
	Tableta(String numProd,String numSer,String sisOper,String nombre,double precioBase,double pulgadas, double peso){
		super (numProd, numSer, sisOper, nombre,precioBase);
			this.pulgadas=pulgadas;
			this.peso=peso;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String toString(){
		return super.toString()+" "+getPulgadas()+" "+getPeso();
	}
}
