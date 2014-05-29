package mediaMac;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaMediaMac {
	
	public static void main(String[] args) {
		
		Aparato[]tienda=new Aparato[3];
		String[]conexiones={"3G","Wifi"};
		
		tienda[0]=new SmarthPhone("1", "2233Q", "WindowsPhone","NokiaLumia 520",140.0,conexiones);
		tienda[1]=new SmarthPhone("2", "2244Q", "Android","Samsumg GT-s5830",120.0,conexiones);
		tienda[2]=new Tableta("3", "2255Q", "Android","Motorola G",180.0,5,500);
		SmarthPhone s1=(SmarthPhone) tienda[0];
		//String tec="4G";
		//s1.addTecnología(tec);
		
		String[]conexiones2={"3G","Wifi","4g","bluetooth"};
		//s1.setTecTransm(conexiones2);
		SmarthPhone ej2=new SmarthPhone("5", "2563Q", "WindowsPhone","NokiaLumia 580",140.0,conexiones2);
		System.out.println("este es el ejemplo "+ej2.toString());
		ej2.setTecTransm(conexiones);
		System.out.println("este es el ejemplo dos"+ej2.toString());
		Aparato ej=new Tableta("4", "3355Q", "Android","Motorola X",350.0,5,500);
		
		for (int i=0;i<tienda.length;i++){
			System.out.println(tienda[i]);
		}
		System.out.println(tienda[1].PrecioPVP());
		System.out.println(tienda[1].PrecioPVPReb(10));
		tienda=comprar(tienda,ej);
		for (int i=0;i<tienda.length;i++){
			System.out.println(tienda[i]);
		}
		tienda=vender(tienda);
		for (int i=0;i<tienda.length;i++){
			System.out.println(tienda[i]);
		}
		
	}
	public static  Aparato[]comprar(Aparato[] ap,Aparato ej){
		Aparato[]prueba=Arrays.copyOf(ap, ap.length+1);
		prueba[ap.length]=ej;
		
		System.out.println("Añadido");
		return prueba;
		
	}
	public static Aparato[]vender(Aparato[] ap){
		Aparato[]prueba=ap;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero de producto a eliminar: ");
		String num=teclado.next();
		for(int i=0;i<prueba.length;i++){
			if(num.equals(prueba[i].getNumProd())){
			//	Aparato aux=prueba[i];
				prueba[i]=prueba[prueba.length-1];
			//	prueba[prueba.length-1]=aux;
				prueba=Arrays.copyOf(prueba, prueba.length-1);
				i--;
			}
		}

		return prueba;
	}
		
	
}
