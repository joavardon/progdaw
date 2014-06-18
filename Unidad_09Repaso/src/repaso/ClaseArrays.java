package repaso;



	import java.util.Arrays;
	public class  ClaseArrays {
	 
	    public static void main(String[] args) {
	 
	        int num[]={8, 10, 15, 20, 21, 25, 30, 32, 40, 41};
	 
	        //Devuelve un 4
	        System.out.println("Metodo binarySearch: "+Arrays.binarySearch(num, 21));
	 
	        //Copia el array num hasta la quinta posicion, devuelve un array
	        int num2[]=Arrays.copyOf(num, 4);
	 
	        System.out.println("Metodo copyOf");
	        //Lo recorremos para ver que lo realiza correctamente
	        muestraArray(num2);
	 
	        //Copia el array num de la tercera hasta la septima posicion, devuelve un array
	        int num3[]=Arrays.copyOfRange(num, 2, 6);
	        
	        System.out.println("Metodo copyOfRange");
	        muestraArray(num3);
	        System.out.println("longitud de num3 es: "+num3.length);
	        System.out.println("Metodo equals");
	        System.out.println(Arrays.equals(num, num2));
	 
	        System.out.println("Metodo fill");
	        Arrays.fill(num3, 5);
	        muestraArray(num3);
	 
	        System.out.println("Metodo toString");
	        System.out.println(Arrays.toString(num));
	 
	    }
	 
	    public static void muestraArray(int num[]){
	        for (int i=0;i<num.length;i++){
	            System.out.println(num[i]);
	        }
	    }
	 
	

}
