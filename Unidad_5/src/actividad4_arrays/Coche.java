//La clase Coche tendrá los atributos privados modelo, matrícula, marca y color. 
//Crea los constructores que estimes necesarios, los get/set necesarios y el método toString().
package actividad4_arrays;

public class Coche {
	private String modelo;
	private String matricula;
	private String marca;
	private String color;
	
	Coche(String modelo,String matricula,String marca,String color ){
		this.modelo=modelo;
		this.matricula=matricula;
		this.marca=marca;
		this.color=color;
	}
	
	public String toString(){
		return "modelo "+modelo+" marca "+marca+" matricula "+matricula+" color "+color+"\n";
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
