package repaso;

public class ParadaLibre extends Parada{
	private String tipo="libre";
		ParadaLibre(String nombre,String horaBajada,String horaSubida){
			super(nombre,horaBajada,horaSubida);
		}
		
		public String toString(){
			return super.toString();
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}
