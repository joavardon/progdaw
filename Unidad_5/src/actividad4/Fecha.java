/*A�ade la comprobaci�n de errores en los valores de inicializaci�n de a�o. 
A�ade un m�todo llamado siguienteD�a para incrementar el d�a en uno. 
El objeto fecha siempre tendr� un valor con sentido. 
Escribe un programa para probar el funcionamiento del m�todo, 
para lo que imprimir� la secuencia de varios d�as en los que cambie el mes y el a�o.*/

package actividad4;
public class Fecha 
{
   private int mes; // 1-12
   private int dia;   // 1-31 con base en el mes
   private int anio;  // cualquier a�o

   private static final int[] diasPorMes = // d�as en cada mes  
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
   // llama a comprobarDia para confirmar el valor apropiado para el d�a
   public Fecha( int elMes, int elDia, int elAnio )
   {
      mes = comprobarMes( elMes ); // valida el mes
      anio = comprobarAnio( elAnio ); // pudo validar el a�o
      dia = comprobarDia( elDia ); // valida el d�a

      System.out.printf( 
         "Constructor de objeto Fecha para la fecha %s\n", this );
   } // fin del constructor de Fecha



// m�todo utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
         return mesPrueba;
      else // mes es inv�lido
         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
   } // fin del m�todo comprobarMes

   // m�todo utilitario para confirmar el valor apropiado del d�a, con base en el mes y el a�o
   private int comprobarDia( int diaPrueba )
   {
      // comprueba si el d�a est� dentro del rango para el mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;

      // comprueba si es a�o bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;

      throw new IllegalArgumentException(
         "dia fuera de rango para el mes y anio especificados" );
   } // fin del m�todo comprobarDia
   private int comprobarAnio(int anioPrueba)
   {
	if(anioPrueba>2013)
	return anioPrueba;
	throw new IllegalArgumentException(
	         "a�o inv�lido" );
      
   }
   public  void siguienteDia(int diaactual,int mesactual,int anioactual){
	   int diasiguiente=diaactual+1;
	   //comprobarDia(diasiguiente);
	   
		   
	   if((diasiguiente==32)){
		   diasiguiente=1;
		   mesactual=mesactual+1;
		   	if(mesactual==13){
		   		mesactual=1;
		   		anioactual=anioactual+1;
		   	}
	   }
	   else if(diasPorMes[mesactual]==30 && (diasiguiente==31)){
		   diasiguiente=1;
		   mesactual=mesactual+1;
	   }
	   else if(diasPorMes[mesactual]==28 && diasiguiente==29&& !( anioactual % 400 == 0 || 
	           ( anioactual % 4 == 0 && anioactual % 100 != 0 ) )){
		   diasiguiente=1;
		   mesactual=mesactual+1;
	   }
	   else if((diaactual==28 && mesactual==2 && diasiguiente == 29 && ( anioactual % 400 == 0 || 
	           ( anioactual % 4 == 0 && anioactual % 100 != 0 ) ))){
		   diasiguiente=29;
	   }
	   else if((diaactual==29 && mesactual==2 && ( anioactual % 400 == 0 || 
	           ( anioactual % 4 == 0 && anioactual % 100 != 0 ) ))){
		   diasiguiente=1;
		   mesactual=mesactual+1;
	   }
	   this.dia=diasiguiente;
	   this.mes=mesactual;
	   this.anio=anioactual;
   
   }
   	
   // devuelve un objeto String de la forma mes/dia/anio
   public String toString()
   { 
      return String.format( "%d/%d/%d", mes, dia, anio ); 
   } // fin del m�todo toString



public int getDia() {
	return dia;
}



public void setDia(int dia) {
	this.dia = dia;
}



public int getMes() {
	return mes;
}



public void setMes(int mes) {
	this.mes = mes;
}



public int getAnio() {
	return anio;
}



public void setAnio(int anio) {
	this.anio = anio;
}
} // fin de la clase Fecha