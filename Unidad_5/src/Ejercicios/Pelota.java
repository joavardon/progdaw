package Ejercicios;

import graphics2.Ellipse;

public class Pelota {
	//Atributos
	double limite1=10;
	double limite2=10;
	double limite3=30;
	double limite4=30;
	Ellipse pelota=new Ellipse(limite1,limite2,limite3,limite4);
	
	 
	//Constructores
	
	Pelota(){
		 this.pelota=pelota;
	 }

	//Metodos
	public void setLimites(double i, double j, double k, double l) {
		this.limite1=i;
		this.limite2=j;
		this.limite3=k;
		this.limite4=l;
	}

	public void mueve() throws InterruptedException {
		double lim1 = 3;
		double lim2 = 4;
			while(true){
			pelota.translate(lim1,lim2);
			if((pelota.getX()>410)||pelota.getX()<10){lim1=-lim1;}
			if((pelota.getY()>410)||pelota.getY()<10){lim2=-lim2;}
			Thread.sleep(10);
			
			}
	}

	public  void dibuja() {
		this.pelota=pelota;
		//pelota.setColor();
		pelota.fill();
		pelota.draw();
	}

	
	 
}
