/*
 * Crea un programa que permita introducir una clave. La
clave debe tener al menos 6 caracteres (letras mayúsculas o
minúsculas o números). Si no es así debe volver a pedir la clave.
Una vez introducida una clave buena, debe pedir reintroducir la
clave y comprobar que es la misma. Si este último paso falla se
vuelve a comenzar el proceso
 */
package simulando_simulacro;

import java.util.Scanner;

public class Ejercicio3_2 {
	 
     public static char[] introducirClave(){//meter clave y comprobar que sea <= 6
    	 int tamañoInicial = 6;
  	   int tamañoFinal;
  	 char[] clavechar=new char[tamañoInicial];
    	 char[] clavecharSalida;
    	 try{
    		String clave="";
    		Scanner teclado=new Scanner(System.in);
    		System.out.print("Introduzca una clave: ");
            clave=teclado.next();
             
             for(int i=0;i<clave.length();i++){
            	 clavechar[i]=clave.charAt(i);
             }
             
             
           tamañoFinal=clave.length();
            	
            clavecharSalida= new char[tamañoFinal];
            for (int i=0; i<tamañoFinal; i++){
            	 clavecharSalida[i]=clavechar[i];
            	}
    	 }
    	 catch(StringIndexOutOfBoundsException ei){//si la clave introducida es mayor que el tamaño inicial del array, es decir, 6
				throw ei;
    	 }
		return clavecharSalida;	
     }
     public static boolean comprobarCadena(char[] clave,boolean cl) {//comprueba que sean los caracteres correctos
    	 		boolean correcta=cl;
            	char[]min={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     			char[]may={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
 				for(int i=0;i<clave.length;i++){
 					int c=0;	
 					for(int j=0;j<min.length;j++){
 						if(clave[i]==min[j]||clave[i]==may[j]||clave[i]=='0'
 						||clave[i]=='1'||clave[i]=='2'||clave[i]=='3'
 						||clave[i]=='4'||clave[i]=='5'||clave[i]=='6'
 						||clave[i]=='7'||clave[i]=='8'||clave[i]=='9'){
 						c++;
 							if(c==1){
 								break;
 								}
 							
 						}
 					}
 							//si un caracter de la cadena de los que vamos probando no esta en los 
 							//valores disponibles (si c<1) salimos del bucle for con valor false 
 							//pues ya no va ser correcta esa cadena
 							//al tener algun caracter no disponible(ej:#,~,@)
 					
 					if(c<1){
 						correcta=false;
 						break;
 						}
 					
                 }
                     
 			return correcta;
     }
	public static String pasarACadena(char[]c){//paso de array de char a cadenas para poder comparar que sean iguales???
		String cadena="";
		for(int i=0;i<c.length;i++){
       	 cadena=cadena+c[i];
        }
		return cadena;
		
	}
	public static void main(String[] args)  {
		char[] clave ;
		char[] clave2;
        boolean correcta;
        String c1;
        String c2;
		do{
			correcta=true;
			clave=new char[6];
			clave2=new char[6];
			c1="";
			c2="";
			try{
				clave=introducirClave();
                correcta=comprobarCadena(clave,correcta);
				if(!correcta){ 
						System.out.println("Formato incorrecto, debe tener máximo 6 caracteres alfanuméricos");
						}
				else {
					System.out.println("Vuelva a introducirla para comprobar que es la misma: ");
					clave2=introducirClave();
					correcta=comprobarCadena(clave2,correcta);
					if(!correcta){ 
						System.out.println("Formato incorrecto, debe tener máximo 6 caracteres alfanuméricos");
						}
					else{
					c1=pasarACadena(clave);
					c2=pasarACadena(clave2);}
					}	
				
			}catch(Exception ei){
				System.out.println("ERROR.Más de 6 caracteres");
				correcta=false;
			}
		}while(!correcta || !c1.equals(c2));
		System.out.println("Clave OK. Proceso terminado");
		}

}
