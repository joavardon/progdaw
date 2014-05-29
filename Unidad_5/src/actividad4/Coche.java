package actividad4;

public class Coche {

		private String modelo;
		private String matricula;
		private String marca;
		private String color;
		
		Coche(String modelo,String matricula,String marca, String color){
			this.modelo=modelo;
			this.matricula=matricula;
			this.marca=marca;
			this.color=color;
			
		}
		//metodos
		public String toString(){
			return this.modelo+" "+this.matricula+" "+this.marca+" "+this.color;
		}
		//Accesadores

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
