package repaso;


public class Modulo {
	String nombremod;
	float nota1;
	float nota2;
	float nota3;
	
	Modulo(){
	
	}
	
	Modulo(String n){
		this.nombremod=n;
		this.nota1=0;
		this.nota2=0;
		this.nota3=0;
	}
	
	public float nota_Media(){
		return ((this.nota1+this.nota2+this.nota3)/3);	
	}
	public String toString(){
		return "\nNombre del modulo: "+this.nombremod+",Nota1: "+this.nota1+", Nota2: "+this.nota2+", Nota3: "+this.nota3;
	}
	
	//getters and setters
	
	public String getNombremod() {
		return nombremod;
	}

	public void setNombremod(String nombremod) {
		this.nombremod = nombremod;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombremod == null) ? 0 : nombremod.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modulo other = (Modulo) obj;
		if (nombremod == null) {
			if (other.nombremod != null)
				return false;
		} else if (!nombremod.equals(other.nombremod))
			return false;
		return true;
	}
	

	

}
