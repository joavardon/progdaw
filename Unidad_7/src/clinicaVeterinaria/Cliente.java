package clinicaVeterinaria;

public class Cliente  {
	private String nombreCliente;
	private String direccion;
	Cliente(String nombreCliente,String direccion){
		this.nombreCliente=nombreCliente;
		this.direccion=direccion;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
