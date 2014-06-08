package repaso;

import java.util.Arrays;

public class Examen {
	private String fecha;
	private Aspirante[] examen;
	private int[]fallosPermitidos;
	char[]grupos;
	Examen(String f,Aspirante[]e,int[]fallos,char[]g)
	{
		this.fecha=f;
		this.examen=e;
		this.fallosPermitidos=fallos;
		this.grupos=g;
	}
	
	public String toString(){
		String c="";
		for(int i=0;i<this.examen.length;i++){
			c=c+"\nAspirante: \n"+this.examen[i].getId();
		}
		return this.fecha+ " "+c;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Aspirante[] getExamen() {
		return examen;
	}
	public void setExamen(Aspirante[] examen) {
		this.examen = examen;
	}
	public int[] getFallosPermitidos() {
		return fallosPermitidos;
	}
	public void setFallosPermitidos(int[] fallosPermitidos) {
		this.fallosPermitidos = fallosPermitidos;
	}
	/*
	public String getGrupos(String c) {
		return c;
	}
	public String setGrupos(char grupos) {
		String c="";
		c=""+grupos;
		return c;
	}
*/
	
	public char getGrupo(int i) {
		return this.grupos[i];
	}
/*
	public void setTecTransm(String nueTec) {
		if (numTecnologias<10)
			tecTransm[numTecnologias++]=nueTec;
	}
*/	
	
	public void setGrupo(char[] grupos) {
		for(int i=0;i<grupos.length;i++)
			this.grupos[i] = new Character(grupos[i]);
	
	}
	
	
	
}
