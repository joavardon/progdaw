/*Crea la clase peso, la cual tendrá las siguientes características:

    Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
    En el constructor se le pasará el peso y la medida en la qué se ha tomado ‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
    Deberá tener los siguientes métodos:
        getLibras. Devuelve el peso en libras.
        getLingotes. Devuelve el peso en lingotes.
        getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb' para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K' para kilos, ‘G’ para gramos y ‘Q’ para quintales).
    Para la realización del ejercicio toma como referencia los siguientes datos: 1 Libra = 16 onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg. 1 Onza = 0,0625 libras = 28,35 gramos. 1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
*/
package clases_paquetes_metodosestaticos;

public class Peso {
	
	
	private float kilogramos;
	
	Peso(float peso,String medida){
		switch (medida.toLowerCase() ){
		case ("lb"):
			kilogramos = (float) (peso * 0.453) ;
			break;
		
		case ("li"):
			kilogramos = (float) (peso * 14.592) ; 
			break;
			
		case ("oz"):
			kilogramos = (float) (peso / 35.274) ;
			break;
		
		case ("p"):
			kilogramos = (float) (peso * 0.015592) ;
			break;
		
		case ("k"):
			kilogramos = peso;
			break;
		
		case ("g"):
			kilogramos = peso / 1000 ;
			break;
		
		case ("q"):
			kilogramos = (float) (peso * 45.359) ;
			break;
		}
	}
	
	public float getLibras(){
		return (float) (kilogramos/0.453);
	}
	public float getLingotes(){
		return (float) (kilogramos/14.59);
	}
	public float getPeso(String medida){
		float peso = 0;
		if(medida.equalsIgnoreCase("Lb")){
			peso= (float) (kilogramos/0.453);
			
		}
		else if(medida.equalsIgnoreCase("Li")){
			peso=  (float) (kilogramos/14.59);
		
		}
		else if(medida.equalsIgnoreCase("Oz")){
			peso=  (float) (kilogramos/0.028);
			
		}
		else if(medida.equalsIgnoreCase("P")){
			peso= (float) (kilogramos/0.00155);
			
		}
		else if(medida.equalsIgnoreCase("K")){
			peso=  kilogramos;
			
		}
		else if(medida.equalsIgnoreCase("G")){
			peso=  (kilogramos/1000);
			
		}
		else if(medida.equalsIgnoreCase("Q")){
			peso= (float) (kilogramos/43.3);
			
		}
		else{
			System.out.println("Error en la medida indicada");
		}
		return peso;
	}
}
