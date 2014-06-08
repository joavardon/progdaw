/*
    Candidatura.
        Almacena el nombre del partido y la lista de candidatos (nombres completos).
        Un constructor permite pasarle esos datos para inicializarlo.
        El m�tod toString genera una cadena con el nombre del partido y la lista (numerada) de 
        sus candidatos, como aparecer�a en la papeleta.
        El m�todo equals() que permite identificar dos Candidaturas como iguales si el nombre del partido es el mismo.
        get/set de sus atributos.
        m�todo addCandidato al que pasamos el nombre del candidato y nos lo a�ade al final de 
        nuestra lista.

    Eleccion.
        Almacena el n�mero de esca�os que se reparten, la lista de las candidaturas y los votos que 
        ha obtenido cada una.
        Un constructor permite inicializar la lista de candidaturas y el n�mero de esca�os.
        Un m�todo setVotos(String,int) perimite poner los votos a la candidatura del partido que se 
        le pasa.
        un m�todo mostrarEsca�os imprime la lista de esca�os repartidos a cada candidatura siguiendo 
        la Ley D'Hondt. (�ste m�todo es para nota)


 */

package repaso;

import java.util.ArrayList;

public class Candidatura {
	
	private String nombre;
	private ArrayList<String>lista=new ArrayList();
	
	Candidatura(String n,ArrayList<String>l){
		this.nombre=n;
		this.lista=l;
	}
	public String toString(){
		String listaPartido="";
		for(int i=0;i<lista.size();i++){
			if(i==lista.size()-1){
				listaPartido=listaPartido+lista.get(i)+".";
			}
			else{
			listaPartido=listaPartido+lista.get(i)+"; ";
			}
		}
		return "Lista del "+getNombre()+":\n"+listaPartido; 
	}
	
	public void addCandidato(String nombre){
		this.lista.add(nombre);
	}
	
	public void igualNombre(String nombre){
		if(this.nombre.equals(nombre)){
			System.out.println("mismo nombre");
		}
		else{
			System.out.println("no mismo nombre");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatura other = (Candidatura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getLista() {
		return lista;
	}
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
}
