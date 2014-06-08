package ejemplos;

public class PolimorfismoPuntos {

	public static void main(String[] args) {
		PuntoP[] puntos;
		
		puntos=new PuntoP[3];
		
		puntos[0]=new PuntoP();
		
		PuntoP3D p=new PuntoP3D();
		p.setZ(34);
		//a pesar de ser un array de PuntoP por el polimorfismo permite un meter un Punto3D
		puntos[1]=p;
		((PuntoP3D)puntos[1]).setZ(4);//para modificar sus atributos con set hay que poner el cast de la clase que sea
		puntos[2]=new PuntoP();
		
		
		for(int i=0;i<3;i++) System.out.println(puntos[i]);
	}
	
}
