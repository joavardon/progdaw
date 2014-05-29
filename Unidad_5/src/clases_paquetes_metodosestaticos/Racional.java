/*numerosracionalesclase racional
clase Racional

Constructores:
1por defecto vale 1/1
2con los valores que le pase por parametro

Metodps:

get y set oportunos
static Racional.sumar(Racional a, Racional b)
miNumero.sumar(Racional otro)
restar 
multiplicar
dividir
to String()-----cadena "1/2"
toFloatString() "0.5"

Método privado
 simplificar() tiene que reducir el mcd (27/9)---->(3/1)
Clase para probarlo: leer dos numeros racionales, mostrar
um menu para (sumar/restar/mult/dividir), hacer la operación y mostrarla.*/

package clases_paquetes_metodosestaticos;

public class Racional {
	
	//private double numero;
	private int dividendo;
	private int divisor;
	//Constructores
	Racional(){
		//this.numero=this.dividendo/this.divisor;
		this.dividendo=1;
		this.divisor=1;
		
	}
	Racional(int ddo,int dsor ){
	
		this.dividendo=ddo;
		this.divisor=dsor;
		
	}
	
	//metodos
	
	static Racional Suma(Racional a, Racional b){
		
		int dividendo=a.getDividendo()*b.getDivisor()+b.getDividendo()*a.getDivisor();
		int divisor=a.getDivisor()*b.getDivisor();
		Racional rac=new Racional(dividendo,divisor);
		return	rac.simplificar();
	}
	static Racional Resta(Racional a, Racional b){
		
		int dividendo=a.getDividendo()*b.getDivisor()- b.getDividendo()*a.getDivisor();
		int divisor=a.getDivisor()*b.getDivisor();
		Racional rac=new Racional(dividendo,divisor);
		return	rac.simplificar();
	}
	static Racional Multiplicacion(Racional a, Racional b){
		
		int dividendo=a.getDividendo()*b.getDividendo();
		int divisor=b.getDivisor()*a.getDivisor();
		Racional rac=new Racional(dividendo,divisor);
		return	rac.simplificar();
	}
	static Racional Division(Racional a, Racional b){
		
		int dividendo=a.getDividendo()*b.getDivisor();
		int divisor=b.getDividendo()*a.getDivisor();
		Racional rac=new Racional(dividendo,divisor);
		return	rac.simplificar();
	}
		Racional Suma(Racional a){
		int num,den;
		num=this.dividendo*a.getDivisor()+a.getDividendo()*this.divisor;
		den=this.divisor*a.getDivisor();
		Racional rac=new Racional(num,den);
		return	rac.simplificar();
		
	}
		Racional Resta(Racional a){
		int num,den;
		num=a.getDividendo()*divisor-dividendo*a.getDivisor();
		den=a.getDivisor()*divisor;
		Racional rac=new Racional(num,den);
		return	rac.simplificar();
		
	}
		Racional Multiplicacion(Racional a){
		int num,den;
		num=a.getDividendo()*dividendo;
		den=divisor*a.getDivisor();
		Racional rac=new Racional(num,den);
		return	simplificar();
		
	}
		Racional Division(Racional a){
		int num,den;
		num=a.getDividendo()* divisor;
		den=dividendo*a.getDivisor();
		Racional rac=new Racional(num,den);
		return	rac.simplificar();
		
	}
	public String toString(){
		return this.dividendo+"/"+this.divisor;	
	}
	public String toFloatString(){
		
		return "\n"+ (float)this.dividendo/(float)this.divisor;
		
	}
	private int mcd(int dividendo,int divisor){
	     int u=Math.abs(dividendo);
	     int v=Math.abs(divisor);
	     if(v==0){
	          return u;
	     }
	     int r;
	     while(v!=0){
	          r=u%v;
	          u=v;
	          v=r;
	     }
	    // System.out.println(u+" es el MCD de "+dividendo+" y "+divisor);
	     return u;
	  }
	private  Racional simplificar(){
		Racional racional=new Racional(this.dividendo,this.divisor);
		
		 int dividir=mcd(racional.getDividendo(),racional.getDivisor());
	     dividendo/=dividir;
	     divisor/=dividir;
		
		racional=new Racional(dividendo,divisor);
		return racional;
	}
	//accesadores
	
	public int getDividendo() {
		return dividendo;
	}
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}
	public int getDivisor() {
		return divisor;
	}
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	
	
	
	
}
