/*
 * Una empresa de venta de smartphones y tablets por internet necesita mantener la base de datos de stock. Necesita crear las siguientes clases:

    Aparato, que contiene la informaci�n de cada aparato:
        Almacena el n�mero de producto y n�mero de serie del aparato (cadenas de texto),
         su nombre, sistema operativo (�Android 4.1�, �iOS 6�, �Windows Phone 8�, etc) y precio base.
    SmartPhone, que es un tipo de aparato:
        Debe tener adem�s como atributo la tecnolog�a de transmisi�n soportada, 
        que ser� una lista de cadenas, como por ejemplo [�GPRS�,�EDGE�,�HSDPA�].
    Tableta, que es otro tipo de aparato:
        Debe tener adem�s como atributo las pulgadas de pantalla y su peso en gramos.

Tareas a realizar:

    Crear la clase Aparato, SmartPhone y Tableta. Deben incluir los atributos correspondientes, 
    constructores y m�todos get/set b�sicos
    A�ade el m�todo toString() para poder mostrar el contenido de un objeto de cualquier clase.
    A�adir el m�todo addTecnolog�a en la clase SmartPhone que tome como par�metro una cadena con 
    el nombre de una tecnolog�a inal�mbrica y lo incluya en la lista de tecnolog�as soportada. 
    Debe ser independiente de may�scular/min�sculas 
    y controlar que la misma tecnolog�a no se repita.
    Como el precio puede variar, la clase Aparato tendr� definir� los m�todos siguientes:
        precioPVP(). Devuelve el precio del art�culo, sum�ndole un 10% de m�rgen despu�s a�adiendo el IVA.
        precioPVPRebajado(double rebaja). Se le pasa una rebaja, en tanto por ciento y devolver� 
        el precio final rebajado.

Aunque no est� incluido en los ejercicios, deber�s crear el c�digo necesario para probar el buen 
funcionamiento de tu jerarqu�a de clases: crear un Array de aparatos, poblarlo con algunos ejemplos 
de SmartPhone y Tableta, vender y comprar (a�adir o quitar de la lista). Esto se tendr� en cuenta 
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
