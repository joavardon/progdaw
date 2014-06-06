package repaso;

import java.util.Arrays;
import java.util.Collections;

public class Eleccion {
	private int esca�os;
	private Candidatura[]candidaturas=new Candidatura[3];
	private double[]votos=new double[3];
	
	Eleccion(Candidatura[]c,int e){
		this.candidaturas=c;
		this.esca�os=e;
	}
	
	public void setVotos(String c,double v){
		for(int i=0;i<this.candidaturas.length;i++){
			if(this.candidaturas[i].getNombre().equals(c)){
				this.votos[i]=v;
			}
		}
	}
	
	void mostrarEsca�os(){
		int[]coeficientes={2,2,2};
		int[]esca�os={0,0,0};
		int indice=0;
		double[] copiaVotos = Arrays.copyOf(this.votos,3);
		double mayor=copiaVotos[0];
		for(int i=0;this.esca�os>0;i++){
			for(int j=0;j<copiaVotos.length-1;j++){
				if(copiaVotos[j+1]>mayor){
					mayor=copiaVotos[j+1];
					indice=j+1;
				}
			}
			copiaVotos[indice]=this.votos[indice]/coeficientes[indice];
			coeficientes[indice]++;
			esca�os[indice]++;
			this.esca�os--;
			mayor=copiaVotos[0];
			indice=0;	
			
		}
		System.out.println("***************************************************");
		System.out.println("RESULTADO DE ELECCIONES: ");
		for(int i=0;i<esca�os.length;i++){
			System.out.println(this.candidaturas[i].toString()+"\nTiene "+esca�os[i]+" esca�o(s).");
		}
	}
	//accesadores
	public int getEsca�os() {
		return esca�os;
	}

	public void setEsca�os(int esca�os) {
		this.esca�os = esca�os;
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
