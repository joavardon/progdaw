import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio3 {


	public static void main(String[] args) {
			double d;
			boolean hayerror;
			Scanner teclado=new Scanner (System.in);
			hayerror=false;
			do{
				System.out.println("Dame un numero: ");
			
				try{
					d=teclado.nextDouble();
					hayerror=false;
				}
				catch(InputMismatchException e){
					hayerror=true;
					teclado.nextLine();
				}
			}while(hayerror);//es como si fuera hayerror==true

	}

}
