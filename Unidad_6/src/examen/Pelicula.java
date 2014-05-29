package examen;


public class Pelicula {
	private String nombre;
	private String[] generos;
	private int tama�o;
	
	Pelicula(){
		
	}
	Pelicula(String n){
		this.nombre=n;
		this.tama�o=0;
		this.generos=new String[6];
	}
	
	public String toString(){
		return getNombre()+"("+getGeneros()+")";
	}
	
	public String getGeneros() {
		String cadena="";
		for(int i=0;i<tama�o;i++){
			if(i==tama�o-1){
				cadena=cadena+generos[i];}
			else{
				cadena=cadena+generos[i]+" / ";}
			}
		return cadena;
	}
	public void setGeneros(String genero) {
		this.generos[this.tama�o] = genero;
		this.tama�o++;}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
