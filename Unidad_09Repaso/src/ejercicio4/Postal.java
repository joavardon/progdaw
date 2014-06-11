package ejercicio4;
	
public interface Postal {
	double costeMinimo=2.30;
	double costeMinimo(double costeMinimo);
	String  enviar(String direccion);
	String entregado();
	double portes();
}
