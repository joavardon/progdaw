package ejercicio3;

public class PruebaLineaLog {

		public static void main(String[] args) throws InterruptedException {
			Log errores=new Log();
			errores.add("Comenzando el programa");
			Thread.sleep(3000);
			errores.add("Sigo el programa");
			Thread.sleep(3000);
			errores.add("Otro");
			Thread.sleep(3000);
			errores.add("Cerrando el programa");
			for(int i=0;i<errores.milog.size();i++){
				System.out.println(errores.getMilog().get(i));
			}
			
		}

}
