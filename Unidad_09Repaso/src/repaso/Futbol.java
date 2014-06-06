package repaso;

public class Futbol extends Deporte {
	int[]goles=new int[2];
	String local;
	String visitante;
	public Futbol() {
		super("Futbol",2,11);
		for(int i=0;i<2;i++){
			this.goles[i]=0;
		}
		this.local="Real Madrid";
		this.visitante="Atletico";
	}
	
	public void marcarGol(int equipo){
		this.goles[equipo]++;
	}

	public String toString(){
		
		return this.local+ " "+ this.goles[0]+"-"+this.visitante+" "+this.goles[1];
		
	}

	
		
		
		
}


