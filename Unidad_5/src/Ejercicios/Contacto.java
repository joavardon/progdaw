package Ejercicios;

public class Contacto {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String telFijo;
	private String telMovil;
	private String mail;
	
	Contacto(String Nombre,String Apellido1,String telMovil){
		this.nombre=Nombre;
		this.apellido1=Apellido1;
		this.telMovil=telMovil;
	}
	Contacto(String Nombre,String Apellido1,String Apellido2,String telMovil){
		this.nombre=Nombre;
		this.apellido1=Apellido1;
		this.apellido2=Apellido2;
		this.telMovil=telMovil;
	}
	Contacto(String Nombre,String Apellido1,String Apellido2,String Direccion,String telMovil,String telFijo,String mail){
		this.nombre=Nombre;
		this.apellido1=Apellido1;
		this.apellido2=Apellido2;
		this.telMovil=telMovil;
		this.direccion=Direccion;
		this.telFijo=telFijo;
		this.mail=mail;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}
	public String getTelMovil() {
		return telMovil;
	}
	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
