package ejerciciosIniciales;

public class Rectangulo {
	private int alto, ancho;
	Rectangulo(int l, int a){
		if(l>0){
			this.alto=l;
		}
		else{
			this.alto=3;
		}
		if(a>0){
			this.ancho=a;
		}
		else{
			this.ancho=5;
		}
	}
	public int getLargo() {
		return alto;
	}
	public void setLargo(int largo) {
		this.alto = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int areaRectangulo(){
		int area=ancho*alto;
		return area;
	}
	public int perimetroRectaqngulo(){
		int perimetro=ancho*2+alto*2;
		return perimetro;
	}
	public void dibujaRectangulo(){
		for(int i=0;i<alto;i++){
			for(int j=0;j<ancho;j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void horizontalVertical(){
		if(ancho>alto){
			System.out.println("horizontal");
		}
		else if(alto>ancho){
			System.out.println("vertical");
		}
	}
}
