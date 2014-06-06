package repaso;

import java.util.Arrays;
import java.util.Collections;

public class Eleccion {
	private int escaños;
	private Candidatura[]candidaturas=new Candidatura[3];
	private double[]votos=new double[3];
	
	Eleccion(Candidatura[]c,int e){
		this.candidaturas=c;
		this.escaños=e;
	}
	
	public void setVotos(String c,double v){
		for(int i=0;i<this.candidaturas.length;i++){
			if(this.candidaturas[i].getNombre().equals(c)){
				this.votos[i]=v;
			}
		}
	}
	
	void mostrarEscaños(){
		int[]coeficientes={2,2,2};
		int[]escaños={0,0,0};
		int indice=0;
		double[] copiaVotos = Arrays.copyOf(this.votos,3);
		double mayor=copiaVotos[0];
		for(int i=0;this.escaños>0;i++){
			for(int j=0;j<copiaVotos.length-1;j++){
				if(copiaVotos[j+1]>mayor){
					mayor=copiaVotos[j+1];
					indice=j+1;
				}
			}
			copiaVotos[indice]=this.votos[indice]/coeficientes[indice];
			coeficientes[indice]++;
			escaños[indice]++;
			this.escaños--;
			mayor=copiaVotos[0];
			indice=0;	
			
		}
		System.out.println("***************************************************");
		System.out.println("RESULTADO DE ELECCIONES: ");
		for(int i=0;i<escaños.length;i++){
			System.out.println(this.candidaturas[i].toString()+"\nTiene "+escaños[i]+" escaño(s).");
		}
	}
	//accesadores
	public int getEscaños() {
		return escaños;
	}

	public void setEscaños(int escaños) {
		this.escaños = escaños;
	}

	public Candidatura[] getCandidaturas() {
		return candidaturas;
	}

	public void setCandidaturas(Candidatura[] candidaturas) {
		this.candidaturas = candidaturas;
	}

	public double[] getVotos() {
		return votos;
	}

	

	

}
