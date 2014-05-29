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

public class Ejercicio3 {
	public Ejercicio3(int l)
			throws
			Exception{
			if(l>6)
			throw new Exception("Longitud sobrepasada");
			}
	
	public static void main(String[] args) throws Exception {
		boolean correcta;
		
		String clave="";
		String clave2="";
		
		Scanner teclado=new Scanner(System.in);
		char[]min={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[]may={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		do{
				
				correcta=true;
				System.out.println("Introduce una clave: ");
				clave=teclado.next();
				
				if(clave.length()<=6){
						for(int i=0;i<clave.length();i++){
							int c=0;
							for(int j=0;j<min.length;j++){
								if((clave.charAt(i))==min[j]||clave.charAt(i)==may[j]||clave.charAt(i)=='0'
										||clave.charAt(i)=='1'||clave.charAt(i)=='2'||clave.charAt(i)=='3'
										||clave.charAt(i)=='4'||clave.charAt(i)=='5'||clave.charAt(i)=='6'
										||clave.charAt(i)=='7'||clave.charAt(i)=='8'||clave.charAt(i)=='9'){
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
						if(!correcta){ //comprobar que ademas sea de 6 carcteres
							System.out.println("Formato incorrecto, debe tener máximo 6 caracteres alfanuméricos");
							}
						else {
						System.out.println("vuelva a introducirla: ");
						clave2=teclado.next();
						}
				}
				else{
					System.out.println("Formato incorrecto, debe tener máximo 6 caracteres alfanuméricos");
					correcta=false;
				}
			
		}while(!correcta || !clave.equals(clave2));
			System.out.println("Clave OK. Proceso terminado");
		}

}
