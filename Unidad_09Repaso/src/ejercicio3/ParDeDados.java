package ejercicio3;

public class ParDeDados {
	private Dado dado1;
	private Dado dado2;
	
	ParDeDados(Dado d1, Dado d2){
		this.dado1=d1;
		this.dado2=d2;
	}
	
	public int getDados(){
		return this.dado1.getTirada()+this.dado2.getTirada();
	}
	public void tirar(){
		int aleatorio1=(int)(Math.random()*6+1);
		this.dado1.setTirada(aleatorio1);
		int aleatorio2=(int)(Math.random()*6+1);
		this.dado2.setTirada(aleatorio2);
	}

	public int getDado1() {
		return dado1.getTirada();
	}
	public int getDado2() {
		return dado2.getTirada();
	}
	public String toString(){
		return "dado1: "+dado1.toString()+" - dado2: "+dado2.toString()+" Suma: "+getDados();
	}
	
	
}
