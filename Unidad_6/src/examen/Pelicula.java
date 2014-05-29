package examen;


public class Pelicula {
	private String nombre;
	private String[] generos;
	private int tamaño;
	
	Pelicula(){
		
	}
	Pelicula(String n){
		this.nombre=n;
		this.tamaño=0;
		this.generos=new String[6];
	}
	
	public String toString(){
		return getNombre()+"("+getGeneros()+")";
	}
	
	public String getGeneros() {
		String cadena="";
		for(int i=0;i<tamaño;i++){
			if(i==tamaño-1){
				cadena=cadena+generos[i];}
			else{
				cadena=cadena+generos[i]+" / ";}
			}
		return cadena;
	}
	public void setGeneros(String genero) {
		this.generos[this.tamaño] = genero;
		this.tamaño++;}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
