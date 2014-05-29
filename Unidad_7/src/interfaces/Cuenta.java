/*
 * Crea la clase Cuenta, que tiene los siguientes atributos:
    nombre: nombre del cliente propietario.
    cuenta: n�mero de la cuenta (es una cadena).
    saldo: saldo en euros de la cuenta.
La clase Cuenta tambi�n tendr� los m�todos:
    get/set para los atributos nombre y cuenta.
    estado: devuelve el saldo de la cuenta.
    ingreso(cantidad): permite ingresar la cantidad de euros en la cuenta.
    reintegro(cantidad): permite sacar la cantidad de euros de la cuenta.
Crea una clase Banco, que mediante un men� permita operar con una cuenta y 
probar que tu anterior clase funciona.
Crea el interfaz Remunerada, que se define con los siguientes m�todos:
    asignarTipoInteres(tipo): asigna el tipo de interes de la cuenta.
    obtenerTipoInteres(): devuelve el tipo de interes de la cuenta.
    intereses(d�as): calcula los intereses producidos por la cuenta en el 
    n�mero de d�as especificado.
Haz que la clase Cuenta implemente esta interfaz. �tendr�s que a�adir alg�n 
atributo a la clase?
Amblia la clase Banco para cambiar el tipo de interes y tambi�n para aplicarle los intereses.
 */
package interfaces;

public class Cuenta implements Remunerada {
	private String nombre;
	private String numCuenta;
	private double saldo;
	double interes;
	
	
	Cuenta(String n,String c, double s){
		this.nombre=n;
		this.numCuenta=c;
		this.saldo=s;
		this.interes=0;
	}
	
	public double estado(){
		return saldo;
	}
	public void ingreso(double cantidad){
		saldo=saldo+cantidad;
	}
	public void reintegro(double cantidad){
		if(cantidad<=saldo){
		saldo=saldo-cantidad;}
		else{
			System.out.println("no hay suficiente dinero en la cuenta");
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public void asignarTipoInteres(double tipo) {
		this.interes=tipo;
	}


	public double obtenerTipoInteres() {
		return this.interes;
	}
	

	public double intereses(int dias) {
		return ((this.saldo*(this.interes/100))/365)*dias;
	}


}
