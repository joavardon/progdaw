/*
 * Una empresa de venta de smartphones y tablets por internet necesita mantener la base de datos de stock. Necesita crear las siguientes clases:

    Aparato, que contiene la información de cada aparato:
        Almacena el número de producto y número de serie del aparato (cadenas de texto),
         su nombre, sistema operativo (“Android 4.1”, “iOS 6”, “Windows Phone 8”, etc) y precio base.
    SmartPhone, que es un tipo de aparato:
        Debe tener además como atributo la tecnología de transmisión soportada, 
        que será una lista de cadenas, como por ejemplo [“GPRS”,”EDGE”,”HSDPA”].
    Tableta, que es otro tipo de aparato:
        Debe tener además como atributo las pulgadas de pantalla y su peso en gramos.

Tareas a realizar:

    Crear la clase Aparato, SmartPhone y Tableta. Deben incluir los atributos correspondientes, 
    constructores y métodos get/set básicos
    Añade el método toString() para poder mostrar el contenido de un objeto de cualquier clase.
    Añadir el método addTecnología en la clase SmartPhone que tome como parámetro una cadena con 
    el nombre de una tecnología inalámbrica y lo incluya en la lista de tecnologías soportada. 
    Debe ser independiente de mayúscular/minúsculas 
    y controlar que la misma tecnología no se repita.
    Como el precio puede variar, la clase Aparato tendrá definirá los métodos siguientes:
        precioPVP(). Devuelve el precio del artículo, sumándole un 10% de márgen después añadiendo el IVA.
        precioPVPRebajado(double rebaja). Se le pasa una rebaja, en tanto por ciento y devolverá 
        el precio final rebajado.

Aunque no está incluido en los ejercicios, deberás crear el código necesario para probar el buen 
funcionamiento de tu jerarquía de clases: crear un Array de aparatos, poblarlo con algunos ejemplos 
de SmartPhone y Tableta, vender y comprar (añadir o quitar de la lista). Esto se tendrá en cuenta 
como un apartado e).
 */

package mediaMac;

public class Aparato {
	private String numProd;
	private String numSer;
	private String sisOper;
	private String nombre;
	private double precioBase;
	
	Aparato(){
		
	}
	Aparato(String numProd,String numSer,String sisOper,String nombre,double precioBase){
		this.numProd=numProd;
		this.numSer=numSer;
		this.sisOper=sisOper;
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	public String getNumProd() {
		return numProd;
	}
	public void setNumProd(String numProd) {
		this.numProd = numProd;
	}
	public String getNumSer() {
		return numSer;
	}
	public void setNumSer(String numSer) {
		this.numSer = numSer;
	}
	public String getSisOper() {
		return sisOper;
	}
	public void setSisOper(String sisOper) {
		this.sisOper = sisOper;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String toString(){
		return getNumProd()+" "+getNumSer()+" "+getSisOper()+" "+getNombre()+" "+getPrecioBase();
	}
	public double PrecioPVP(){
		double precioPVP=this.precioBase+(this.precioBase*10)/100;
		return precioPVP;
	}
	
	public double PrecioPVPReb(double rebaja){
		double precioPVPReb=(this.precioBase+(this.precioBase*10)/100)-(this.precioBase*rebaja/100);
		return precioPVPReb;
	}
	
}
