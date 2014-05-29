package actividad4;

public class PruebaComplejo {

	public static void main(String[] args) {
		Complejo c1=new Complejo(5,4);
		Complejo c2=new Complejo(1,-2);
		
		System.out.print("Operación de SUMA de los números complejos: "+ c1
				+ " - "+c2 +" = ");
		c1.Suma(c2);
		System.out.println(c1+"\n");
		System.out.print("Operación de DIVISION de los números complejos: "+ c1
				+ " - "+c2 +" = ");
		c1.Division(c2);
		System.out.println(c1+"\n");
		
	}

	

}
