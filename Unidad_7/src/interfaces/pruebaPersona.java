package interfaces;

public class pruebaPersona {

	public static void main(String[] args) {
		Cliente c1=new Cliente();
		c1.dni="03456789O";
		c1.nombre="Juan";
		c1.apellido="Sanchez";
		c1.visualizarDatos();
		c1.pedirDatos();
		c1.visualizarDatos();
		
	}

}
