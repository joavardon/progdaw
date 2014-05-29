/*Crea una clase con un m�todo est�tico millasAMetros que toma como par�metro de entrada 
un valor en millas marinas y las convierte a metros.
Una vez tengas este m�todo escribe otro millasAKilometros que realice la misma conversi�n, 
pero esta vez exprese el resultado en kil�metros.
Nota:1 milla marina equivale a 1852 metros. */             


package clases_paquetes_metodosestaticos;

public class MillasAMetros {
	private float millas;
	float metros;
	MillasAMetros(){

	}
	
	public static float MillasAMetros(float millas){
		return millas*1852;
	}
	
	public static float MillasAKilometros(float millas){
		return millas*1852/1000;
	}

	public float getMillas() {
		return millas;
	}

	public void setMillas(float millas) {
		this.millas = millas;
	}
}
