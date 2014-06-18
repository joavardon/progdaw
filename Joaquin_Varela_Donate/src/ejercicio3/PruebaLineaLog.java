package ejercicio3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PruebaLineaLog {

		public static void main(String[] args) throws InterruptedException {
			LineaLog l1=new LineaLog("Comenzando el programa");
			LineaLog l2=new LineaLog("#2","Aviso: la red no responde");
			Date d=new Date();
			String fecha=d.toString();
			LineaLog l3=new LineaLog("#3","Cerrando",fecha);
			Log errores=new Log();
			errores.add(l1);
			Thread.sleep(3000);
			errores.add(l2);
			Thread.sleep(3000);
			errores.add(l3);
			for(int i=0;i<errores.milog.size();i++){
				System.out.println(errores.milog.get(i).toString());
			}
			
		}

}
